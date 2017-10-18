import java.net.Socket;
import java.net.UnknownHostException;

public class Portchecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Socket Skt;
	      String host = "localhost";
	      
	      if (args.length > 0) {
	         host = args[0];
	      }
	      for (int i = 0; i < 1024; i++) {
	         try {
	            System.out.println("Looking for "+ i);
	            Skt = new Socket(host, i);
	            System.out.println("There is a server on port " + i + " of " + host);
	         } catch (UnknownHostException e) {
	            System.out.println("Exception occured"+ e);
	            break;
	         } catch (Exception e) {}
	      }
	}

}
