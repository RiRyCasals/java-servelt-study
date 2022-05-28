<%@ page contentType="text/html; charset=UTF-8" %>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <p>
            input -&gt; <%= name %>, <%= gender %>
        </p>
    </body>
</html>
