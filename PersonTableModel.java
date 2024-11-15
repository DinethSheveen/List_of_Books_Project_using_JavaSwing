/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class PersonTableModel extends AbstractTableModel{
    
    ArrayList<Person> list;
    String[] columnNames = {"Name","DOB","Type","Info"};
    
    //Constructor
    public PersonTableModel(ArrayList<Person> list){
        this.list = list;
    }
    

    @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp=null;
        
        if(columnIndex == 0){
            temp = list.get(rowIndex).getName();
        }
        else if(columnIndex == 1){
            temp = list.get(rowIndex).getDOB().getDate();
        }
        else if(columnIndex == 2){
            if(list.get(rowIndex) instanceof Student){
                temp = "Student";
            }
            else{
                temp = "Teacher";
            }
        }
        else if(columnIndex == 3){
            if(list.get(rowIndex)instanceof Student){
                temp = ((Student)list.get(rowIndex)).getID();
            }
            else{
                temp = ((Teacher)list.get(rowIndex)).getSalary();
            }
        }
        return temp;
    }
    public String getColumnName(int columnIndex){
        return columnNames[columnIndex];
    }
}