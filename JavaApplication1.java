/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uys41
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] s) {
        // TODO code application logic here
       int marks=Integer.parseInt(s[0]);
       if(marks<30){System.out.println("Poor Performance work hard");}
       if(marks<30 && marks<45){System.out.println("passed with C Grade");}
       if(marks>45 && marks<60){System.out.println("passed with B Grade");}
       if(marks>60 && marks<85){System.out.println("passed with A Grade");}
       else{System.out.println("More then 85");}
    }
    
}
