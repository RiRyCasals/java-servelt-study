package ex;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

import ex.Fruit;

@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Fruit fruit = new Fruit("いちご", 700);
        ServletContext application = this.getServletContext();
        application.setAttribute("fruit", fruit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/fruit.jsp");
        dispatcher.forward(request, response);
    }
}
