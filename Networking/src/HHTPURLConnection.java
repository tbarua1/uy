import java.net.HttpURLConnection;
import java.net.URL;

public class HHTPURLConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
//			URL url=new URL("http://www.google.com");    
URL url=new URL("172.22.101.82");
                    System.out.println(""+url.getPort());
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			for(int i=1;i<=8;i++){  
			System.out.println(huc.getHeaderFieldKey(i)+" = "+
			huc.getHeaderField(i));  
			}  
			huc.disconnect();   
			}catch(Exception e){System.out.println(e);} 
	}

}
