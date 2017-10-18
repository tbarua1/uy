package operations;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("first record retrived - "+numbers.get(0));
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//it's very slow
		numbers.remove(0);
		//you have to very carefull to remove last one
		numbers.remove(numbers.size()-1);
		System.out.println("After Removing from List");
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
//		for (int i = 0; i < numbers.size(); i++) {
//			
//		}
	}

}
