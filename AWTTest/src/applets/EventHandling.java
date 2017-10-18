package applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling extends Applet implements ActionListener{

	Button b;  
	TextField tf;  
	  
	public void init(){  
	tf=new TextField();  
	tf.setBounds(30,40,150,20);  
	  
	b=new Button("Click");  
	b.setBounds(80,150,60,50);  
	  
	add(b);add(tf);  
	b.addActionListener(this);  
	  
	setLayout(null);  
	}  
	  
	 public void actionPerformed(ActionEvent e){  
	  tf.setText("Welcome");  
	 }   
}
