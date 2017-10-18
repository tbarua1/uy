class RunThread3 implements Runnable
{
int x=5;
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(x);
}
}
}
class MainThread1
{
public static void main(String str[])
{
RunThread3 r=new RunThread3();

Thread t=new Thread(r,"sdf");
r.x=10;
t.start();
RunThread3 r1=new RunThread3();

Thread tt=new Thread(r1,"dd");
tt.start();
}
}