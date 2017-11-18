/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author uys41
 */
public class Outer implements ActionListener{  
Event2 obj;  
Outer(Event2 obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("welcome");  
	}  
	}  

