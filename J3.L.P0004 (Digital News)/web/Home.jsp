<%-- 
    Document   : Home
    Created on : Feb 23, 2021, 5:00:20 PM
    Author     : Minh La Anhihi
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Digital News</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <c:if test="${not empty message}">
                        <div class="warning">
                            ${message}
                        </div>
                    </c:if>
                    <c:if test="${empty message}">
                        <div class="tittle">
                            ${lastestNews.title}
                        </div>
                        <div class="image">
                            <img src="${imgPath}${lastestNews.imageName}"/>
                        </div>
                        <div class="news-content">
                            <div class="text">
                                ${lastestNews.description}
                            </div>
                        </div>
                        <div class="signature">
                            <div class="icon1"></div>
                            <div class="icon2"></div>
                            By ${lastestNews.author} | ${lastestNews.dateConvert}
                        </div>
                    </c:if>
                </div>
                <div class="right">
                    <jsp:include page="Right.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
