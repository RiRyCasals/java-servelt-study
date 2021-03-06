package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");

        String errorMessage = "";
        if (name == null || name.length() == 0) {
            errorMessage += "名前が入力されていません<br>";
        }
        if (gender == null || gender.length() == 0) {
            errorMessage += "性別が入力されていません<br>";
        } else {
            if (gender.equals("0")) {gender = "男性";}
            else if (gender.equals("1")) {gender = "女性";}
        }

        String message = name + "さん(" + gender + ")を登録しました";
        if (errorMessage.length() != 0) {
            message = errorMessage;
        }

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta chaeset=\"UTF-8\">");
        out.println("<title>ユーザー登録結果</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + message + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
