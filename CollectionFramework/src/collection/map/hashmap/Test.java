package collection.map.hashmap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in;
		try {
			in = new Scanner(new File(args[0]));
			//in = new Scanner(System.in);
			 Map<String, Integer> map = new HashMap<String, Integer>();
		      while (in.hasNext()) {
		         String word = in.next();
		         int freq = (map.get(word) == null) ? 1 : map.get(word) + 1;   // type-safe
		         map.put(word, freq);      // autobox int to Integer and upcast, type-check
		      }
		      System.out.println(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	     
	}

}
