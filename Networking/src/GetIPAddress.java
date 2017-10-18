import java.net.InetAddress;

public class GetIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");

			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
