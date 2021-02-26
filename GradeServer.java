/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeCalc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author HaileC
 */
public class GradeServer 
{
    public static void main(String args[])throws Exception
    {
        GradeIntr g1=new GradeImpl();
        Registry reg=LocateRegistry.createRegistry(1099);
        reg.rebind("GradeCalc",g1);
        System.out.println("Server is ready for remote invocations by client");
    }
        
}