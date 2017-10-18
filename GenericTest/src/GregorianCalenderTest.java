import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = new GregorianCalendar(2004,06, 01);
		Date d=new Date();
		System.out.println("Current Date "+d);
		  System.out.println("Day of year: " + 	gc.get(Calendar.DAY_OF_YEAR)); 

		 System.out.println("Week of year: " + 	gc.get(Calendar.WEEK_OF_YEAR)); 
	}

}
