/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author YASMEN KHALED
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NOTYETSETEXCEPTION {
      
        student std1 = new student(); // get data of student 1
        std1.setName("malika");
         
        student std2 = new student(); // get data of student 2
        std2.setName("Ahmed");
        
        student std3 = new student(); // get data of student 3
        std3.setName("Ali");
        
        course c1 = new course();  // create object from course class
        c1.setTitle("Math");
        course c2 = new course();
        c2.setTitle("science");
        course c3 = new course();
        c3.setTitle("Arabic");
        
        Assignment as1 = new Assignment(); // create object  from Assignment class
        as1.setMark(25);
        Assignment as2 = new Assignment();
        as2.setMark(7);
        Assignment as3 = new Assignment();
        as3.setMark(10);
        
        courserecord cr1 = new courserecord();  // create object  from courserecord class
        cr1.setStudent(std1);
        cr1.addAssignment(as1);
        cr1.addAssignment(as2);
        cr1.addAssignment(as3);
       
        courserecord cr2 = new courserecord();
        cr2.setStudent(std2);
        c1.addCourseRecord(cr1);
        c1.addCourseRecord(cr2);
        
        
        courserecord cr3 = new courserecord();
        cr3.setStudent(std3);
        c1.addCourseRecord(cr3);
        
        
        //=======================print====================
        System.out.println(cr1.average());
        System.out.println((cr1.canTakeFinalExam())?"the student qualifies for the exam " : "student can not qualifies the exam");
        c1.printCourceStudents();
        c1.printBestStudent();
        c1.printFinalExamStudents();
         
    }
    
}

  
