/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author YASMEN KHALED
 */
public class courserecord {
    private student student;
    private Vector assignment;

    courserecord() {
        assignment = new Vector();
    }

    public student getStudent() {
        return student;
    }

    public void setStudent(student s) {
        student = s;
    }

    public void addAssignment(Assignment a) {
        assignment.addElement(a);
    }

    public Enumeration getAssignments() {
        return assignment.elements();
    }
    
 
    public double average() throws NOTYETSETEXCEPTION { 
//        size= assignments.elements(); // 
        double average = 0.0 ;
        double marks = 0.0 ;
        int count = 0 ;
        Enumeration enU = assignment.elements();
        while (enU.hasMoreElements()) {
            Assignment assignment = (Assignment) enU.nextElement();
           if (assignment.getMark() != -1)
           {
                count ++;
                marks = marks+ assignment.getMark();
                average = marks/count;
            }
        }
        return average;
    }
    
  
    public boolean canTakeFinalExam() throws NOTYETSETEXCEPTION { 

        int count = 0 ;
        Enumeration enU = assignment.elements();
        while (enU.hasMoreElements()) 
        {
            Assignment assignment = (Assignment) enU.nextElement();
           if (assignment.getMark() != -1) {
                count++;
            }
        }
        return count>=3 ;
    }
}
