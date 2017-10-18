package mouse_listener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class DrawDot extends Frame implements MouseListener{
public DrawDot() {
	// TODO Auto-generated constructor stub
	 addMouseListener(this);  
     
     setSize(300,300);  
     setLayout(null);  
     setVisible(true);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new DrawDot();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
