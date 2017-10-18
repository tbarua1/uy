import java.sql.Connection;
import java.sql.DriverManager;

public class OracleTesting {

	public static void main(String[] args) {
			/*You can use getInstance() method to work around noncompliant JVMs, but then you'll have to code for two extra Exceptions */
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}	// TODO Auto-generated method stub
/*try {
   Driver myDriver = new oracle.jdbc.driver.OracleDriver();
   DriverManager.registerDriver( myDriver );
}
catch(ClassNotFoundException ex) {
   System.out.println("Error: unable to load driver class!");
   System.exit(1);
}*/
		jdbc:oracle:driver:username/password@database
		String URL = "jdbc:oracle:thin:@amrood:1521:EMP";
		String USER = "username";
		String PASS = "password";
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		DriverManager.getConnection(String url);
		DriverManager.getConnection(String url);
		
		String URL = "jdbc:oracle:thin:username/password@amrood:1521:EMP";
		Connection conn = DriverManager.getConnection(URL);


//A Properties object holds a set of keyword-value pairs. It is used to pass driver properties to the driver during a call to the getConnection() method.
	
		//The PreparedStatement interface extends the Statement interface, which gives you added functionality with a couple of advantages over a generic Statement object.
		reparedStatement pstmt = null;
		try {
		   String SQL = "Update Employees SET age = ? WHERE id = ?";
		   pstmt = conn.prepareStatement(SQL);
		   . . .
		}
		catch (SQLException e) {
		   . . .
		}
		finally {
		   . . .
		}
		/**/
		 Statement stmt = conn.createStatement(
                 ResultSet.TYPE_FORWARD_ONLY,
                 ResultSet.CONCUR_READ_ONLY);
		/*A simple call to the close() method will do the job. If you close the Connection object first, it will close the PreparedStatement object as well. However, you should always explicitly close the PreparedStatement object to ensure proper cleanup.*/
		PreparedStatement pstmt = null;
		try {
		   String SQL = "Update Employees SET age = ? WHERE id = ?";
		   pstmt = conn.prepareStatement(SQL);
		   . . .
		}
		catch (SQLException e) {
		   . . .
		}
		finally {
		   pstmt.close();
		}
		/*A simple call to the close() method will do the job. If you close the Connection object first, it will close the CallableStatement object as well. However, you should always explicitly close the CallableStatement object to ensure proper cleanup.*/
		CallableStatement cstmt = null;
		try {
		   String SQL = "{call getEmpName (?, ?)}";
		   cstmt = conn.prepareCall (SQL);
		   . . .
		}
		catch (SQLException e) {
		   . . .
		}
		finally {
		   cstmt.close();
		}
	}
	

}
