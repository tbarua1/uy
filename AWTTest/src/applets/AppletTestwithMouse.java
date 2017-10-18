package applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppletTestwithMouse extends Applet implements MouseListener {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private Graphics globalGraphics = null;

	public void init() {
		this.addMouseListener(this);

	}

	public void paint(Graphics g) {
		this.setSize(new Dimension(600, 600));
		
			globalGraphics = g.create();
		

	}

	public void drawDot(int x, int y) {
		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		System.out.println(r+" "+g+" "+b);
		Color randomColor = new Color(r, g, b);
		globalGraphics.setColor(randomColor);
		globalGraphics.fillRect(x, y, 20, 20);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int mousex = e.getX();
		int mousey = e.getY();
		System.out.println(mousex+" Mouse Clicked "+mousey);
		drawDot(mousex, mousey);
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
