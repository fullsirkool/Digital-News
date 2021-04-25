<%-- 
    Document   : Right
    Created on : Feb 23, 2021, 5:08:12 PM
    Author     : Minh La Anhihi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/right.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>

        <div class="right-box">
            <div class="tittle">
                Digital News
            </div>
            <div class="text">
                ${lastestNews.shortDescription}
            </div>
        </div>
        <div class="right-box">
            <div class="tittle">
                Search
            </div>
            <form action="Search" method="get">
                <input class="search-field" type="text" name="searchText" required>
                <button type="submit" class="search-Button">Go</button>
            </form>                        
        </div>
        <div class="right-box">
            <div class="tittle">
                Last Articles<br>
            </div>
            <c:forEach items="${topNews}" var="news">
                <div class="text last-Articles">
                    <a href="Detail?id=${news.id}">${news.title}</a>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
