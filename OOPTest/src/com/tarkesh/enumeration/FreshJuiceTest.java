package com.tarkesh.enumeration;

public class FreshJuiceTest {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
FreshJuice juice=new FreshJuice();
juice.size=FreshJuice.FreshJuiceSize.MEDIUM;
//            NewEnum MEDIUM = NewEnum.MEDIUM;
System.out.println("Juice size - "+juice.size);
	}

}
