
public class FactorialNumber {
	int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n + 1); // Error, you meant n - 1
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber factorialNumber = new FactorialNumber();
		System.out.println(factorialNumber.factorial(5));
	}
//	public void getFectorialNumber(int num){
//		for(int i=1;i<=num;/*i=i*i*/){
//			num=num*i;
//		}
//		System.out.println(num);
//	}

}
