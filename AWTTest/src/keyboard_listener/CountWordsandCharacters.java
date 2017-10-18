package keyboard_listener;
import java.awt.*;
import java.awt.event.*;
public class CountWordsandCharacters extends Frame implements KeyListener{
	   Label l;  
	    TextArea area;  
	    CountWordsandCharacters(){  
	          
	        l=new Label();  
	        l.setBounds(20,50,200,20);  
	        area=new TextArea();  
	        area.setBounds(20,80,300, 300);  
	        area.addKeyListener(this);  
	          
	        add(l);add(area);  
	        setSize(400,400);  
	        setLayout(null);  
	        setVisible(true); } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new CountWordsandCharacters();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 String text=area.getText();  
	        String words[]=text.split("\\s");  
	        l.setText("Words: "+words.length+" Characters:"+text.length());  	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
