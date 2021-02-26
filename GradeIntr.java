/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeCalc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HaileC
 */
public interface GradeIntr extends Remote{
    public char getGradeCalc(float n)throws RemoteException;
    
}
