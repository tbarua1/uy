import java.sql.*;

public class Test {
	/*
	 * The Java.sql package that ships with JDK, contains various classes with
	 * their behaviours defined and their actual implementaions are done in
	 * third-party drivers. Third party vendors implements the java.sql.Driver
	 * interface in their database driver. DBC driver implementations vary
	 * because of the wide variety of operating systems and hardware platforms
	 * in which Java operates. Sun has divided the implementation types into
	 * four categories, Types 1, 2, 3, and 4
	 */
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String BLANK_URL = "jdbc:mysql://localhost";
	static final String USER = "root";
	static final String PASS = "aaaAAA123";
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");

		// STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");

		// STEP 4: Execute a query
		System.out.println("Retriving records from the table...");
		Statement stmt = conn.createStatement();
		System.out.println("Statement Created ");
		ResultSet executeQuery = stmt.executeQuery("SELECT * FROM Contact;");
		System.out.println("Query Executed" + executeQuery);
		while (executeQuery.next()) {
			System.out.println(executeQuery.getString("id"));
			System.out.println(executeQuery.getString("address"));
			System.out.println(executeQuery.getString("city"));

		}
	}

	public boolean createDatabase(String database) {
		boolean queryStatus = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");

			conn = DriverManager.getConnection(BLANK_URL, USER, PASS);
			System.out.println("Connected database successfully...");
			
			// STEP 4: Execute a query
			System.out.println("Creating table...");
			stmt = conn.createStatement();
			queryStatus = stmt.execute("create database " + database + ";");
		} catch (SQLException ex) {
			System.out.println("Error- " + ex.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException ex) {
					System.out.println("STMT Close SQL Exception " + ex.getMessage());
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					System.out.println("Connection Cloase " + ex.getLocalizedMessage());
				}
				conn = null;
			}
		}
		return queryStatus;

	}

}
