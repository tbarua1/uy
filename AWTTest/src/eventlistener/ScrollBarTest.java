package eventlistener;
import java.awt.*;
public class ScrollBarTest {
public ScrollBarTest() {
	// TODO Auto-generated constructor stub
	Frame f= new Frame("Scrollbar Example");  
    Scrollbar s=new Scrollbar();  
    s.setBounds(100,100, 50,100);  
    f.add(s);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScrollBarTest();
	}

}
