/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author uys41
 */
public class JavaApplication10 extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    //JFrame f;
    JButton b;
    
    JavaApplication10()
    {
     b=new JButton("click");//create button  
	b.setBounds(130,100,100, 40);  
	     b.addActionListener(this);
	add(b);//adding button on frame  
	setSize(400,500);  
	setLayout(null);  
	setVisible(true);  


    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String s=ae.getActionCommand();
        if(ae.getSource()==b)
        {
        b.setText("Button...");
        }
        else if (s.equals("Next")) {}
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication10 abc = new JavaApplication10();
        
        
    }
    
}
