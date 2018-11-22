/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_exception;

import ec.edu.espe.Operation.Operation;
import ec.edu.espe.model.animal.Animal;

/**
 *
 * @author Edwin
 */
public class Lab16_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operation operation;
        operation=new Operation();
        
        float result=operation.division( 385, 897);
        System.out.println("The quante is "+result);
        result=operation.division(3, 5);
        System.out.println("The quante is "+result);
        result=operation.division(5.8F, 1.3F);
        System.out.println("The quante is "+result);
        result = operation.division(8, 0);
        System.out.println("The quante is "+result);
        result=operation.add(1.2F, 2.9F);
        System.out.println("The quante is "+result);
        result=operation.add(4000, 4000);
        System.out.println("The quante is "+result);
        result=operation.add(5, 2.4F);
        System.out.println("The quante is "+result);
        
        
        Animal animal = new Animal();
        animal=null;
        System.out.println("eyes "+animal.eyes);
        
    }
    
}
