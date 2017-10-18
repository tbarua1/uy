import java.net.InetAddress;


public class GetInfobyip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            InetAddress host = InetAddress.getByName("172.22.101.82");
	            System.out.println(host.getHostName());
                    
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }}

}
