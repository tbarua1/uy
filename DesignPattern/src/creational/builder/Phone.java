package creational.builder;

public class Phone {
private String os,processor;
private double screenSize;
private int battery,camera;



public Phone(String os, String processor, double screenSize, int battery, int camera) {
	super();
	this.os = os;
	this.processor = processor;
	this.screenSize = screenSize;
	this.battery = battery;
	this.camera = camera;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public double getScreenSize() {
	return screenSize;
}
public void setScreenSize(double screenSize) {
	this.screenSize = screenSize;
}
public int getBattery() {
	return battery;
}
public void setBattery(int battery) {
	this.battery = battery;
}
public int getCamera() {
	return camera;
}
public void setCamera(int camera) {
	this.camera = camera;
}
@Override
public String toString() {
	return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
			+ ", camera=" + camera + "]";
}
}
