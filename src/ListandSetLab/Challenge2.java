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
public class Challenge2 {
    public static void main(String[] args) {
        Employee person1 = new Employee("Selas", "John","103455345");
        Employee person2 = new Employee("Smith", "Bob","858568885");
        Employee person3 = new Employee("Allen", "Joe","756753564");
        
        List <Employee> employees = new ArrayList<Employee>();
        employees.add(person1);
        employees.add(person2);
        employees.add(person3);
        
        
        for(Employee e : employees){
            System.out.println(e.getFirstName() + " " + e.getLastName() + " has a ssn of " + e.getSsn());
            
        }
        
    }
}
