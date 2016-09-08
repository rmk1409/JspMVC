<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 08.09.2016
  Time: 7:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="ControllerServlet" method="post">
    Name: <input type="text" name="userLogin"> <br>
    Password: <input type="password" name="userPassword"> <br>
    <input type="submit" name="Login">
  </form>

  <p>Try any name and password 'admin'</p>
  </body>
</html>
