package components;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableSelectionListenerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Table Example");  
        String data[][]={ {"101","Tarkeshwar","600"},    
                                                                   {"102","Tarun","700"},    
                                                                   {"101","Manju","700"}};    
                        String column[]={"ID","NAME","SALARY"};         
                        final JTable jt=new JTable(data,column);    
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
          public void valueChanged(ListSelectionEvent e) {  
            String Data = null;  
            int[] row = jt.getSelectedRows();  
            int[] columns = jt.getSelectedColumns();  
            for (int i = 0; i < row.length; i++) {  
              for (int j = 0; j < columns.length; j++) {  
                Data = (String) jt.getValueAt(row[i], columns[j]);  
              } }  
            System.out.println("Table element selected is: " + Data);    
          }       
        });  
        JScrollPane sp=new JScrollPane(jt);    
        f.add(sp);  
        f.setSize(300, 200);  
        f.setVisible(true);  
	}

}
