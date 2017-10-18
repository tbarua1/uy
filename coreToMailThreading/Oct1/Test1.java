// Joining and Sleeping in Threading !!

package Oct1;
public class Test1 implements Runnable
{
@Override
public void run() {
for (int i = 0; i < 5; i++) {
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	e.printStackTrace();
}
System.out.println(Thread.currentThread().getName()+" "+i);
}}	
public static void main(String[] args) {

	System.out.println(Thread.currentThread().getName());
	
	Test1 t=new Test1();
	Thread ref=new Thread(t);
	ref.setName("Tarun");
	ref.start();
	
	try {
		ref.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Thread ref2=new Thread(t);
	ref2.setName("Sagun");
	ref2.start();

	try {
		ref2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Thread ref3=new Thread(t);
	ref3.setName("Mihir");
	ref3.start();
	
	try {
		ref3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Thread ref4=new Thread(t);
	ref4.setName("abcd");
	ref4.start();
	
	
}
}
