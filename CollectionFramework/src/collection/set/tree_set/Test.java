package collection.set.tree_set;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AddressBookEntry addr1 = new AddressBookEntry("Tarkeshwar");
	      AddressBookEntry addr2 = new AddressBookEntry("Tarun");
	      AddressBookEntry addr3 = new AddressBookEntry("Manju");
	 
	      TreeSet<AddressBookEntry> set = new TreeSet<AddressBookEntry>();
	      set.add(addr1);
	      set.add(addr2);
	      set.add(addr3);
	      System.out.println(set); 
	 
	      System.out.println("floor - "+set.floor(addr2));  
	      System.out.println("Lower - "+set.lower(addr2));  
	      System.out.println("headset(excluded) - "+set.headSet(addr2)); 
	      System.out.println("tailSet - "+set.tailSet(addr2)); 
	}

}
