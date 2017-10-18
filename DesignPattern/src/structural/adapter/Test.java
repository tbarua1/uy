package structural.adapter;

public class Test {
	/*
	 * Adapter design pattern is one of the structural design pattern and its
	 * used so that two unrelated interfaces can work together. The object that
	 * joins these unrelated interface is called an Adapter. As a real life
	 * example, we can think of a mobile charger as an adapter because mobile
	 * battery needs 3 volts to charge but the normal socket produces either
	 * 120V (US) or 240V (India). So the mobile charger works as an adapter
	 * between mobile charging socket and the wall socket
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PilotPen pilotPen=new PilotPen();
		Pen pen = new PenAdapter();
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setP(pen);
		assignmentWork.writeAssignment("i am from School");
	}

}
