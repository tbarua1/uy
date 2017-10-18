public class TestThrd1 
{
public static void main(String[] args)
{
System.out.println("In Main Thread !!");
Runnable rr=() -> {
for (int i = 0; i < 10; i++)
{
System.out.println(i);
}};
new Thread(rr).start();

/*Runnable r=new Runnable(){
	@Override
	public void run(){
	System.out.println("UDT");
}}; 
Thread tt=new Thread(r); 
tt.start();*/

/*
Thread t=new Thread(()->{{
for (int i = 0; i < 10; i++)
System.out.println("UDT");
}});
t.start(); */
}
}

