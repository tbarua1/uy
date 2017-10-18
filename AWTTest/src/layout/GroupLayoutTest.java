package layout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
public class GroupLayoutTest extends JFrame {
public GroupLayoutTest() {

	// TODO Auto-generated constructor stub
	 JLabel label = new JLabel("Find What:");;
     JTextField textField = new JTextField();
     JCheckBox caseCheckBox = new JCheckBox("Match Case");
     JCheckBox wrapCheckBox = new JCheckBox("Wrap Around");
     JCheckBox wholeCheckBox = new JCheckBox("Whole Words");
     JCheckBox backCheckBox = new JCheckBox("Search Backwards");
     JButton findButton = new JButton("Find");
     JButton cancelButton = new JButton("Cancel");

     // remove redundant default border of check boxes - they would hinder
     // correct spacing and aligning (maybe not needed on some look and feels)
     caseCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
     wrapCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
     wholeCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
     backCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setAutoCreateGaps(true);
     layout.setAutoCreateContainerGaps(true);

     layout.setHorizontalGroup(layout.createSequentialGroup()
         .addComponent(label)
         .addGroup(layout.createParallelGroup(Alignment.LEADING)
             .addComponent(textField)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(Alignment.LEADING)
                     .addComponent(caseCheckBox)
                     .addComponent(wholeCheckBox))
                 .addGroup(layout.createParallelGroup(Alignment.LEADING)
                     .addComponent(wrapCheckBox)
                     .addComponent(backCheckBox))))
         .addGroup(layout.createParallelGroup(Alignment.LEADING)
             .addComponent(findButton)
             .addComponent(cancelButton))
     );
     
     layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

     layout.setVerticalGroup(layout.createSequentialGroup()
         .addGroup(layout.createParallelGroup(Alignment.BASELINE)
             .addComponent(label)
             .addComponent(textField)
             .addComponent(findButton))
         .addGroup(layout.createParallelGroup(Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                     .addComponent(caseCheckBox)
                     .addComponent(wrapCheckBox))
                 .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                     .addComponent(wholeCheckBox)
                     .addComponent(backCheckBox)))
             .addComponent(cancelButton))
     );

     setTitle("Find");
     pack();
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(
	                                  "javax.swing.plaf.metal.MetalLookAndFeel");
	                                //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	                                //UIManager.getCrossPlatformLookAndFeelClassName());
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	                new GroupLayoutTest().setVisible(true);
	            }
	        });
	}

}
