package ps.learn.part01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareNumbers extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int k = 0;
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("k")) {
				k = Integer.parseInt(cookie.getValue());
			}
		}
		
		PrintWriter out = resp.getWriter();
		out.println("The square is : " + (int)k*k);
	}

}
