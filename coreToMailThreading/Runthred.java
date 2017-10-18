/**********Thread using  a same class and pass the reference**********/

class Thread5 implements Runnable
{
/*Thread5(String s)
{
super(s);
}*/
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}
class Runthred
{
public static void main(String str[])
{
Thread5 t1=new Thread5();
Thread t2=new Thread(t1,"thread2");
Thread t3=new Thread(t1,"thread3");
t2.start();
t3.start();
}
}

