package applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class MouseMotionLostenerTest extends Applet implements MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Graphics globalGraphics;

	public void init() {
		this.addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		globalGraphics = g;
	}

	public void drawCircle(double x0, double y0, double x1, double y1) {
		globalGraphics.setColor(getRandomColor());
		Ellipse2D ellipse2d = new Ellipse2D.Double(x0, y0, x1, y1);
		Graphics2D graphics2d = (Graphics2D) globalGraphics;
		graphics2d.fill(ellipse2d);
	}

	private Color getRandomColor() {
		// TODO Auto-generated method stub
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		System.out.println(r + " " + g + " " + b);
		return new Color(r, g, b);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		// if(e.getButton()==M)
		int x = e.getX();
		int y = e.getY();
		drawCircle(x, y, 20, 20);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		int mousex = e.getX();
		int mousey = e.getY();
		System.out.println(mousex + " Mouse Clicked " + mousey);
		// drawDot(mousex, mousey);
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
