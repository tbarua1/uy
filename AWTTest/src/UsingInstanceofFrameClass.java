import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class UsingInstanceofFrameClass {
	UsingInstanceofFrameClass()
	   {
	      //Creating Frame    
	      Frame fr=new Frame();       
	      
	      //Creating a label
	      Label lb = new Label("UserId: "); 
	      
	      //adding label to the frame
	      fr.add(lb);           
	      
	      //Creating Text Field
	      TextField t = new TextField();
	      
	      //adding text field to the frame
	      fr.add(t);
	      
	      //setting frame size
	      fr.setSize(500, 300);  
	      
	      //Setting the layout for the Frame
	      fr.setLayout(new FlowLayout());
	            
	      fr.setVisible(true);                
	   }
	public static void main(String[] args) {
	new UsingInstanceofFrameClass();	// TODO Auto-generated method stub

	}

}
