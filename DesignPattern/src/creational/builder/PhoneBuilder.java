package creational.builder;

public class PhoneBuilder {
	private String os,processor;
	private double screenSize;
	private int battery,camera;

public Phone getPhone(){
	return new Phone(os, processor, screenSize, battery, camera);
}

	public PhoneBuilder() {
		super();
	}
	public PhoneBuilder(String os, String processor, double screenSize, int battery, int camera) {
		//super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	public String getOs() {
		return os;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public String getProcessor() {
		return processor;
		
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public int getBattery() {
		return battery;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public int getCamera() {
		return camera;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + "]";
	}



}
