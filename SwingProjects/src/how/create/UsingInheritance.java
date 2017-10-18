package how.create;

import javax.swing.JButton;
import javax.swing.JFrame;
/*

    Light Weight − Swing components are independent of native Operating System's API as Swing API controls are rendered mostly using pure JAVA code instead of underlying operating system calls.

    Rich Controls − Swing provides a rich set of advanced controls like Tree, TabbedPane, slider, colorpicker, and table controls.

    Highly Customizable − Swing controls can be customized in a very easy way as visual apperance is independent of internal representation.

    Pluggable look-and-feel − SWING based GUI Application look and feel can be changed at run-time, based on available values.
*/
public class UsingInheritance extends JFrame{
	JFrame f;  
	UsingInheritance(){  
	JButton b=new JButton("click");//create button  
	b.setBounds(130,100,100, 40);  
	          
	add(b);//adding button on frame  
	setSize(400,500);  
	setLayout(null);  
	setVisible(true);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new UsingInheritance();
	}

}
