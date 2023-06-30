package m5s.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pband = request.getParameter("pbrand");
		String pqty = request.getParameter("pqty");

		Cookie c3 = new Cookie("pbrand", pband);
		Cookie c4 = new Cookie("pqtry", pqty);

		response.addCookie(c3);
		response.addCookie(c4);
		
	Cookie[] cookies = request.getCookies();
	String uname = cookies[0].getValue();

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body bgcolor='lightgreen'>");
		out.println("<h1 style='color:blue; text-align:center;'>PRODUCT DETAILS...</h1>");
		out.println("<center>");
		out.println("<table border='1'>");
		out.println("<tr>Hello Customer</tr>");
		out.println("<tr><td>CUSTOMER_NAME</td><td>" + uname + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("./disp");
		rd.forward(request, response);

	}

}
