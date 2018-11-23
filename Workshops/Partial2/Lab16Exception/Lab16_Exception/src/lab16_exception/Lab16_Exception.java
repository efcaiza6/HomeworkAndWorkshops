/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_exception;

import ec.edu.espe.Operation.Operation;
import ec.edu.espe.model.animal.Animal;
import java.io.IOException;

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
        //animal=null;
        //animal= new Animal();
        /*if (animal != null) {
            System.out.println("The animal exist");
        }else{
            System.out.println("The animal not exist");
        }*/
        try {
            System.out.println("The files run");
            System.out.println("eyes "+animal.eyes);
            System.out.println("The program is style running");
            
        } catch (NullPointerException ex) {
            System.out.println("An error occured "+ex);
            System.out.println("The exception running "+ex.getMessage());
            if (ex.toString().equals("java.lang.NullPointerException")) {
                System.out.println("No hay animales creados");
            }
            System.out.println("stack "+ex.getStackTrace());
            ex.printStackTrace();
            
            //Animal animal=new Animal();
            if (animal.eyes != null) {
                System.out.println("Animal "+animal.eyes);
            }else{
                animal.eyes="brown";
                System.out.println("Los ojos son de color "+animal.eyes);
            }
        }
        //finally{
          //  System.out.println("after the exception");
        //}
        System.out.println("The is the Barn Number "+animal.getBarnNumber());
        Animal animal2=new Animal();
        System.out.println("The is the Barn Number "+animal2.getBarnNumber());
        animal2.assignBarnNumber(18);
        System.out.println("The is the Barn Number "+animal2.getBarnNumber());
        
    }
    
}
