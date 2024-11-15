/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class PersonTable extends JFrame{
    JTable myTable;
    PersonTableModel tableModel;
    ArrayList<Person>list;
    
    //Constructor
    public PersonTable(ArrayList<Person> list){
        this.list=list;
        tableModel = new PersonTableModel(list);
        myTable = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(myTable);
        add(scrollPane,BorderLayout.CENTER);
        
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
