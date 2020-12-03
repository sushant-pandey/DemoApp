package ps.learn.part01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebInitParam; 

@WebServlet(value = "/configreader", initParams = { 
		   @WebInitParam(name = "name", value = "Sushant "), 
		   @WebInitParam(name = "phone", value = "One Plus") 
		}) 
public class ConfigReader extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		String phone = config.getInitParameter("phone");
		PrintWriter out = resp.getWriter();
		out.println("Hi " + name + " You are using " + phone);
	}

}
