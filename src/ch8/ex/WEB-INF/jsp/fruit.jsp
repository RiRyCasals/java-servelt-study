<%@ page contentType="text/html; charset=UTF-8" import="ex.Fruit" %>

<% Fruit fruit = (Fruit) session.getAttribute("fruit"); %>

<!DOCTYPE>
<html>
    <head>
    </head>
    <body>
        <p>
            <%= fruit.getName() %> の値段は <%= fruit.getPrice() %> 円です．
        </p>
    </body>
</html>
