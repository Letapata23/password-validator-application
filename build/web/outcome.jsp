<%-- 
    Document   : outcome
    Created on : 04 Mar 2025, 14:30:10
    Author     : Letap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String message = (String) request.getAttribute("message");
        %>
        <p>
            <%=message%>.<br/>
            Click <a href='user_password.html'>here</a> to check again or <a href="index.html">here</a> to go back to the main page.
        </p>
        
    </body>
</html>
