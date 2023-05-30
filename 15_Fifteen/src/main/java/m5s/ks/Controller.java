package m5s.ks;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(name = "MainController", urlPatterns = { "/control" })
@WebServlet("/control")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null; 
	
	JdbcUtil util = new JdbcUtil();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		  {
			util.getJdbcConnection();
			System.out.println("We are at the beginning of Get method..");
			System.out.println(".. now we are in the middle of Get method..");
			doProcess(request, response);
			
			 RequestDispatcher reqDisp = request.getRequestDispatcher("/output.jsp");
			 reqDisp.forward(request, response);
			 System.out.println("Should have been forwarded to output.jsp by now!");


		  }catch (SQLException se){
			  se.printStackTrace();
		  }


	}
	

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			PrintWriter out = response.getWriter();
			resultSet = util.getResult();
			while(resultSet.next()) {	
		
			out.println("<body>");
			out.println("<br/><br/><br/>");
			out.println("<center>");
			out.println("<table border='1'>");
			out.println("<tr><th>ID</th><td>" + util.getId()+ "</td></tr>");
			out.println("<tr><th>NAME</th><td>" + util.getName() + "</td></tr>");
			out.println("<tr><th>AGE</th><td>" + util.getAge() + "</td></tr>");
			out.println("<tr><th>ADDRESS</th><td>" + util.getAddress() + "</td></tr>");
			out.println("</table>");
			out.println("</center>");
			out.println("</body>");
		System.out.println("Request method is of type: " +request.getMethod());		
		System.out.println("Request URI :: " + request.getRequestURI());		
	}
	}


}
