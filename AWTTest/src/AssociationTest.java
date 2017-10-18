import java.awt.Button;
import java.awt.Frame;

public class AssociationTest {
	AssociationTest(){  
		Frame f=new Frame();  
		Button b=new Button("Hello I am Button");  
		b.setBounds(30,50,80,30);  
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
		}  
		public static void main(String args[]){  
			AssociationTest f=new AssociationTest();  
		}
}
