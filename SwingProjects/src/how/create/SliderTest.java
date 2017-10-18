package how.create;

import java.awt.Frame;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderTest extends Frame{
	SliderTest() {  
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		JPanel panel=new JPanel();  
		panel.add(slider);  
		add(panel); 
		pack();  
		setVisible(true);  
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SliderTest();

	}

}
