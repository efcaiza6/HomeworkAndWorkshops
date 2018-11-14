/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Edwin
 */
public class Animal {
    private int id;
    private int arrivalYear;
    private String cientificName;
    private int yearsOfStay; //años de estadia a calular

    public Animal(int id, int arrivalYear, String cientificName) {
                this.id = id;
        this.arrivalYear = arrivalYear;
        this.cientificName = cientificName;
        //this.yearsOfStay = yearsOfStay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public String getCientificName() {
        return cientificName;
    }

    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }

    public void setYearsOfStay(int yearsOfStay) {
        this.yearsOfStay = yearsOfStay;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
    
    Calendar cal = new GregorianCalendar();
            
    public int ComputYearOfStay(){
        yearsOfStay=cal.get(Calendar.YEAR)-arrivalYear;
        return yearsOfStay;
    }
}
