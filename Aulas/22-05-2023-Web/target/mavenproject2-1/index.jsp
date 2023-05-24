<%-- 
    Document   : registro
    Created on : May 24, 2023, 1:07:44 PM
    Author     : Willian Murayama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/cadastro" method="post">
            Nome:<input type="text"name="nome" />
            <br />
            E-mail<input type="text" name="email" />
            <br />
            Senha<input type="password" name="password" />
            <br />
             <input type="submit" value="Entrar">
        </form>
    </body>
</html>
