package eventlistener.outerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outer implements ActionListener{
	Test obj;  
	Outer(Test obj){  
	this.obj=obj;  
	}  
	public void actionPerformed(ActionEvent e){  
	obj.tf.setText("welcome");  
	}  
}
