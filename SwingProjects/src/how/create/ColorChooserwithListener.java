package how.create;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ColorChooserwithListener extends JFrame implements ActionListener {
	JFrame f;  
	JButton b;  
	JTextArea ta;  
	ColorChooserwithListener(){  
	    f=new JFrame("Color Chooser Example.");  
	    b=new JButton("Pad Color");  
	    b.setBounds(200,250,100,30);  
	    ta=new JTextArea();  
	    ta.setBounds(10,10,300,200);  
	    b.addActionListener(this);  
	    f.add(b);f.add(ta);  
	    f.setLayout(null);  
	    f.setSize(400,400);  
	    f.setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e){  
	    Color c=JColorChooser.showDialog(this,"Choose",Color.CYAN);  
	    ta.setBackground(c);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ColorChooserTest();
	}

}
