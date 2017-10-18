
public class Test1Arry22 
{
// 1D Array
void Min(int[] abcd)
{
//logic
}

public static void main(String[] args) 
{
//int[] ref10={10,20};
Test1Arry22 t=new Test1Arry22();

t.Min(new int[]{1,4,6,78,45});	
	
//System.out.println(args[0]);
//int[] a;
	
int[] a=new int[5];
byte b=12;
short s=23;
byte b2=10;
int i2=-100;

int[] ref={1,2,4,5,s,b2,i2,new Integer(234)};

// first way !!
for (int i = 0; i < ref.length; i++) 
{
System.out.println(ref[i]);
}
System.out.println("**********");
// second way!!
for(int iubat:ref)
{
System.out.println(iubat);
}

//a[0]=20;
//a[1]=30;
Test1Arry22[] t1=new Test1Arry22[5];
Object[] o=new Object[5];
o[0]=12;
o[1]="tarun";
o[2]=1.12f;
int[][] abc;
abc=new int[3][3];
System.out.println("****2D Array");

int[][] abc3=new int[0][2];

abc3[0]=new int[4];
abc3[0][0]=121;

int[][] abc4={{12,23},{34,45}};
int[][] abc2=new int[3][];

abc2[0]=new int[2];
abc2[0][0]=200;
abc2[0][1]=300;

abc2[1]=new int[5];

abc2[1][0]=400;
abc2[1][4]=500;

abc2[2]=new int[3];




		
System.out.println();


}	
}
