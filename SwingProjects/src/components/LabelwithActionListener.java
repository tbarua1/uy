package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelwithActionListener extends JFrame implements ActionListener {
	 JTextField tf; JLabel l; JButton b;  
	 LabelwithActionListener(){  
	        tf=new JTextField();  
	        tf.setBounds(50,50, 150,20);  
	        l=new JLabel();  
	        l.setBounds(50,100, 250,20);      
	        b=new JButton("Find IP");  
	        b.setBounds(50,150,95,30);  
	        b.addActionListener(this);    
	        add(b);add(tf);add(l);    
	        setSize(400,400);  
	        setLayout(null);  
	        setVisible(true);  
	    }  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new 	LabelwithActionListener();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		  try{  
		        String host=tf.getText();  
		        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
		        l.setText("IP of "+host+" is: "+ip);  
		        }catch(Exception ex){System.out.println(ex);}  	
	}

}
