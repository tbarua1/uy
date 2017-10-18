import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDeleteRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (
		         // Step 1: Allocate a database 'Connection' object
		         Connection conn = DriverManager.getConnection(
		               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx"); // MySQL
		 
		         // Step 2: Allocate a 'Statement' object in the Connection
		         Statement stmt = conn.createStatement();
		      ) {
		         // Step 3 & 4: Execute a SQL INSERT|DELETE statement via executeUpdate(),
		         //   which returns an int indicating the number of rows affected.
		 
		         // DELETE records with id>=3000 and id<4000
		         String sqlDelete = "delete from books where id>=3000 and id<4000";
		         System.out.println("The SQL query is: " + sqlDelete);  // Echo for debugging
		         int countDeleted = stmt.executeUpdate(sqlDelete);
		         System.out.println(countDeleted + " records deleted.\n");
		 
		         // INSERT a record
		         String sqlInsert = "insert into books " // need a space
		               + "values (3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
		         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
		         int countInserted = stmt.executeUpdate(sqlInsert);
		         System.out.println(countInserted + " records inserted.\n");
		 
		         // INSERT multiple records
		         sqlInsert = "insert into books values "
		               + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
		               + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
		         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
		         countInserted = stmt.executeUpdate(sqlInsert);
		         System.out.println(countInserted + " records inserted.\n");
		 
		         // INSERT a partial record
		         sqlInsert = "insert into books (id, title, author) "
		               + "values (3004, 'Fishing 101', 'Kumar')";
		         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
		         countInserted = stmt.executeUpdate(sqlInsert);
		         System.out.println(countInserted + " records inserted.\n");
		 
		         // Issue a SELECT to check the changes
		         String strSelect = "select * from books";
		         System.out.println("The SQL query is: " + strSelect);  // Echo For debugging
		         ResultSet rset = stmt.executeQuery(strSelect);
		         while(rset.next()) {   // Move the cursor to the next row
		            System.out.println(rset.getInt("id") + ", "
		                    + rset.getString("author") + ", "
		                    + rset.getString("title") + ", "
		                    + rset.getDouble("price") + ", "
		                    + rset.getInt("qty"));
		         }
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
	}

}
