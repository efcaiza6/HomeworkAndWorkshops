/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhombus;

import ec.espe.edu.rhombus.model.Operation;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Rhombus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operation op = new Operation();
        double dma=0,dme=0;
        boolean band=false;
        
        do {            
            try {
                System.out.println("Diagonal mayor: ");
                Scanner in = new Scanner(System.in);
                dma=in.nextDouble();
                band=true;
            } catch (Exception e) {
                System.out.println("Solo ingrese números");
                band=false;
            }
        } while (band==false);
            
        do {            
            try {
                System.out.println("Diagonal menor: ");
                Scanner on = new Scanner(System.in);
                dme=on.nextDouble();
                band=true;
            } catch (Exception e) {
                System.out.println("Solo ingrese números");
                band = false;
            }
        } while (band==false);
            
        System.out.println("area: " 
                + op.area(dme, dma));
        System.out.println("perim: "+op.perimeter(dma, dme));
    }
    
}
