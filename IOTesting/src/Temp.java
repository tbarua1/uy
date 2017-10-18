	// In this program, we can call the function in the 
	//class level use both static or nonstatic.

	class Temp
  {
	 			//static int x=show();
				//static int show()
	int x=show();
	int show()
  {
	return 10;
  }
	public static void main(String str[])
  {	
	//System.out.println(x);
	System.out.println(new Temp().x);
  }
  }