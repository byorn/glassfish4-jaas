<%-- 
    Document   : index.jsp
    Created on : Jan 4, 2015, 3:29:20 PM
    Author     : Byorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getUserPrincipal().getName() %> </h1>
    </body>
</html>
