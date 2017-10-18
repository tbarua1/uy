package applets;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class FirstAppletTest extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		Graphics2D graphics=(Graphics2D) g;
		Ellipse2D.Double arg0=new Ellipse2D.Double(0,0, 300, 300);
		graphics.draw(arg0);
	}

}
