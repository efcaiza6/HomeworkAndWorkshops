/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Inheritance;

import java.util.Calendar;

/**
 *
 * @author Edwin
 */
public class Mammal extends Animal{
  //  Animal animal = new Animal();
    protected int numberOfNipple;
    protected String type;
    protected int numberLegs;

    public Mammal(int numberOfNipple, String type, int numberLegs, int id, int arrivalYear, String cientificName) {
        super(id, arrivalYear, cientificName);
        this.numberOfNipple = numberOfNipple;
        this.type = type;
        this.numberLegs = numberLegs;
    }

    public int getNumberOfNipple() {
        return numberOfNipple;
    }

    public void setNumberOfNipple(int numberOfNipple) {
        this.numberOfNipple = numberOfNipple;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }
    
    
    
}
