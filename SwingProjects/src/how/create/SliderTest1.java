package how.create;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderTest1 extends JFrame{
	 SliderTest1() {  
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		slider.setMinorTickSpacing(2);  
		slider.setMajorTickSpacing(10);  
		slider.setPaintTicks(true);  
		slider.setPaintLabels(true);  
		  
		JPanel panel=new JPanel();  
		panel.add(slider);  
		add(panel);
		pack();  
		setVisible(true);  
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SliderTest1();
	}

}
