package chatusingthreat.server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Database {

    private DatabaseHandeling dh;
    public String filePath;

    public Database() {
        dh = new DatabaseHandeling();
    }

    public boolean userExists(String username) throws SQLException {

        ResultSet resultSet = dh.getResultSet("select * from register where mobile='" + username + "';");
        if (resultSet.next()) {
            return true;
        }

        return false;
    }

    public boolean checkLogin(String username, String password) throws SQLException {

        if (!userExists(username)) {
            System.out.println("User doesnot Exists while checked login");
            return false;
        }
        System.out.println("trying to Log in ");
        ResultSet resultSet = dh.getResultSet("select * from register where mobile='" + username + "';");
        System.out.println("ResultSer Received");
        while (resultSet.next()) {
            System.out.println("Mobile "+ username.equals(resultSet.getString("mobile")) +" Password "+ username.equals(resultSet.getString("password")));
                System.out.println("username and password is correct");
                return true;
           
        }
        System.out.println("No Result Ser received");
        return false;
    }

    public boolean addUser(String username, String password) {
        boolean updateQuery = dh.updateQuery("insert into register(mobile, password) values('" + username + "','" + password + "');");
        return updateQuery;
    }

    public static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        return nValue.getNodeValue();
    }
}
