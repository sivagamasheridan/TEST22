/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author sivagamasrinivasan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) 
    {
        Student[] list = new Student[3]; 
        
        for (int i=0;i<list.length;i++)
        {
             Student s1 = new Student("saf",34);
             list[i]=s1;
             System.out.println(list[i].getAge() + " " +list[i].getName()); 
        }
      
        
   
    }
}
