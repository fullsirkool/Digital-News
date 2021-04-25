/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.InforContext;
import Entity.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh La Anhihi
 */
public class DAONews {
    
    //get 5 lastest news
    public List<News> getTop5LatestNews() throws Exception {
        //get config information
        InforContext context = new InforContext();
        //declare list news
        List<News> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        //query
        String query = "select top(5) * from News order by timepost desc";
        try {
            //send a request to open connection
            connection = context.getConnection();
            pre = connection.prepareStatement(query);
            rs = pre.executeQuery();
            while (rs.next()) {
                //declare and assign value to news
                News news = new News();
                news.setId(rs.getInt("ID"));
                news.setTitle(rs.getString("title"));
                news.setDescription(rs.getString("description"));
                news.setShortDescription(rs.getString("shortDescription"));
                news.setAuthor(rs.getString("author"));
                news.setImageName(rs.getString("image"));
                news.setPostTime(rs.getTimestamp("timepost"));
                //add news to list
                list.add(news);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            context.closeConnection(rs, pre, connection);
        }
        return list;
    }

    //get list news by searched key words
    public List<News> getNewsByKeyWord(String searchText, int pageIndex, int pageSize) throws Exception {
        //get config information
        InforContext context = new InforContext();
        //declare list news
        List<News> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        //begin row index
        int begin = (pageIndex - 1) * pageSize + 1;
        //end row index
        int end = pageIndex * pageSize;
        //query
        String query = "WITH R AS ("
                + "SELECT ROW_NUMBER() OVER (ORDER BY timepost desc) AS rowNumber, * FROM News where title like ?"
                + ")"
                + "SELECT * FROM R WHERE rowNumber BETWEEN ? AND ?";
        try {
            //send a request to open connection
            connection = context.getConnection();
            pre = connection.prepareStatement(query);
            pre.setString(1, searchText + "%");
            pre.setInt(2, begin);
            pre.setInt(3, end);
            rs = pre.executeQuery();
            while (rs.next()) {
                //declare and assign news
                News news = new News();
                news.setId(rs.getInt("ID"));
                news.setTitle(rs.getString("title"));
                news.setDescription(rs.getString("description"));
                news.setShortDescription(rs.getString("shortDescription"));
                news.setAuthor(rs.getString("author"));
                news.setImageName(rs.getString("image"));
                news.setPostTime(rs.getTimestamp("timepost"));
                //add to list
                list.add(news);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            context.closeConnection(rs, pre, connection);
        }

        return list;
    }

    //get lastest news
    public News getLastestNews() throws Exception {
        //get config information
        InforContext context = new InforContext();
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        String query = "select top(1) * from News order by timepost desc";
        try {
            //send a request to open connection
            connection = context.getConnection();
            pre = connection.prepareStatement(query);
            rs = pre.executeQuery();
            while (rs.next()) {
                //declare and assign value to news
                News news = new News();
                news.setTitle(rs.getString("title"));
                news.setDescription(rs.getString("description"));
                news.setShortDescription(rs.getString("shortDescription"));
                news.setAuthor(rs.getString("author"));
                news.setImageName(rs.getString("image"));
                news.setPostTime(rs.getTimestamp("timepost"));
                return news;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            context.closeConnection(rs, pre, connection);
        }
        return null;
    }

    //get news by id(primary key)
    public News getNewsByID(int id) throws Exception {
        //get config information
        InforContext context = new InforContext();
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        //query
        String query = "select * from News where ID = ?";
        try {
            //send a request to open connection
            connection = context.getConnection();
            pre = connection.prepareStatement(query);
            pre.setInt(1, id);
            rs = pre.executeQuery();
            while (rs.next()) {
                //declare and assign value to news
                News news = new News();
                news.setTitle(rs.getString("title"));
                news.setDescription(rs.getString("description"));
                news.setShortDescription(rs.getString("shortDescription"));
                news.setAuthor(rs.getString("author"));
                news.setImageName(rs.getString("image"));
                news.setPostTime(rs.getTimestamp("timepost"));
                return news;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            context.closeConnection(rs, pre, connection);
        }
        return null;
    }

    //count total news searched by keywords
    public int getTotalSearchNews(String searchText) throws Exception {
        //get config information
        InforContext context = new InforContext();
        int numberOfNews = 0;
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        //query
        String query = "select count(*) as [newsNumber] from News where title like ?";
        try {
            //send a request to open connection
            connection = context.getConnection();
            pre = connection.prepareStatement(query);
            pre.setString(1, searchText + "%");
            rs = pre.executeQuery();
            while (rs.next()) {
                //assign counted news to numberOfNews
                numberOfNews = rs.getInt("newsNumber");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            context.closeConnection(rs, pre, connection);
        }
        //return counted news
        return numberOfNews;
    }

}
