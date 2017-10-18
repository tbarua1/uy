package close_window;

import java.awt.*;
import java.awt.event.*;

public class UsingAnonymous extends Frame {
	UsingAnonymous() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingAnonymous();
	}

}
