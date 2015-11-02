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
        Employee person1 = new Employee("Selas", "John","103455345");
        Employee person2 = new Employee("Smith", "Bob","858568885");
        Dog dog1 = new Dog("Ralph",787);
        
        
        List stuff = new ArrayList();
        stuff.add(person1.toString());
        stuff.add(person2.toString());
        stuff.add(dog1.toString());
        
        for(int i= 0;i<stuff.size();i++){
            String thing = (String)stuff.get(i);
            System.out.println(thing);
        }
        
    }
}
