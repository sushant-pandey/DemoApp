package ps.learn.part04;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlTwoObj")
public class JstlTwoObjServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s1 = new Student(10001, "Pandey");
		Student s2 = new Student(10002, "Sushant");
		
		req.setAttribute("students", Arrays.asList(s1, s2));
		
		RequestDispatcher rd = req.getRequestDispatcher("JstlTwoObj.jsp");
		rd.forward(req, resp);
	}

}
