package comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComperatorTest {
	 public static class PhoneBookComparator implements Comparator<AddressBookEntry> {
	      @Override
	      public int compare(AddressBookEntry p1, AddressBookEntry p2) {
	         return p2.name.compareToIgnoreCase(p1.name);  // descending name
	      }
	   }
	 
	   public static void main(String[] args) {
	      AddressBookEntry addr1 = new AddressBookEntry("Tarkeshwar");
	      AddressBookEntry addr2 = new AddressBookEntry("Tarun");
	      AddressBookEntry addr3 = new AddressBookEntry("Manju");
	 
	      Comparator<AddressBookEntry> comp = new PhoneBookComparator();
	      TreeSet<AddressBookEntry> set = new TreeSet<AddressBookEntry>(comp);
	      set.add(addr1);
	      set.add(addr2);
	      set.add(addr3);
	      System.out.println(set);    
	 
	      Set<AddressBookEntry> newSet = set.descendingSet();  // Reverse the order
	      System.out.println(newSet); 
	   }
}
