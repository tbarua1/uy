package eventlistener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BeepSoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame f=new Frame("ToolkitExample");  
		    Button b=new Button("beep");  
		    b.setBounds(50,100,60,30);  
		    f.add(b);     
		    f.setSize(300,300);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    b.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){  
		            Toolkit.getDefaultToolkit().beep();  
		        }  
		    });       
	}

}
