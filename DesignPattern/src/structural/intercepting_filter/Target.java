package structural.intercepting_filter;

public class Target implements Filter {

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("Executing request: " + request);
	}

}
