package applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Test extends Applet {
	int squareSize = 50; // initialized to default size

	public void init() {
		String squareSizeParam = getParameter("squareSize");
		parseSquareSize(squareSizeParam);

		String colorParam = getParameter("color");
		Color fg = Color.BLUE;

		setBackground(Color.black);
		setForeground(fg);
	}

	private void parseSquareSize(String param) {
		if (param == null)
			return;
		try {
			squareSize = Integer.parseInt(param);
		} catch (Exception e) {
			// Let default value remain
		}
	}

//	private Color parseColor(String param) {
//	}

	public void paint(Graphics g) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
