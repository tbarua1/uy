package behavioral.observer;

public class OctalObserver extends Observer {
	 public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }

//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//
//	}

}
