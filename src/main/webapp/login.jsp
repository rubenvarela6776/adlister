<%--
  Created by IntelliJ IDEA.
  User: rubenvarela
  Date: 1/30/17
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
            return;
        }
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1 style="font-size: larger">Login</h1>
<form action="/profile.jsp" method="POST">
    <label>Username:</label>
    <input type="text" name="username">
    <label>Password:</label>
    <input type="password" name="password">
    <input type="submit" value="Login">
</form>
</body>
</html>
