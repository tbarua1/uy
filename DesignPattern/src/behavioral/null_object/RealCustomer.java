package behavioral.null_object;

public class RealCustomer extends AbstractCustomer {

	 public RealCustomer(String name) {
	      this.name = name;		
	   }
	   
	   @Override
	   public String getName() {
	      return name;
	   }
	   
	   @Override
	   public boolean isNil() {
	      return false;
	   }
	   
//	@Override
//	public boolean isNil() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
