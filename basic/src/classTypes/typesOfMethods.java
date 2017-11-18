/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classTypes;

/**
 *
 * @author uys41
 */
public class typesOfMethods {
    
    //Private fields
    private String firstName;
    private String middleNames;

    typesOfMethods(){}
    typesOfMethods( String firstName, String middleNames)
    {
         this.firstName = firstName;
         this.middleNames = middleNames;
    }
    
    //Accessor for firstName
    public String getFirstName()
    {
        return firstName;
    }
    //Accessor for middleNames
    public String getMiddlesNames()
    {
        return middleNames;
    }

    void test(){
    }
    public static int minFumction (int x, int y)
    {
        int min;
        if(x>y)
        {
           min = y; 
        }
        else { min = x;}
        
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args)
    {
        minFumction(10, 2);
       
        typesOfMethods tm1 = new typesOfMethods();
        tm1.test();
        
        typesOfMethods  tm2 = new typesOfMethods("Md. Aminul Karim", "Mazumder");
        System.out.println(tm2.getFirstName()+ " : "+ tm2.getMiddlesNames()); //Accessor Methods
    }
}
