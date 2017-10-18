package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuItemWithActionListener implements ActionListener {
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;    
	MenuItemWithActionListener(){    
	f=new JFrame();    
	cut=new JMenuItem("cut");    
	copy=new JMenuItem("copy");    
	paste=new JMenuItem("paste");    
	selectAll=new JMenuItem("selectAll");    
	cut.addActionListener(this);    
	copy.addActionListener(this);    
	paste.addActionListener(this);    
	selectAll.addActionListener(this);    
	mb=new JMenuBar();    
	file=new JMenu("File");    
	edit=new JMenu("Edit");    
	help=new JMenu("Help");     
	edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
	mb.add(file);mb.add(edit);mb.add(help);    
	ta=new JTextArea();    
	ta.setBounds(5,5,360,320);    
	f.add(mb);f.add(ta);    
	f.setJMenuBar(mb);  
	f.setLayout(null);    
	f.setSize(400,400);    
	f.setVisible(true);    
	}     
	public void actionPerformed(ActionEvent e) {    
	if(e.getSource()==cut)    
	ta.cut();    
	if(e.getSource()==paste)    
	ta.paste();    
	if(e.getSource()==copy)    
	ta.copy();    
	if(e.getSource()==selectAll)    
	ta.selectAll();    
	}     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MenuItemWithActionListener();
	}

}
