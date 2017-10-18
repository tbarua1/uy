package close_window;

import java.awt.event.WindowAdapter;
import java.awt.*;
import java.awt.event.*;
public class UsingExtendingWindowAdapter extends WindowAdapter{
	   Frame f;  
	   UsingExtendingWindowAdapter(){  
	        f=new Frame();  
	        f.addWindowListener(this);  
	          
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	    }  
	public void windowClosing(WindowEvent e) {  
	    f.dispose();  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new UsingExtendingWindowAdapter();
	}

}
