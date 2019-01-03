
package ec.edu.espe.barbershopproject.model;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Byron Condor
 */
public class Product {
    
    private String name;
    private String code;
    private int quantity;
    private float cost;

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /**
     * Getter
     * @return name 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter
     * @return quantity 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter
     * @return cost 
     */
    public float getCost() {
        return cost;
    }
    
    /**
     * Setter
     * @param cost 
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    /**
     * Getter
     * @return code 
     */
    public String getCode() {
        return code;
    }
   
     /**
     * Constructor
     * @param code
     * @param name
     * @param quantity
     * @param cost 
     */
     public Product(String code,String name, int quantity, float cost) {
        this.code = code;
         this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }     
    
    /**
     * Store the data of a product in a String
     * @param p
     * @return string 
     */
    public String toString (Product p){
        String string = ""+p.code+";" +p.name+";"+p.quantity+";"+p.cost+"\n";
        return string;
    }
 }