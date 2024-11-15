/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;

import java.util.ArrayList;

/**
 *
 * @author Barbara
 */
public class PersonProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create an arrayList of Person
        ArrayList<Person> list = new ArrayList<Person>();
        
        // create studenst
        Student s1 = new Student("John Williams", "BSc Computer Science");
        Date dobS1 = new Date(12, 11, 2000);
        s1.setDOB(dobS1);
        list.add(s1);
        
        Student s2 = new Student("Ben Smith", "BSc Computer Science");
        Date dobS2 = new Date(10, 10, 1999);
        s2.setDOB(dobS2);
        list.add(s2);
        
        // create teachers
        Teacher t1 = new Teacher("Jen Brown", "30000");
        Date dobT1 = new Date(12, 11, 1985);
        t1.setDOB(dobT1);
        list.add(t1);
        
        Teacher t2 = new Teacher("Jeff White", "30000");
        Date dobT2 = new Date(9, 8, 1977);
        t2.setDOB(dobT2);
        list.add(t2);
        
        // create a table
        PersonTable frame = new PersonTable(list);
        frame.setTitle("Books List");
        frame.setVisible(true);
    }
    
}
