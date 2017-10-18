
public class StringtoNumber {
	public static void main(String[] args) {
		try {
			String s = "10";
                        int x=10;
			int i = Integer.valueOf(s);
			int j = Integer.parseInt(s);
			int k = i + j;
			System.out.println(k);
			System.out.println(i + " " + j);
		} catch (NumberFormatException e) {
			System.out.println("Error - "+e.toString());
		}
	}
}
