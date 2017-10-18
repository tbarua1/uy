public class Test45 extends Thread
{
public void run(){
System.out.println("hello from normal Extends of Thread !!");		
}
public static void main(String[] args){
/*Runnable rr=new Runnable() {
@Override
public void run(){
System.out.println("Hello");
}}; */

//Thread tt=new Thread(rr);
//tt.start();
Test45 t=new Test45();
Thread ref=new Thread(t); 
ref.start();
}
}
