package layout;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutTest1 extends Frame {
	Button buttons[];  
	  
	 public BoxLayoutTest1() {  
	   buttons = new Button [5];  
	    
	   for (int i = 0;i<5;i++) {  
	      buttons[i] = new Button ("Button " + (i + 1));  
	      add (buttons[i]);  
	    }  
	  
	setLayout (new BoxLayout(this, BoxLayout.X_AXIS));  
	setSize(400,400);  
	setVisible(true);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new BoxLayoutTest1();
	}

}
