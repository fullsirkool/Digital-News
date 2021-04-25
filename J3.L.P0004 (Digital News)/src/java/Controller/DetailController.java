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
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Minh La Anhihi
 */
public class DetailController extends HttpServlet {

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
        DAONews daoNews = new DAONews();

        try {
            //image path
            String imgPath = new InforContext().getImgPath();
            request.setAttribute("imgPath", imgPath);

            //last 5 articles
            List<News> topNews = daoNews.getTop5LatestNews();
            request.setAttribute("topNews", topNews);

            //lastest acrticle
            News lastestNews = daoNews.getLastestNews();
            request.setAttribute("lastestNews", lastestNews);

            int newsId = 0;
            try {
                newsId = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException e) {
                //Send wrong id format!
                request.setAttribute("message", "Wrong format id!");
            }

            if (newsId > 0) {
                //acrticle
                News news = daoNews.getNewsByID(newsId);
                if (news != null) {
                    request.setAttribute("news", news);
                } else {
                    request.setAttribute("message", "News not found!");
                }
            } else {
                request.setAttribute("message", "Index Page out of range!");
            }

            request.getRequestDispatcher("Detail.jsp").forward(request, response);

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
