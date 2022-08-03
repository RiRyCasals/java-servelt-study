<%@
    page contentType="text/html; charset=UTF-8"
    import="model.User"
    import="model.Mutter"
    import="java.util.List"
%>

<% 
User loginUser = (User) session.getAttribute("loginUser");
List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
String errorMsg = (String) request.getAttribute("errorMsg");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>どこつぶ</title>
</head>
<body>
    <h1>どこつぶメイン</h1>
    <p>
        <%= loginUser.getName() %> さん，ログイン中
        <a href="/ch10-DocoTubu/Logout">ログアウト</a>
    </p>
    <p>
        <a href="/ch10-DocoTubu/Main">更新</a>
    </p>
    <form action="/ch10-DocoTubu/Main" method="POST">
        <input type="text" name="text">
        <input type="submit" value="つぶやく">
    </form>
    <% if (errorMsg != null) { %>
        <p>
            <%= errorMsg %>
        </p>
    <% } %>
    <% for (Mutter mutter: mutterList) { %>
        <p>
            <%= mutter.getUserName() %> : <%= mutter.getText() %>
        </p>
    <% } %>
</body>
</html>