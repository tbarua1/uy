package mouse_listener;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;
public class MouseLocationTracker extends Frame implements MouseMotionListener{
		Label l;  
	    Color c=Color.BLUE;  
	    MouseLocationTracker(){  
	    l=new Label();  
	    l.setBounds(20,40,100,20);  
	    add(l); 	      
	    addMouseMotionListener(this); 	      
	    setSize(400,400);  
	    setLayout(null);  
	    setVisible(true);  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MouseLocationTracker();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		 l.setText("X="+e.getX()+", Y="+e.getY());  
		    Graphics g=getGraphics();  
		    g.setColor(Color.RED);  
		    g.fillOval(e.getX(),e.getY(),20,20); 
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		   l.setText("X="+e.getX()+", Y="+e.getY());  
	}

}
