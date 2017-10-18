package components;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxTest {
	JFrame f;    
	ComboBoxTest(){    
	    f=new JFrame("ComboBox Example");    
	    String country[]={"India","Bangladesh","U.S.A","England","Newzealand"};        
	    JComboBox cb=new JComboBox(country);    
	    cb.setBounds(50, 50,90,20);    
	    f.add(cb);        
	    f.setLayout(null);    
	    f.setSize(400,500);    
	    f.setVisible(true);         
	}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ComboBoxTest();
	}

}
