package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import compoundInterest.CalcCheck;
import compoundInterest.CalcExec;
import compoundInterest.CalcResultBean;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String principal = request.getParameter("principal");
        String rate = request.getParameter("rate");
        String year = request.getParameter("year");

        CalcCheck checker = new CalcCheck();
        boolean isCatchError = checker.checkError(principal, rate, year);
        if (isCatchError) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
            dispatcher.forward(request, response);
        }
        CalcResultBean bean = new CalcResultBean();
        bean.setPrincipal(Integer.parseInt(principal));
        bean.setRate(Integer.parseInt(rate));
        bean.setYear(Integer.parseInt(year));

        CalcExec calculator = new CalcExec();
        calculator.execute(bean);

        request.setAttribute("compoundInterest", bean);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
    }
}
