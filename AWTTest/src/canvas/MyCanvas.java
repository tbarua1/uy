package canvas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class MyCanvas extends Component {
	public MyCanvas() {
		// TODO Auto-generated constructor stub
		setBackground(Color.CYAN);
		setSize(300, 200);
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(75, 75, 150, 75);
	}
}