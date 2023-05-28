package m5s.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/controller/", loadOnStartup=5)
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static RequestDispatcher rd = null;
 
	static {
		System.out.println("Static block of controller is being executed..");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		doProcess(request, response);
		doPost(request, response);
	}


	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Request method is of type: " +request.getMethod());
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		System.out.println("username is: " + firstName +" " + lastName);
		
		System.out.println("Request URI :: " + request.getRequestURI());
			
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{

		response.setContentType("text/html");

		System.out.println("Request type is :: "+request.getMethod());

		String firstName  = request.getParameter("firstName");
		String lastName  = request.getParameter("lastName");

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body bgcolor=lightgreen>");
		out.println("<center>");
		out.println("<h1 style='color:blue'>Welcome</h1>");
		out.println("<h2 style='color:blue'>&nbsp"+firstName+"&nbsp"+lastName+"&nbsp!</h2>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}	


}
