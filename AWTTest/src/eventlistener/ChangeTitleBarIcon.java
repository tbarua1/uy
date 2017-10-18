package eventlistener;
import java.awt.*;
public class ChangeTitleBarIcon {
public ChangeTitleBarIcon() {
	// TODO Auto-generated constructor stub
	Frame f=new Frame();   
	Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");  
	f.setIconImage(icon);  
	f.setLayout(null);   
	f.setSize(400,400);   
	f.setVisible(true);   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ChangeTitleBarIcon();
	}

}
