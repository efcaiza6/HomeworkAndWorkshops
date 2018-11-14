/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Inheritance;

/**
 *
 * @author Edwin
 */
public class Reptile extends Animal{
    protected int eggs;

    public Reptile(int eggs, int id, int arrivalYear, String cientificName) {
        super(id, arrivalYear, cientificName);
        this.eggs = eggs;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
    
}
