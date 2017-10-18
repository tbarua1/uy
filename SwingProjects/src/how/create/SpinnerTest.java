package how.create;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class SpinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame f=new JFrame("Spinner Example");    
		    SpinnerModel value =  
		             new SpinnerNumberModel(5, //initial value  
		                0, //minimum value  
		                10, //maximum value  
		                1); //step  
		    JSpinner spinner = new JSpinner(value);   
		            spinner.setBounds(100,100,50,30);    
		            f.add(spinner);    
		            f.setSize(300,300);    
		            f.setLayout(null);    
		            f.setVisible(true);     
	}

}
