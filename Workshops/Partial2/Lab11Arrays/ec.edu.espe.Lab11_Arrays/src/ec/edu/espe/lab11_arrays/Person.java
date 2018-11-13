/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab11_arrays;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Edwin
 */
public class Person {
    GregorianCalendar calendar = new GregorianCalendar();
    String name;
    int years;
    int age;
       
    public Person(){
        name="";
        years=0;
        
    }

    public Person(String name, int years) {
        this.name=name;
        this.years=years;
    }
    public String getName() {
        return name;
    }
   
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    
    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    public int calcYears(int years){
    int age=0;
    age = calendar.get(Calendar.YEAR)-years;
    return age;
    }
}
    
