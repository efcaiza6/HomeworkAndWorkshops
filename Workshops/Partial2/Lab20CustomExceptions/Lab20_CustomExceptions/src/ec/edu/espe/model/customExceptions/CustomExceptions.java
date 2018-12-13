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
public class CustomExceptions extends Exception{
    
    public static final long serialVersionUID=700L;
    
    public CustomExceptions(String message){
        super(message);
    }
    
}
