// Timer class and TimerTask 

import java.util.Timer;
import java.util.TimerTask;
public class TimerDemo extends TimerTask
{
public void run() 
{
System.out.println("alarm ringing");
}
public static void main(String[] args) 
{
// Timer timer=new Timer();
//timer.schedule(new TimerDemo(), 5000);
//System.out.println("alarm will start after 5 sec");
Timer timer2=new Timer();
timer2.scheduleAtFixedRate(new TimerDemo(), 10*1000, 2*1000);
}
}
