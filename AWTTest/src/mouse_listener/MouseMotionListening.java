package mouse_listener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionListening extends Frame implements MouseMotionListener {
	public MouseMotionListening() {
		// TODO Auto-generated constructor stub
		addMouseMotionListener(this);

		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMotionListening();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 20, 20); // TODO Auto-generated method
												// stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
