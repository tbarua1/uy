class CurrentThreadDemo{
public static void main(String str[])
{

		Thread t=Thread.currentThread();
		System.out.println("current thread:"+t);
//Change the name of the thread
		t.setName("My Thread");
		System.out.println("After the name change:"+t);
	try{

		for(int i=5;i>0;i--)
		System.out.println(i);
		Thread.sleep(1000);
	}
		catch(Exception e){
}
}
}