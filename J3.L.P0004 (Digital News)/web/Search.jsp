<%-- 
    Document   : Search
    Created on : Feb 23, 2021, 6:09:43 PM
    Author     : Minh La Anhihi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/search.css" rel="stylesheet" type="text/css"/>
        <title>Search</title>
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
                    <c:forEach items="${listNews}" var="news">
                        <a href="Detail?id=${news.id}">
                            <div class="search-news">
                                <div class="tittle">
                                    ${news.title}
                                </div>
                                <div class="news-infor">
                                    <div class="searched-image">
                                        <img src="${imgPath}${news.imageName}"/>
                                    </div>
                                    <div class="text">
                                        ${news.shortDescription}
                                    </div>
                                </div>
                            </div>
                        </a>
                    </c:forEach>
                    <div class="paging">
                        <c:forEach begin="1" end="${totalPage}" var="page">
                            <a class="${page == pageIndex ? 'active' : ''}" href="Search?searchText=${searchText}&pageIndex=${page}">${page}</a>
                        </c:forEach>
                    </div>
                </div>
                <div class="right">
                    <jsp:include page="Right.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
