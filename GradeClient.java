/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeCalc;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author HaileC
 */
public class GradeClient {
    public static void main(String args[])throws Exception
    {
       GradeIntr g2=(GradeIntr)Naming.lookup("GradeCalc");
       Scanner s=new Scanner(System.in);
       try
       {
            float mark;
            char grade;
            System.out.println("Enter the Mark : ");
            mark=s.nextFloat();
            grade=g2.getGradeCalc(mark);
            System.out.println("The grade he/she get is : " + grade);
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
}
