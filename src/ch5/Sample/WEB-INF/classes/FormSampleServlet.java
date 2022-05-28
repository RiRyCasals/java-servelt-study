import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head></head><body>");
        out.println("<p>input -> " + name + ", " + gender + "</p>");
        out.println("</body></html>");
    }
}
