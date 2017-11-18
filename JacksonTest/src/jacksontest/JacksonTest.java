/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacksontest;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author uys41
 */
public class JacksonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Person p=new Person();
        p.setPid(1);
        p.setPname("Mr. Xyz");
        p.setPsalary(500d);
       /// System.out.println("Before Conversion to JSON p "+p);
        Person p1=new Person(2, "Mr. Abc", 300d);
       // System.out.println("Before Conversion to JSON p1 "+p1);
        ObjectMapper mapper=new ObjectMapper();
        String writeValueAsString = mapper.writeValueAsString(p);
        System.out.println(writeValueAsString);
        String writeValueAsString1 = mapper.writeValueAsString(p1);
         System.out.println(writeValueAsString1);
        Person readValue = mapper.readValue(writeValueAsString, Person.class);
        System.out.println("Finally Person Object "+readValue);
        Person readValue1 = mapper.readValue(writeValueAsString1, Person.class);
        System.out.println("Finally Person Object "+readValue1);
    }
    
}
