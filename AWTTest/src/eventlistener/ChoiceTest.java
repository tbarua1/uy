package eventlistener;
import java.awt.*;
public class ChoiceTest {
	 ChoiceTest(){  
	        Frame f= new Frame();  
	        Choice c=new Choice();  
	        c.setBounds(100,100, 75,75);  
	        c.add("Item 1");  
	        c.add("Item 2");  
	        c.add("Item 3");  
	        c.add("Item 4");  
	        c.add("Item 5");  
	        f.add(c);  
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	     }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ChoiceTest();
	}

}
