/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeCalc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HaileC
 */
public class GradeImpl extends UnicastRemoteObject implements GradeIntr 
{
    float marks;
     char grade;
    public GradeImpl()throws Exception
    {
        super();
    }

    @Override
    public char getGradeCalc(float marks) throws RemoteException 
    {
        this.marks=marks;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (marks>=85)
        {
            grade='A';          
        }
        else if(marks>=70 && marks<85)
        {
            grade='B';            
        }
         else if(marks>=50 && marks<70)
        {
            grade='C';            
        }
         else if(marks>=35 && marks<50)
        {
            grade='D';            
        }
        else
        {
            grade='F';            
        }
       return grade;
    }
    
    
}
