<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" 
         import="model.User" %>

<% User registerUser = (User) session.getAttribute("registerUser"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ユーザー登録</title>
    </head>
    <body>
        <h1>下記のユーザーを登録します</h1>
        <p>
            ログインID:<%= registerUser.getId() %><br>
            名前:<%= registerUser.getName() %><br>
        </p>
        <a href="/Example/RegisterUser">戻る</a>
        <a href="/Example/RegisterUser?action=done">登録</a>
    </body>
</html>
