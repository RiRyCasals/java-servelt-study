<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="compoundInterest.CalcResultBean"%>

<%
CalcResultBean compoundInterest = (CalcResultBean) request.getAttribute("error");
int errorFlag =  compoundInterest.getErrorFlag();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>福利計算プログラム</title>
    </head>
    <body>
        <h1>入力エラー</h1>
        <% if ((errorFlag & Integer.parseInt("100000", 2)) != 0) { %>
            <p>元本 に 数値に変換できない文字 が含まれていました</p>
        <% } %>
        <% if ((errorFlag & Integer.parseInt("010000", 2)) != 0) { %>
            <p>元本 は 1千円～10億円まで の範囲で指定ください</p>
        <% } %>
        <% if ((errorFlag & Integer.parseInt("001000", 2)) != 0) { %>
            <p>金利 に 数値に変換できない文字 が含まれていました</p>
        <% } %>
        <% if ((errorFlag & Integer.parseInt("000100", 2)) != 0) { %>
            <p>元本 は 1%~20%まで の範囲で指定ください</p>
        <% } %>
        <% if ((errorFlag & Integer.parseInt("000010", 2)) != 0) { %>
            <p>年数 に 数値に変換できない文字 が含まれていました</p>
        <% } %>
        <% if ((errorFlag & Integer.parseInt("000001", 2)) != 0) { %>
            <p>年数 は 1年~20年まで の範囲で指定ください</p>
        <% } %>
        <a href="/CompoundInterest/calc">戻る</a>
    </body>
</html>
