package ps.learn.part04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExprLangServlet")
public class ExprLangServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "Pandey Sushant";
		req.setAttribute("name", name);
		
		RequestDispatcher rd = req.getRequestDispatcher("ExprLang.jsp");
		rd.forward(req, resp);
	}
}
