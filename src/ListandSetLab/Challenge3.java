/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListandSetLab;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.*;
/**
 *
 * @author John
 */
public class Challenge3 {
    public static void main(String[] args) {
        Employee person1 = new Employee("Selas", "John","103-45-5345");
        Employee person2 = new Employee("Smith", "Bob","858-56-8885");
        Dog dog1 = new Dog("Ralph",787);
        
        
        List stuff = new ArrayList();
        stuff.add(person1);
        stuff.add(person2);
        stuff.add(dog1);
        
        for(int i= 0;i<stuff.size();i++){
            Object o = new Object();
            if(o instanceof Employee){
                Employee e = (Employee)o;
                System.out.println(e);
            }else if(o instanceof Dog){
                Dog d = (Dog)o;
                System.out.println(d);
                
            }
            
        }
        
    }
}
