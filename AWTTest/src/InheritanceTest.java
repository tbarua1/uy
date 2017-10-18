import java.awt.Button;
import java.awt.Frame;

public class InheritanceTest extends Frame {

	InheritanceTest() {
		Button b = new Button("Hello I am Button");
		b.setBounds(30, 100, 80, 30);// setting button position
		add(b);// adding button into frame
		setSize(300, 300);// frame size 300 width and 300 height
		setLayout(null);// no layout manager
		setVisible(true);// now frame will be visible, by default not visible
	}

	public static void main(String args[]) {
		InheritanceTest f = new InheritanceTest();
	}

}
