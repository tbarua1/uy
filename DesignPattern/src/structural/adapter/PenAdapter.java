package structural.adapter;

public class PenAdapter implements Pen{
PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		System.out.println("i am from Pen Adapter");
	pp.mark(str);
	}

}
