<%--
  Created by IntelliJ IDEA.
  User: rubenvarela
  Date: 1/31/17
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Index</title>
</head>
<body>
<ul>
<c:forEach var="ad" items="${ads}">
    <h1>${ad.userId}</h1>
    <h1>${ad.id}</h1>
    <h1>${ad.title}</h1>
    <p>${ad.description}</p>
</c:forEach>
</ul>
</body>
</html>
