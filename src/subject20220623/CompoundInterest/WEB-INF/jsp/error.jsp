<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="compoundInterest.CalcResultBean"%>

<%
CalcResultBean error = (CalcResultBean) request.getAttribute("error");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>複利計算プログラム</title>
    </head>
    <body>
        <h1>入力エラー</h1>
        <% if (error.getPrincipalError()) { %>
            <p>元本 は 1千円～10億円まで の範囲で指定ください<br>(1000~1000000000 の範囲)</p>
        <% } %>
        <% if (error.getRateError()) { %>
            <p>元本 は 1%~20%まで の範囲で指定ください<br>(1~20 の範囲)</p>
        <% } %>
        <% if (error.getYearError()) { %>
            <p>年数 は 1年~20年まで の範囲で指定ください<br>(1~20 の範囲)</p>
        <% } %>
        <a href="/CompoundInterest/calc">戻る</a>
    </body>
</html>
