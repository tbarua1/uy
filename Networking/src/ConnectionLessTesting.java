import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ConnectionLessTesting {
public static void main(String[] args) throws Exception {
	 DatagramSocket ds = new DatagramSocket();  
	    String str = "Welcome java";  
	    InetAddress ip = InetAddress.getByName("127.0.0.1");  
	     
	    DatagramPacket dp = new DatagramPacket(str.getBytes(),
	    		str.length(), ip, 3000);  
	    ds.send(dp);  
	    ds.close();  
}
}
