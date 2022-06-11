<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" 
         import="compoundInterest.CalcResultBean" %>

<%
CalcResultBean compoundInterest = (CalcResultBean) request.getAttribute("compoundInterest");
int[] list = compoundInterest.getCompoundInterestList();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>複利プログラム</title>
    </head>
    <body>
        <h1>計算結果</h1>
        <p>
            元本 &yen;<%= String.format("%,d", compoundInterest.getPrincipal()) %>, 
            年利<%= compoundInterest.getRate() %>%, 
            <%= compoundInterest.getYear() %>年の場合
        </p>
        <hr>
        <% for (int i=0; i<list.length;++i) { %>
            <p><%= i%>ヶ月目：<%= String.format("%,d", list[i]) %></p>
        <% } %>
        <hr>
        元利合計 = &yen;<%= String.format("%,d", compoundInterest.getTotal()) %>
        <hr>
        <a href="/CompoundInterest/calc">戻る</a>
    </body>
</html>
