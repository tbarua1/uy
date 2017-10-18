package components;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame f= new JFrame("TextField Example");  
		    JTextField t1,t2;  
		    t1=new JTextField("Welcome to Javatpoint.");  
		    t1.setBounds(50,100, 200,30);  
		    t2=new JTextField("AWT Tutorial");  
		    t2.setBounds(50,150, 200,30);  
		    f.add(t1); f.add(t2);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
	}

}
