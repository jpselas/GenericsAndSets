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
public class Challenge4 {
    public static void main(String[] args) {
        Employee person1 = new Employee("Selas", "John","103-45-5345");
        Employee person2 = new Employee("Smith", "Bob","858-56-8885");
        Employee person3 = new Employee("Allen", "Joe","756-75-3564");
        Employee person4 = new Employee("Selas", "John","103-45-5345");
        Employee person5 = new Employee("Selas", "John","103-45-5345");
        Employee person6 = new Employee("Selas", "John","103-45-5345");
        Employee person7 = new Employee("Selas", "John","103-45-5345");
        Set <Employee> employees = new HashSet<Employee>();
        
        employees.add(person1);
        employees.add(person2);
        employees.add(person3);
        employees.add(person4);
        employees.add(person5);
        employees.add(person6);
        employees.add(person7);
        
        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
