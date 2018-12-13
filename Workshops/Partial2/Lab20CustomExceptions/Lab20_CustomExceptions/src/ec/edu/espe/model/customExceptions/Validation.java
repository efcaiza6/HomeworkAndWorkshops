/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.customExceptions;

/**
 *
 * @author Edwin Caiza
 */
public class Validation {
    
    public void validarPassword(String pass, String rPass, String name) throws  CustomExceptions{
        if (!pass.equals(rPass)) {
            throw new CustomExceptions("Passwords are not the same");
        }
        if (pass.length()<5) {
            throw new CustomExceptions("The password is not long enough");
        }
        if (pass.equals(rPass)) {
            System.out.println("Bienvenido Usuario Registrado");
            System.out.println("Nombre: "+name);
            System.out.println("Contraseña: "+rPass);
        }
        
    }
    
}
