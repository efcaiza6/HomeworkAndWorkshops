/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_customexceptions;

import ec.edu.espe.model.customExceptions.CustomExceptions;
import ec.edu.espe.model.customExceptions.Validation;
import java.util.Scanner;

/**
 *
 * @author Edwin Caiza
 */
public class Lab20_CustomExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        String passInit;
        String rePass;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        name=sc.nextLine();
        System.out.println("Ingrese la contraseña");
        passInit=sc.nextLine();
        System.out.println("Vuelva a ingresar la contraseña");
        rePass=sc.nextLine();
        
        Validation validation = new Validation();
        
        try {
            validation.validarPassword(passInit, rePass, name);
        } catch (CustomExceptions e) {
            System.out.println("The user "+name+" can not be registered because: "
            +e.getMessage());
        }
    }
    
}
