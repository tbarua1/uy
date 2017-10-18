public class TestArray23 {
void Takethargument(int[] aaaa)
{
System.out.println(aaaa[0]);
System.out.println(aaaa[1]);   
}
public static void main(String[] args) 
{
/*	Annonymous Array !!

 	TestArray1 rrr=new TestArray1(); 
	rrr.Takethargument(new int[]{2111,3,5,6}); */
	TestArray23[] ref11=new TestArray23[5];

	Object[] obj=new Object[5];
	obj[0]="Tarun";
	obj[1]="Rathi";
	obj[2]=1.34f;
	System.out.println("Object's Array !!");
	System.out.println(obj[0]+"\n"+obj[1]+"\n"+obj[2]); 
	
	int[] a=new int[2];
	a[0]=2; a[1]=3;
	System.out.println(a[0]+" "+a[1]);

	int[][] ref=new int[3][];
	ref[0]=new int[2];
	ref[0][0]=5;
	ref[0][1]=4;
      //ref[0][2]=3;
	
	System.out.println(ref[0][0]);
	System.out.println(ref[0][1]);
      //System.out.println(ref[0][2]);
	ref[2]=new int[4];
	ref[2][0]=11;
	ref[2][1]=12;
	ref[2][2]=13;
	ref[2][3]=14;
	System.out.println(ref[2][3]);
	
	int[] ref2;
	ref2=new int[2];
	
	int[] ref3={2,4,5,2};
	
	System.out.println(ref3[0]);
	System.out.println("*******************");
	for (int i = 0; i < ref3.length; i++) {
      //System.out.println(i);
	System.out.println(ref3[i]);
	}
	System.out.println("########EnhancedFor Loop#######");
	for (int i : ref3) {
	System.out.println(i);
	}
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println(ref3[0]+" "+ref3[2]);
	
      //int[][] io=new int[][3]; //Not Valid !!
	int[][] ii=new int[1][3];
	ii[0]=new int[3];
	ii[0][0]=11; ii[0][1]=22; ii[0][2]=90;
	System.out.println(ii[0][0]);
	System.out.println(ii[0][2]);
	
	System.out.println("Just a Thought !!");
	int[][] ii2=new int[1][3];
	ii2[0]=new int[2];
	ii2[0][0]=10; ii2[0][1]=40;
	System.out.println(ii2[0][0]+" "+ii2[0][1]);
      //ii2[4]=new int[2]; ii2[4][0]=10;   Not Valid !! 
      //System.out.println(ii2[4][0]);     Not Valid !!
	
	int[] rr=new int[4];
	rr[0]=-2;
      /*int y=-4; rr[y]=10;
	System.out.println(rr[y]); */ // Not Allowed !!
	System.out.println(rr[0]);
	
	Object[] ror=new Object[5];
	ror[4]="@#$%abcd123"; // Just a Random Thought !!
	System.out.println(ror[4]);
	
	Object[] rtt=new Object[2];
	rtt[0]=23; 
	
	Object[] rtt1; 
	rtt1=new Object[2];
	
  //Don't use this thing !!
	String[] aq;
	aq=new String[2];
  //Instead use this Stuff!!
	String[] tt=new String[2];
	
	String pp="abbb"; //int innn=10;	
	String[] po={"Abcd","aa",new String("Tarun"),pp};
	System.out.println(po[1]+" \n "+po[2]+" "+po[3]);
	
	int[] re=new int[4];
	System.out.println("Int type values !!");
	int[] re2={1,2,new Integer(212121)};
	System.out.println(re2[2]);
	
	int[] pp22=new int[3];
	
	byte b=12;
	pp22[2]=b;
	System.out.println(pp22[2]);

}	
}
