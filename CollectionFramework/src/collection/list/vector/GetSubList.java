package collection.list.vector;

import java.util.List;
import java.util.Vector;

public class GetSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		vct.add("Click");
                String s="Hell how are you \t df df  dfg "
                        + " dfgdf "
                        + "fg f";
                System.out.println(""+s);
            String substring = s.substring(3, 7);
            System.out.println(""+substring);
            
		System.out.println("Actual vector:" + vct);
		List<String> list = vct.subList(2, 4);
		System.out.println("Sub List: " + list);
	}

}
