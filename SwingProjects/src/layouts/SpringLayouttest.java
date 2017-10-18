package layouts;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SpringLayouttest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// TODO Auto-generated method stub
		 Container contentPane = frame.getContentPane();
	        SpringLayout layout = new SpringLayout();
	        contentPane.setLayout(layout);
	        contentPane.add(new JLabel("Label: "));
	        contentPane.add(new JTextField("Text field", 15));
	    
	        frame.pack();
	        frame.setVisible(true);
	}

}
