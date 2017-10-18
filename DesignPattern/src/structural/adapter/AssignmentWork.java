package structural.adapter;

public class AssignmentWork {
	private Pen p;
	
public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

public void writeAssignment(String str){
	p.write(str);
	
}
}
