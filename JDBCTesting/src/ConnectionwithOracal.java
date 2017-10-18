import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionwithOracal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter information to test connection to the database");
				String user;
				String password;
				String database;
				user = readEntry("user: ");
				int slash_index = user.indexOf('/');
				if (slash_index != -1)
				{
				password = user.substring(slash_index + 1);
				user = user.substring(0, slash_index);
				}
				else
				password = readEntry("password: ");
				database = readEntry("database(a TNSNAME entry): ");
				System.out.print("Connecting to the database...");
				System.out.flush();
				System.out.println("Connecting...");
				// Open an OracleDataSource and get a connection
				OracleDataSource ods = new OracleDataSource();
				ods.setURL("jdbc:oracle:oci:@" + database);
				ods.setUser(user);
				ods.setPassword(password);
				Connection conn = ods.getConnection();
				System.out.println("connected.");
				// Create a statement
				Statement stmt = conn.createStatement();
				ResultSet rset = stmt.executeQuery("select 'Hello World' from dual");
						while (rset.next())
						System.out.println(rset.getString(1));
						// close the result set, the statement and connect
						rset.close();
						stmt.close();
						conn.close();
						System.out.println("Your JDBC installation is correct.");
	}
	static String readEntry(String prompt)
	{
	try
	{
	StringBuffer buffer = new StringBuffer();
	System.out.print(prompt);
	System.out.flush();
	int c = System.in.read();
	while (c != '\n' && c != -1)
	{
	buffer.append((char)c);
	c = System.in.read();
	}
	return buffer.toString().trim();
	}
	catch(IOException e)
	{
	return "";
	}
	}
}
