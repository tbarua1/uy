package session_tracking.cookies;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		try {
		System.out.println("Session created: "+session);
		session.setAttribute("foo","bar");
		} catch (Exception e) {
		System.out.println("Error in setting session attribute: " +e.getMessage());
		} 
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		// Log a message
		System.out.println("Session invalidated: "+session);
		System.out.println("The name is: " + session.getAttribute("foo"));

	}

}
