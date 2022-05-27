<%
String message = "JavaServer Pages";
int number = (int)(Math.random() * 10);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSPのサンプル</title>
    </head>
    <body>
        <p>Hello, <%= message %>!<br>Random number = <%= number %></p>
    </body>
</html>
