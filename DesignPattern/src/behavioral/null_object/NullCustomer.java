package behavioral.null_object;

public class NullCustomer extends AbstractCustomer {
	@Override
	   public String getName() {
	      return "Not Available in Customer Database";
	   }

	   @Override
	   public boolean isNil() {
	      return true;
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
