import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitandRollBack {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String BLANK_URL = "jdbc:mysql://localhost";
	static final String USER = "root";
	static final String PASS = "aaaAAA123";
	static Connection conn = null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");

		// STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");

		Connection conn = DriverManager.getConnection(BLANK_URL, USER, PASS);
	
			   //Assume a valid connection object conn
			   conn.setAutoCommit(false);
			   Statement stmt = conn.createStatement();
			   
			   String SQL = "INSERT INTO Employees  " +
			                "VALUES (106, 20, 'Rita', 'Tez')";
			   stmt.executeUpdate(SQL);  
			   //Submit a malformed SQL statement that breaks
			   String sql = "INSERTED IN Employees  " +
			                "VALUES (107, 22, 'Sita', 'Singh')";
			   stmt.executeUpdate(SQL);
			   // If there is no error.
			   conn.commit();
			}catch(SQLException se){
			   // If there is any error.
			   conn.rollback();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
