package how.create;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserTest extends JFrame implements ActionListener {
	JButton b;    
	Container c;    
	ColorChooserTest(){    
	    c=getContentPane();    
	    c.setLayout(new FlowLayout());         
	    b=new JButton("color");    
	    b.addActionListener(this);         
	    c.add(b);    
	}    
	public void actionPerformed(ActionEvent e) {    
	Color initialcolor=Color.RED;    
	Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);    
	c.setBackground(color);    
	}    
	    
	public static void main(String[] args) {    
		ColorChooserTest ch=new ColorChooserTest();    
	    ch.setSize(400,400);    
	    ch.setVisible(true);    
	    ch.setDefaultCloseOperation(EXIT_ON_CLOSE);    
	}    
}
