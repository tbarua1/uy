/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Arrays;

/**
 *
 * @author uys41
 */
public class Array {

    public static void main(String[] args) {

        System.out.println("main(String[] args) : "+Arrays.toString(args));
        System.out.println("main(String[] args) join : "+String.join(" ",args));
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        System.out.println("Array :" + myList.length);
        //copy
        int[] source = new int[10];
        for(int i=0; i < source.length; i++) {
        source[i] = i;
        }
        int[] dest = Arrays.copyOf(source, source.length);
        System.out.println("Array copy:" + Arrays.toString(dest));
//-----------END COPY-----------------
        
        
        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
        total += myList[i];
        }
        System.out.println("total :" + total);
        
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
        if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        // Print all the array elements
        for (double element: myList) {
        System.out.println("element: "+ element);
        }

        printArray(myList);
        
        
        // Insert value
        int[] ints = new int[20];
        int insertIndex = 10;
        int newValue = 123;

        insertIntoArray(ints, insertIndex, newValue);


        //declaring and initializing 2D array
        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
//1,2,3
//2,4,5
//4,4,5

//3*3
//System.out.println("String :"+arr.length);
        //printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print(arr[i][0] + " ");
            System.out.println();
        }
        //System.out.println("String :"+Arrays.toString(d));

    }
    
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
        System.out.println("printArray(): "+array[i] + " ");
        }
    }
    
    static void insertIntoArray(
    int[] array, int insertIndex, int newValue){
    //move elements below insertion point.
    for(int i=array.length-1; i > insertIndex; i--){
    System.out.println("array: "+array[i-1]);
    array[i] = array[i-1];
    }
    System.out.println("Full Array: "+Arrays.toString(array));
    //insert new value
    array[insertIndex] = newValue;
    System.out.println("insertIntoArray(): "+array[insertIndex]);
    System.out.println("After: Full Array: "+Arrays.toString(array));
    }
    
}
