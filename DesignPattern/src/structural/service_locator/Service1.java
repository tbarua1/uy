package structural.service_locator;

public class Service1 implements Service {
	public void execute(){
	      System.out.println("Executing Service1");
	   }

	   @Override
	   public String getName() {
	      return "Service1";
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
