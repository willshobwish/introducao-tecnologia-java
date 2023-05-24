<%-- 
    Document   : registro
    Created on : May 23, 2023, 11:06:15 PM
    Author     : Willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/aa" method="post"> 
            <label for="fname" >First name:</label><br>
            <input type="text" id="fname" name="aaaaa"><br>
            <label for="lname">Last name:</label><br>
            <input type="text" id="lname" name="lname">
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
