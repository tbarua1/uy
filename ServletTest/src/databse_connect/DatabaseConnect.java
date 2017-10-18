package databse_connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseConnect
 */
@WebServlet("/DatabaseConnect")
public class DatabaseConnect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseConnect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String url = 
		   "jdbc:mysql://localhost/test?user=root&password=admin";
		  Connection conn;
		  ResultSet rs;
		  try{
		  Class.forName("jdbc.mysql.Driver");
		  conn = DriverManager.getConnection(url);
		  Statement statement = conn.createStatement();
		  String query = "insert into emp_sal values('tarkesh', 150)";
		  int i = statement.executeUpdate(query);
		  if(i!=0){
		  out.println("The record has been inserted");
		  }
		  else{
		  out.println("Sorry! Failure");
		  }
		  rs = statement.executeQuery("select * from emp_sal");
		  while(rs.next()){
		  out.println("<p><table>" + rs.getString(1) + " " 
		  + rs.getInt(2) + "</p></table>");
		  }
		  rs.close();
		  statement.close();
		  }
		  catch (Exception e){
		  System.out.println(e);
		  }
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
