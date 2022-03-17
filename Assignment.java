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
public class Assignment {
      private double mark = -1;

    Assignment() {
    }

    public double getMark() throws NOTYETSETEXCEPTION {
        if (mark == -1) {
//            throw new NotYetSetException("Mark is not yet set");
            System.out.println("Mark not set now....");
        }
        return mark;
    }

    public void setMark(int m) {
        mark = m;
    }

}
