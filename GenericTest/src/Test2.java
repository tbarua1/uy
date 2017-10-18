import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = new GregorianCalendar();
		// try with default Locale
		gc.setTime(new Date());
		
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(gc.getTime()));
	
		//Using Locale
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG, 	Locale.ENGLISH).format(gc.getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, 	Locale.ENGLISH).format(gc.getTime()));		
	System.out.println(gc);
	}

}
