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
public class course {
      private String title;
    private Vector courseRecords;

    course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(courserecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    //========================= printCourceStudents ===================================

    public void printCourceStudents() {
        String student_name;
         Enumeration en = courseRecords.elements();
         
        System.out.println("Course has "+ courseRecords.size() + " students");
 
        while (en.hasMoreElements()) {
            courserecord cr = (courserecord) en.nextElement();
            student_name = cr.getStudent().getName();
            System.out.println(student_name);            
        }
    }
    
    //========================= printCourceStudents ===================================

    public void printBestStudent() throws NOTYETSETEXCEPTION {
        double best_average = 0.0;
        String student_name = null ;

        Enumeration en = courseRecords.elements();  
        while (en.hasMoreElements()) {
            courserecord cr = (courserecord) en.nextElement();
            if (best_average < cr.average()) {
                best_average = cr.average();
                student_name = cr.getStudent().getName();
            }          
        }
        System.out.println("Best Student is " + student_name);
        
    }
        
    //========================= printCourceStudents ===================================

    public void printFinalExamStudents() throws NOTYETSETEXCEPTION {
        double best_average = 0.0;
        double average = 0.0;
        String student_name = null ;

        Enumeration en = courseRecords.elements();  
        
        System.out.println("Students that can qualifies to final exam");

        while (en.hasMoreElements()) {
            courserecord cr = (courserecord) en.nextElement();
            if (cr.canTakeFinalExam()) {
                System.out.println(cr.getStudent().getName());
            }          
        }
        
    }
}
