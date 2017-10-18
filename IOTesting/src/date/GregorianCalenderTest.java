package date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GregorianCalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = new GregorianCalendar();
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, 	Locale.ENGLISH).format(gc.getTime()));
	System.out.println(gc);
	
	Calendar gc1 = new GregorianCalendar(2004,06, 01);
	  System.out.println("Day of year: " + 	gc1.get(Calendar.DAY_OF_YEAR)); 

	 System.out.println("Week of year: " + 	gc1.get(Calendar.WEEK_OF_YEAR)); 

	}

}
