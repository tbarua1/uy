package components;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest {
	JFrame f;    
    TableTest(){    
    f=new JFrame();    
    String data[][]={ {"101","Tarkeshwar","600"},    
                          {"102","Tarun","700"},    
                          {"101","Manju","700"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new TableTest();
	}

}
