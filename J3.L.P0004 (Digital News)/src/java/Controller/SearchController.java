/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Context.InforContext;
import DAO.DAONews;
import Entity.News;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Minh La Anhihi
 */
public class SearchController extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DAONews daoNews = new DAONews();
            //searching word
            String searchString = request.getParameter("searchText");
            if (searchString == null || searchString.equals("")) {
                request.setAttribute("message", "Empty Search Text!");
                request.getRequestDispatcher("Search.jsp").forward(request, response);
            } else {

                String imgPath = new InforContext().getImgPath();
                //image path
                request.setAttribute("imgPath", imgPath);

                //last 5 articles
                List<News> topNews = daoNews.getTop5LatestNews();
                request.setAttribute("topNews", topNews);

                //lastest acrticle
                News lastestNews = daoNews.getLastestNews();
                request.setAttribute("lastestNews", lastestNews);

                //get page index
                int pageIndex = 0;
                //assign 1 to pageIndex when start searching first times
                if (request.getParameter("pageIndex") != null) {
                    try {
                        pageIndex = Integer.parseInt(request.getParameter("pageIndex"));

                    } catch (NumberFormatException e) {
                        //index page is letter or null
                        request.setAttribute("message", "Wrong format Page Index");
                    }
                } else {
                    pageIndex = 1;
                }
                int pageSize = 4;

                //count number of new start with search word
                int totalSearchedNews = daoNews.getTotalSearchNews(searchString);

                //is exsist at least 1 news found
                if (totalSearchedNews > 0) {

                    int totalPage;
                    if (totalSearchedNews % pageSize != 0) {
                        totalPage = (totalSearchedNews / pageSize) + 1;
                    } else {
                        totalPage = totalSearchedNews / pageSize;
                    }

                    //index page less or equal than totalPage and exist at least 1 news found
                    if (pageIndex <= totalPage && pageIndex >= 1) {
                        //list search news
                        List<News> listSearchNews = daoNews.getNewsByKeyWord(searchString, pageIndex, pageSize);
                        request.setAttribute("listNews", listSearchNews);

                        //re send searchText to search page
                        request.setAttribute("searchText", searchString);

                        //send valid page index and maximum page to search page
                        request.setAttribute("pageIndex", pageIndex);
                        request.setAttribute("totalPage", totalPage);
                    } else {
                        request.setAttribute("message", "Page Index out of range");
                    }
                } else {
                    request.setAttribute("message", "Not Found!");
                }
                request.getRequestDispatcher("Search.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            //redirect to error page
            response.sendRedirect("Error.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
