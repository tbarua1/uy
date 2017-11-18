
package basic;

import java.util.Arrays;

/**
 *
 * @author uys41
 */
public class oop {

    /**
     * @param args the command line arguments
     */
    oop()
    {
    System.out.println("oop default...");
    }
    oop(int x)
    {
    System.out.println("oop param..."+x);
    }
    int oop(){
    System.out.println("oop method...");
    return 0;
    } 
    int oop(int t, int r){
        System.out.println("t+r ="+(t+r));
    return t+r;
    }
    public static void main(String[] args) {

        int x= 10;//4 byte 3.14525655545255
        double aa =x; //8 byte
        int bb=(int)aa;
        System.out.print("bb :"+ bb);
      oop y= new oop();
        int oop = y.oop();
        int oop1 = y.oop(5,3);
      System.out.println("t+r ="+y.oop(5,3));
      oop z = new oop(5);
        System.out.println("z = "+z);
      //declaring and initializing 2D array
 int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
//1,2,3
//2,4,5
//4,4,5

//3*3

 //printing 2D array
 for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
            }
           System.out.print(arr[i][0]+" ");
        System.out.println();
 }
       //System.out.println("String :"+Arrays.toString(d));
      
    }
    
}
