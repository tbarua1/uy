package eventlistener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DialogBoxTest {
	 private static Dialog d;  
public DialogBoxTest() {
	// TODO Auto-generated constructor stub
	 Frame f= new Frame();  
     d = new Dialog(f , "Dialog Example", true);  
     d.setLayout( new FlowLayout() );  
     Button b = new Button ("OK");  
     b.addActionListener ( new ActionListener()  
     {  
         public void actionPerformed( ActionEvent e )  
         {  
             DialogBoxTest.d.setVisible(false);  
         }  
     });  
     d.add( new Label ("Click button to continue."));  
     d.add(b);   
     d.setSize(300,300);    
     d.setVisible(true);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new DialogBoxTest();
	}

}
