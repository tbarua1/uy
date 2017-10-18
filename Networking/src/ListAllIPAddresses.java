import java.net.InetAddress;

public class ListAllIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress myHost=InetAddress.getLocalHost();
			System.out.println("IP Address - "+myHost.getHostAddress());
			System.out.println("CanonicalName - "+myHost.getCanonicalHostName());
			System.out.println("HostName - "+myHost.getHostName());
			System.out.println("LocalHost - "+InetAddress.getLocalHost());
            InetAddress[] myHost1 = InetAddress.getAllByName("www.google.com");
            for(InetAddress host:myHost1){
                System.out.println(host.getHostAddress());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }}

}
