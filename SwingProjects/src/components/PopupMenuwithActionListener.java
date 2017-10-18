package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenuwithActionListener {
	PopupMenuwithActionListener(){  
         final JFrame f= new JFrame("PopupMenu Example");  
         final JLabel label = new JLabel();          
         label.setHorizontalAlignment(JLabel.CENTER);  
         label.setSize(400,100);  
         final JPopupMenu popupmenu = new JPopupMenu("Edit");   
         JMenuItem cut = new JMenuItem("Cut");  
         JMenuItem copy = new JMenuItem("Copy");  
         JMenuItem paste = new JMenuItem("Paste");  
         popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
        cut.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e) {              
             label.setText("cut MenuItem clicked.");  
         }  
        });  
        copy.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
                label.setText("copy MenuItem clicked.");  
            }  
           });  
        paste.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
                label.setText("paste MenuItem clicked.");  
            }  
           });  
         f.add(label); f.add(popupmenu);   
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
     }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new PopupMenuwithActionListener();
	}

}
