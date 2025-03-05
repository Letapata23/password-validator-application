<%-- 
    Document   : invalid_password_exception
    Created on : 04 Mar 2025, 14:40:16
    Author     : Letap
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Invalid Password Exception</h1>
        <%
            String message = exception.getMessage();
        %>
        <p>
            <%=message%>.<br/>
            Please click <a href="user_password.html">here</a> to enter passord again or <a href="index.html">here</a> to go to main menu
        </p>
    </body>
</html>
