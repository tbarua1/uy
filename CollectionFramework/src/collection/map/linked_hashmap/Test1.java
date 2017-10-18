package collection.map.linked_hashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Zara", new Double(3434.34));
		lhm.put("Mahnaz", new Double(123.22));
		lhm.put("Ayan", new Double(1378.00));
		lhm.put("Daisy", new Double(99.22));
		lhm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set set = lhm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = ((Double) lhm.get("Zara")).doubleValue();
		lhm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + lhm.get("Zara"));
	}

}
