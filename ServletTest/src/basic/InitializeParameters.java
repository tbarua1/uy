package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitializeParameters
 */
@WebServlet("/InitializeParameters")
public class InitializeParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitializeParameters() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		  pw.print("Init Parameters are : ");
		  Enumeration enumeration = getServletConfig().getInitParameterNames();
		  while(enumeration.hasMoreElements()){
		  pw.print(enumeration.nextElement() + " ");
		  }
		  pw.println("\nThe email address is " + 
		  getServletConfig().getInitParameter("AdminEmail"));
		  pw.println("The address is " + 
		  getServletConfig().getInitParameter("Address"));
		  pw.println("The phone no is " + 
		  getServletConfig().getInitParameter("PhoneNo"));
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
