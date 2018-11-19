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
public class Mamal implements Animal {

    @Override
    public void feet() {
        System.out.println("Se esta alimentando con leche al mamifero");
    }

    @Override
    public void assingHabitad() {
        System.out.println("Se esta asignando una celda al mamifero");
    }
    
}
