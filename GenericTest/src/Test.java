import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test {
/*yyyy/MM/dd hh:mm:ss:SSSS	2017/03/01 06:47:30:0500
*MMM. dd, yy 'at' HH:mm:ss	Apr. 01, 17 at 16:47:30
*EEE, MMM d, ''yy		Thu, Apr 1, '17
*EEEEEE, MMMMM dd, yyyy		Thursday, April 01, 2017
*yyyyy.MMMMM.dd hh:mm aaa	02004.April.01 08:35 PM
*hh 'o''clock' a, zzzz		06 o'clock PM, Indian Standard Time
*yyyyMMddhh:mm:ss:SSS		2017040108:38:37:480*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = new GregorianCalendar();
		// try with default Locale
		DateFormat.getDateInstance(DateFormat.SHORT).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.MEDIUM).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.LONG).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.FULL).format(gc.getTime());
	
		//Using Locale
		DateFormat.getDateInstance(DateFormat.SHORT, 	Locale.GERMANY).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.MEDIUM, 	Locale.GERMANY).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.LONG, 	Locale.GERMANY).format(gc.getTime());
		DateFormat.getDateInstance(DateFormat.FULL, 	Locale.GERMANY).format(gc.getTime());		
	}

}
