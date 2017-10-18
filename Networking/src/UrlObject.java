import java.net.URL;

public class UrlObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String myUrl = "http://www.google.com";
			URL url = new URL(myUrl);
			System.out.println(url.toString());
			URL url1 = new URL("file://c:/Perl");
			System.out.println(url1.toString());
			String protocol = "http";
			String host = "www.google.co.in";
			int port = 80;
			String path = "/search?client=ubuntu&channel=fs&q=Tarkeshwar+Barua&ie=utf-8&oe=utf-8";
			URL url2 = new URL(protocol, host, port, path);
			System.out.println(""+url2.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
