package creational.factory;

public class OperatingSystemFactory {
	public OS getInstance(String ss) {

		if (ss.equals("Open")) {
			return new Android();
		} 
		if (ss.equals("Closed")) {
			return new iOS();
		} 
		else {
			return new Windows();
		}

	}
}
