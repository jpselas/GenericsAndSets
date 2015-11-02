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
public class Challenge1 {
    
    public static void main(String[] args) {
        List hobbies = new ArrayList();
    hobbies.add("Legos");
    hobbies.add("Videogames");
    hobbies.add("Working on Car");
    hobbies.add("Building PCs");
    hobbies.add("Collecting Comics");
    String hobby = null;
    for(int i=0;i<hobbies.size();i++){
        
        hobby = (String)hobbies.get(i);
        System.out.println(hobby);
        
    }
        
        
    }
}
