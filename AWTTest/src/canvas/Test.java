package canvas;

import java.awt.*;

public class Test {
	Test() {
		Frame f = new Frame("Canvas Example");
		f.add(new MyCanvas());
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}
