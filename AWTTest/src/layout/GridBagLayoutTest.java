package layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class GridBagLayoutTest extends JPanel{

	 protected void makebutton(String name, GridBagLayout gridbag,
			 GridBagConstraints c) {
		    Button button = new Button(name);
		    gridbag.setConstraints(button, c);
		    add(button);
		  }
	 GridBagLayoutTest() {
		    GridBagLayout gridbag = new GridBagLayout();
		    GridBagConstraints c = new GridBagConstraints();
		    setLayout(gridbag);
		    c.weightx = 2.0;
		    c.weighty = 2.0;
		    makebutton("Button 1", gridbag, c);
		    //c.fill = GridBagConstraints.BOTH;
		    makebutton("Button 2", gridbag, c);
		  }

		  public static void main(String args[]) {
		    Frame f = new Frame();
		    JPanel mgb = new GridBagLayoutTest();
		    f.add("Center", mgb);
		    f.pack();
		    f.setSize(300, 300);
		    f.setVisible(true);
		  }

}

