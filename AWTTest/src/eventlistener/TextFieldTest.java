package eventlistener;

import java.awt.Frame;
import java.awt.TextField;

public class TextFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame f= new Frame("TextField Example");  
		    TextField t1,t2;  
		    t1=new TextField("Application Form.");  
		    t1.setBounds(50,100, 200,30);  
		    t2=new TextField("AWT Example");  
		    t2.setBounds(50,150, 200,30);  
		    f.add(t1); f.add(t2);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
	}

}
