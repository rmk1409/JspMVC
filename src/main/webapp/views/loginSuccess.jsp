<%@ page import="models.LoginBean" %><%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 08.09.2016
  Time: 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>You are logged in!</p>
    <%
        LoginBean bean = (LoginBean) request.getAttribute("bean");
        out.print("Welcome, " + bean.getLogin());
    %>
</body>
</html>
