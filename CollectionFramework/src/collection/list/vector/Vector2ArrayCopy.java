package collection.list.vector;

import java.util.Vector;

public class Vector2ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:"+vct);
		String[] copyArr = new String[vct.size()];
		vct.copyInto(copyArr);
		System.out.println("Copied Array content:");
		for(String str:copyArr){
			System.out.println(str);
		}
	}

}
