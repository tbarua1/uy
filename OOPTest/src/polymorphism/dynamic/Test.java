package polymorphism.dynamic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad Obj = new OverLoad();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);

	}

}
