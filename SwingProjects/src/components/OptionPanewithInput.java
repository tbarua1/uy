package components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPanewithInput {
	JFrame f;  
	 OptionPanewithInput(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new OptionPanewithInput();
	}

}
