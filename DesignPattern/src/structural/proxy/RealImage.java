package structural.proxy;



public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

//	@Override
//	public void display() {
//		System.out.println("Displaying " + fileName);
//	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading RealImage " + fileName);
	}
	// public RealImage(URL url) {
	// loadImage(url);
	// }
	//
	// @Override
	// public void displayImage() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// private void loadImage(URL url) {
	//
	// }

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Displaying RealImage" + fileName);
	}
}
