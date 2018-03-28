<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Developers</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
</head>
<body>
<div class="outer">
    <div class="block">
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Specialty</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${developers}" var="d">
                <tr>
                    <td>${d.id}</td>
                    <td>${d.name}</td>
                    <td>${d.specialty}</td>
                    <td>${d.salary}</td>
                    <td><a href="${pageContext.request.contextPath}/devs/del?id=${d.id}">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <p id="p1">Message: ${message}</p>
    <p id="addnewdevp">Add new developer (click me!)</p>
    <div class="block" id="addnewdevblock" hidden>
        <form action="${pageContext.request.contextPath}/devs/add" method="post">
            <input type="text" name="name" value="" title=""/>
            <input type="text" name="specialty" value="" title=""/>
            <input type="number" min="0" name="salary" value="" title=""/>
            <br/>
            <input type="submit" value="Add new developer"/>
        </form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/developers.js" type="text/javascript"></script>
<%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js" type="text/javascript"></script>--%>
</body>
</html>
