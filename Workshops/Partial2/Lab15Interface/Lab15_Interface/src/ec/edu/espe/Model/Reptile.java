/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Model;

import ec.edu.espe.lab15.Interface.Animal;

/**
 *
 * @author Edwin
 */
public class Reptile implements Animal{

    @Override
    public void feet() {
        System.out.println("Se esta alimentando con insectos y carne al reptil");
    }

    @Override
    public void assingHabitad() {
        System.out.println("Se esta asignando una celda al reptil");
    }
    
}
