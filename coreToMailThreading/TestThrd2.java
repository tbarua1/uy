//join Function 
public class TestThrd2 implements Runnable
{
public void run()
{
for (int i = 0; i < 3; i++){
System.out.println(i+" "+Thread.currentThread().getName());
try {
Thread.sleep(1800);
}
catch (InterruptedException e){
e.printStackTrace();
}
}}
public static void main(String[] args){
/*Runtime r=Runtime.getRuntime();
System.out.println(r.totalMemory());
System.out.println(r.freeMemory()); */
	
System.out.println(Thread.currentThread().getName());
System.out.println("**********");
TestThrd2 ref=new TestThrd2();
Thread t1=new Thread(ref);
Thread t2=new Thread(ref);
Thread t3=new Thread(ref);
Thread t4=new Thread(ref);

t1.setName("Tarun");
t1.start();

try {
t1.join();
} catch (InterruptedException e){
e.printStackTrace();
}

t2.setName("Sagun");
t2.start();
try {
t2.join();
} catch (InterruptedException e) {
e.printStackTrace();
}

t3.setName("Mohit");
t3.start();

try {
t3.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
t4.setName("Akshay");
t4.start();


//t1.start();
//t2.start(); 
/*System.out.println("Runtime Operations !!");
Runtime r1=Runtime.getRuntime();
System.out.println(r1.totalMemory());
System.out.println(r1.freeMemory()); */
}
}
