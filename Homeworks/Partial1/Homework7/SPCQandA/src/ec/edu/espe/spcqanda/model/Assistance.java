/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spcqanda.model;

/**
 *
 * @author Edwin
 */
public class Assistance {
    private int leaks;
    private int fauls;
    private int arrears;

    public Assistance(int leaks, int fauls, int arrears) {
        this.leaks = leaks;
        this.fauls = fauls;
        this.arrears = arrears;
    }
    
    public int getLeaks() {
        return leaks;
    }

    public void setLeaks(int leaks) {
        this.leaks = leaks;
    }

    public int getFauls() {
        return fauls;
    }

    public void setFauls(int fauls) {
        this.fauls = fauls;
    }

    public int getArrears() {
        return arrears;
    }

    public void setArrears(int arrears) {
        this.arrears = arrears;
    }
    
}
