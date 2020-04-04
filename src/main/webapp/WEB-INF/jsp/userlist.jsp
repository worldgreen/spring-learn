<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>spring mvc learn</h1>
<c:forEach items="${users}" var="user">
    <c:out value="${user.username}"></c:out>
    <c:out value="${user.age}"></c:out>
</c:forEach>
</body>
</html>
