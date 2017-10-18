import java.lang.Thread.State;

public class WelComeThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		State state = Thread.currentThread().getState();
		String threadGroupName = Thread.currentThread().getThreadGroup().
				getName();
		System.out.println("id="+id+"\n name="+name+"\n priority="+
				priority+"\n state="+state+"\n threadGroupName="+
				threadGroupName);
	}

}
