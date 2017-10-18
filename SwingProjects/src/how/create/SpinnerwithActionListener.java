package how.create;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerwithActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   JFrame f=new JFrame("Spinner Example");    
		    final JLabel label = new JLabel();            
		             label.setHorizontalAlignment(JLabel.CENTER);    
		             label.setSize(250,100);    
		    SpinnerModel value =  
		             new SpinnerNumberModel(5, //initial value  
		                0, //minimum value  
		                10, //maximum value  
		                1); //step  
		    JSpinner spinner = new JSpinner(value);   
		            spinner.setBounds(100,100,50,30);    
		            f.add(spinner);  f.add(label);  
		           f.setSize(300,300);    
		           f.setLayout(null);    
		           f.setVisible(true);     
		           spinner.addChangeListener(new ChangeListener() {  
		        public void stateChanged(ChangeEvent e) {  
		         label.setText("Value : " + ((JSpinner)e.getSource()).getValue());  
		        }  
		     });  
	}

}
