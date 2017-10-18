package window_listener;

import java.awt.*;
import java.awt.event.*;
public class MouseMotionAdapterTest extends MouseMotionAdapter{
	   Frame f;  
	   MouseMotionAdapterTest(){  
	        f=new Frame("Mouse Motion Adapter");  
	        f.addMouseMotionListener(this);  
	          
	        f.setSize(300,300);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	    }  
	public void mouseDragged(MouseEvent e) {  
	    Graphics g=f.getGraphics();  
	    g.setColor(Color.ORANGE);  
	    g.fillOval(e.getX(),e.getY(),20,20);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MouseMotionAdapterTest();
	}

}
