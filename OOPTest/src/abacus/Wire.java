package abacus;

public class Wire {
	private int x1 = 0;
	private int x2 = 0;
	private int x3 = 0;
	private int x4 = 0;
	private int x5 = 0;
	private double sum=0.0;

	public void setSum(double sum) {
		this.sum = sum;
	}

//	@Override
//	public String toString() {
//		return "Wire [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", x5=" + x5 + ", sum=" + sum + "]";
//	}

	public double getSum() {
		sum=x1 + x2 + x3 + x4 + x5;
		return sum;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getX5() {
		return x5;
	}

	public void setX5(int x5) {
		this.x5 = x5;
	}

}
