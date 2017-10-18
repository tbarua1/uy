package collection.map.linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class DeleteKeyObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<Price, String> hm = new LinkedHashMap<Price, String>();
	        hm.put(new Price("Banana", 20), "Banana");
	        hm.put(new Price("Apple", 40), "Apple");
	        hm.put(new Price("Orange", 30), "Orange");
	       
	       printMap(hm);
	        Price key = new Price("Banana", 20);
	        System.out.println("Deleting key...");
	        hm.remove(key);
	        System.out.println("After deleting key:");
	        printMap(hm);
	}
	public static void printMap(LinkedHashMap<Price, String> map){
        
        Set<Price> keys = map.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
