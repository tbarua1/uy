package applets;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventHandling extends Applet implements MouseListener{
	StringBuffer strBuffer;

	   public void init() {
	      addMouseListener(this);
	      strBuffer = new StringBuffer();
	      addItem("initializing the apple ");
	   }

	   public void start() {
	      addItem("starting the applet ");
	   }

	   public void stop() {
	      addItem("stopping the applet ");
	   }

	   public void destroy() {
	      addItem("unloading the applet");
	   }

	   void addItem(String word) {
	      System.out.println(word);
	      strBuffer.append(word);
	      repaint();
	   }

	   public void paint(Graphics g) {
	      // Draw a Rectangle around the applet's display area.
	      g.drawRect(0, 0, 
	      getWidth() - 1,
	      getHeight() - 1);

	      // display the string inside the rectangle.
	      g.drawString(strBuffer.toString(), 10, 20);
	   }

	   
	   public void mouseEntered(MouseEvent event) {
	   }
	   public void mouseExited(MouseEvent event) {
	   }
	   public void mousePressed(MouseEvent event) {
	   }
	   public void mouseReleased(MouseEvent event) {
	   }
	   public void mouseClicked(MouseEvent event) {
	      addItem("mouse clicked! ");
	   }
}
