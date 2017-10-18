import java.net.URL;

public class BasicsNetworkInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 URL url=new URL("http://www.google.com");
			//URL url = new URL("http://127.0.0.1");

			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());
			System.out.println("Athority of the URL: " + url.getAuthority());
			System.out.println("Query: " + url.getQuery());
			System.out.println("Reference: " + url.getRef());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
