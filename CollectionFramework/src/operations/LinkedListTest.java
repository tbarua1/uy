package operations;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		LinkedList<Integer> number = new LinkedList<Integer>();
		new LinkedListTest().performanceTest(number);
		new LinkedListTest().performanceTest(numbers);
	}
	public void performanceTest(List list){
	
	for(int i=0;i<10;i++)
	{long start=System.currentTimeMillis();
		list.add(start);
		long end=System.currentTimeMillis();
		System.out.println("Time taken "+(end-start));
	}

	
	}

}
