/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_interface;

import ec.edu.espe.Model.Mamal;
import ec.edu.espe.Model.Reptile;
import ec.edu.espe.lab15.Interface.Animal;

/**
 *
 * @author Edwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Mamal();
        animal.feet();
        animal.assingHabitad();
        animal = new Reptile();
        animal.feet();
        animal.assingHabitad();
    }
    
}
