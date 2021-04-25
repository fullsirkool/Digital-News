<%-- 
    Document   : Detail
    Created on : Feb 25, 2021, 10:03:51 PM
    Author     : Minh La Anhihi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Detail</title>
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
                            ${news.title}
                        </div>
                        <div class="image">
                            <img src="${imgPath}${news.imageName}"/>
                        </div>
                        <div class="news-content">
                            <div class="text">
                                ${news.description}
                            </div>
                        </div>
                        <div class="signature">
                            <div class="icon1"></div>
                            <div class="icon2"></div>
                            By ${news.author} | ${news.dateConvert}
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
