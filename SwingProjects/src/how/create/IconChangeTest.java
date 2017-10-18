package how.create;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
//    jar -cvmf myfile.mf myjar.jar First.class  
public class IconChangeTest {
	IconChangeTest (){     
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");    
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
		}     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
