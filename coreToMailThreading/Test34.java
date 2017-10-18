public class Test34 
{
public static void main(String[] args){
//Using Annonymous class !!
Runnable r=new Runnable(){
public void run(){
System.out.println("hello");			
}};
Thread t=new Thread(r);
t.start();

//Using Lambda !!
Runnable r2=()->{
System.out.println("hello from lambda !!");	
};
Thread t2=new Thread(r2);
t2.start();
}
}
