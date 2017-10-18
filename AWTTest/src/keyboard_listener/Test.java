package keyboard_listener;
import java.awt.*;
import java.awt.event.*;
public class Test extends Frame implements KeyListener{
	 Label l;  
	    TextArea area;  
	    Test(){  
	          
	        l=new Label();  
	        l.setBounds(20,50,100,20);  
	        area=new TextArea();  
	        area.setBounds(20,80,300, 300);  
	        area.addKeyListener(this);  
	          
	        add(l);add(area);  
	        setSize(400,400);  
	        setLayout(null);  
	        setVisible(true);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText("Key Pressed");  	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText("Key Released");  
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText("Key Typed");  	
	}

}
