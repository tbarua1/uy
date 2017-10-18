package eventlistener;
import java.awt.*;
public class CheckboxGroupTest {
	CheckboxGroupTest(){    
	       Frame f= new Frame("CheckboxGroup Example");    
	        CheckboxGroup cbg = new CheckboxGroup();  
	        Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
	        checkBox1.setBounds(100,100, 50,50);    
	        Checkbox checkBox2 = new Checkbox("Java", cbg, true);    
	        checkBox2.setBounds(100,150, 50,50);    
	        f.add(checkBox1);    
	        f.add(checkBox2);    
	        f.setSize(400,400);    
	        f.setLayout(null);    
	        f.setVisible(true); } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new CheckboxGroupTest();
	}

}
