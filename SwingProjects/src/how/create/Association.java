package how.create;

import javax.swing.JButton;
import javax.swing.JFrame;
/*Swing API is a set of extensible GUI Components to ease the developer's life to create JAVA based Front End/GUI Applications. It is build on top of AWT API and acts as a replacement of AWT API, since it has almost every control corresponding to AWT controls. Swing component follows a Model-View-Controller architecture to fulfill the following criterias.

    A single API is to be sufficient to support multiple look and feel.

    API is to be model driven so that the highest level API is not required to have data.

    API is to use the Java Bean model so that Builder Tools and IDE can provide better services to the developers for use.
MVC Architecture

Swing API architecture follows loosely based MVC architecture in the following manner.

    Model represents component's data.

    View represents visual representation of the component's data.

    Controller takes the input from the user on the view and reflects the changes in Component's data.

    Swing component has Model as a seperate element, while the View and Controller part are clubbed in the User Interface elements. Because of which, Swing has a pluggable look-and-feel architecture.

*/
public class Association {
	
	JFrame f;  
	Association(){  
	f=new JFrame();//creating instance of JFrame  
	          
	JButton b=new JButton("click");//creating instance of JButton  
	b.setBounds(130,100,100, 40);  
	          
	f.add(b);//adding button in JFrame  
	          
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Association();
	}

}
