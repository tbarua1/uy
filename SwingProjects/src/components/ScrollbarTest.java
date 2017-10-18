package components;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollbarTest {
	ScrollbarTest(){  
	    JFrame f= new JFrame("Scrollbar Example");  
	 JScrollBar s=new JScrollBar();  
	s.setBounds(100,100, 50,100);  
	f.add(s);  
	f.setSize(400,400);  
	f.setLayout(null);  
	f.setVisible(true);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScrollbarTest();
	}

}
