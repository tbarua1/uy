package structural.service_locator;

public class Service2 implements Service {
	public void execute(){
	      System.out.println("Executing Service2");
	   }

	   @Override
	   public String getName() {
	      return "Service2";
	   }
	
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void execute() {
//		// TODO Auto-generated method stub
//
//	}

}
