/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author uys41
 */
public class Event2 extends JFrame {

    JTextField tf;  
	Event2(){  
	tf=new JTextField();  
	tf.setBounds(60,50,170,20);  
	JButton b=new JButton("click me");  
	b.setBounds(50,120,80,30);  
	  
	b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        
        tf.setText("UY Systems");
                            }
                    }); 
        
	add(b);add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  


    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Event2();
    }
    
}
