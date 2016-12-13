
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Veuillez entrez a et b</h1>
        <form method="post" action="${pageContext.request.contextPath}/CalcServlet">
            A : <input type="text" name="a"/><br/>
            B : <input type="text" name="b"/><br/>
            <button type="submit">Envoyer</button>
        </form>
    </body>
</html>
