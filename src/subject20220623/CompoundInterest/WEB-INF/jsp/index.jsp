<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>福利計算プログラム</title>
    </head>
    <body>
        <h1>福利計算プログラム</h1>
        <p>データを入力してください</p>
        <form action="/CompoundInterest/calc" method="POST">
            元本：<input type="text" name="principal"><br>
            金利：<input type="text" name="rate"><br>
            年数：<input type="text" name="year"><br>
            <input type="submit" value="実行" style="background-color: red; color: white;">
        </form>
    </body>
</html>
