import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

/* web.xml の servlet-mapping の記述がいらない
 * 両方記述されている場合 xml が優先されるっぽい
 * 両方記述されている場合 .java で記述したルーティングにアクセスしようとするとエラーになる
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head></head><body>");
        out.println("<p>Sample</p>");
        out.println("<p>Hello Servlet</p>");
        out.println("</body></html>");
    }
}
