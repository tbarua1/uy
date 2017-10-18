package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Initialization
 */
@WebServlet("/Initialization")
public class Initialization extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 int counter;
       @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	 String initValue = 
    			  config.getInitParameter("initial");
    			  try{
    			  counter = Integer.parseInt(initValue);
    			  }
    			  catch(NumberFormatException e){
    			  counter = 0;}
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Initialization() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		   PrintWriter pw = response.getWriter();
		   counter++;
		   pw.println("Since loading this servlet"+
		   "has been accessed" + counter + "times");
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
