package exception;

import java.net.MalformedURLException;
import java.net.URL;

public class WithoutCatchBlock {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.google.com");
		} 
		catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("In finally block");
		}
	}

}
