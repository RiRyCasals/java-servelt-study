<%-- これは JSP のコメントアウト --%>

<%-- ページディレクティブ
    ライブラリのインポートとかはここでできる
    ここで文字コードとかを指定しないと文字化けする --%>
<%@ page contentType="text/html; charset=UTF-8"
    import="java.util.Date" %>

<%
//  ここはJavaのコメントアウトでかける
String message = "JavaServer Pages";
Date date = new Date();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSPのサンプル</title>
    </head>
    <body>
        <p>Hello, <%= message %>!</p>

        <%-- メソッドの埋め込みもできる --%>
        <p>Random number = <%= (int)(Math.random() * 10) %></p>

        <%-- flask の テンプレートファイルみたいにかける --%>
        <% for (int i=0; i<5; ++i) { %>
            <p>line <%= i+1 %> : こんちには！</p>
        <% } %>

        <p><%= date %> にサイトを訪れました</p>
    </body>
</html>
