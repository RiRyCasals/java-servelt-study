<%@ page contentType="text/html; charset=UTF-8" 
    import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>どこつぶ</title>
</head>
<body>
    <h1>どこつぶログイン</h1>
    <% if(loginUser != null) { %>
        <p>ログインに成功しました</p>
        <p>ようこそ <%= loginUser.getName() %> さん</p>
        <a href="/ch10-DocoTubu/Main">つぶやき投稿・閲覧へ</a>
    <% } else { %>
        <p>ログインに失敗しました</p>
        <a href="/ch10-DocoTubu">TOPへ</a>
    <% } %>
</body>
</html>