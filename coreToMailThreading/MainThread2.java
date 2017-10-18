class Thread6 extends Thread
{
int x=90;
public void run()
{

System.out.println(Thread.currentThread().getName()+""+"Starting method"+x);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
System.out.println(Thread.currentThread().getName()+""+"Ending in method"+x);
}
}
class MainThread2
{
public static void main(String str[])
{
Thread6 t1=new Thread6();
Thread t=new Thread(t1,"thread1");
t1.x=10;
t.start();
Thread t4=new Thread(t1,"thread2");
t1.x=100;
t4.start();
Thread t5=new Thread(t1,"thread3");
t1.x=1000;
t5.start();
for(int i=0;i<10;i++)
System.out.println(Thread.currentThread().getName());
}
}

