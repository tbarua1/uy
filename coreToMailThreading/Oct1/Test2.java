// Lambda in Threading !!
package Oct1;
public class Test2 //extends Thread
{
public static void main(String[] args){
/*Runnable r=()->{
System.out.println("hello");	
};
}}*/

	/*Thread t=new Thread(()->{
	System.out.println("hello");
	});
	t.start();
	*/
	
Thread tt=new Thread(new Runnable() {
	@Override
	public void run() {
			// TODO Auto-generated method stub
			
		}
	});tt.start();
}}


