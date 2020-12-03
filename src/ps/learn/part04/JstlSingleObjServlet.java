package ps.learn.part04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlSingleObj")
public class JstlSingleObjServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s1 = new Student(10001, "Pandey");
		Student s2 = new Student(10002, "Sushant");
		
		req.setAttribute("student", s1);
		
		RequestDispatcher rd = req.getRequestDispatcher("JstlSingleObj.jsp");
		rd.forward(req, resp);
	}

}
