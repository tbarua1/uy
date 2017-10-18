package date;

import java.util.Calendar;


public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
	     System.out.println("Today is " +
	        (c.get(Calendar.MONTH)+1) + "/" +
	         c.get(Calendar.DATE) + "/" +
	         c.get(Calendar.YEAR));
			}

}
