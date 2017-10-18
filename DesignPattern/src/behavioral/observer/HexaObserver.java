package behavioral.observer;

public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}

	// @Override
	// public void update() {
	// // TODO Auto-generated method stub
	//
	// }

}
