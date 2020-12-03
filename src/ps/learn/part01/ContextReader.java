package ps.learn.part01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/contextreader")
public class ContextReader extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException {
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		String phone = context.getInitParameter("phone");
		PrintWriter out = resp.getWriter();
		out.println("Hi " + name + " You are using " + phone);
	}

}
