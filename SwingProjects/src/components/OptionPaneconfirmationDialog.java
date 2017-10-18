package components;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneconfirmationDialog implements WindowListener {
	JFrame f;  
	OptionPaneconfirmationDialog (){  
	    f=new JFrame();   
	    f.addWindowListener(this);  
	    f.setSize(300, 300);  
	    f.setLayout(null);  
	    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
	    f.setVisible(true);  
	}  
	public void windowClosing(WindowEvent e) {  
	    int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
	if(a==JOptionPane.YES_OPTION){  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new OptionPaneconfirmationDialog();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
