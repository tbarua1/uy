package session_tracking.hidden_field;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LastAccessTime
 */
@WebServlet("/LastAccessTime")
public class LastAccessTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastAccessTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String head;
		  Integer count = new Integer(0);
		  if (session.isNew()) {
		  head = "New Session Value ";
		  } else {
		  head = "Old Session value";
		  Integer oldcount =(Integer)session.getValue("count"); 
		  if (oldcount != null) {
		  count = new Integer(oldcount.intValue() + 1);
		  }
		  }
		session.putValue("count", count); 
		out.println("<HTML><BODY BGCOLOR=\"#FFFFFF\">\n" +
		 "<H2 ALIGN=\"CENTER\">" + head + "</H2>\n" +session.getId()+
		 "<H4 ALIGN=\"CENTER\">Session Access Time: "+count+"</H4>\n" +
		  "<TABLE BORDER=1 ALIGN=CENTER>\n" + "<TR BGCOLOR=\"green\">\n" +
		  "<TD>Session Creation Time\n" +"  <TD>" +
		  new Date(session.getCreationTime()) + "\n" +
		  "<TR BGCOLOR=\"pink\">\n" +"  <TD>Last Session Access Time\n" +
		  "  <TD>" + new Date(session.getLastAccessedTime()) +
		  "</TABLE>\n" +"</BODY></HTML>");

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
