import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	/*
	 * Java Swing tutorial is a part of Java Foundation Classes (JFC) that is
	 * used to create window-based applications. It is built on the top of AWT
	 * (Abstract Windowing Toolkit) API and entirely written in java.
	 * 
	 * Unlike AWT, Java Swing provides platform-independent and lightweight
	 * components.
	 * 
	 * The javax.swing package provides classes for java swing API such as
	 * JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu,
	 * JColorChooser etc.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}

}
