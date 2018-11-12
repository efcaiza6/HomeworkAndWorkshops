/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.controlStatementAndDataTypes;

import java.util.Calendar;

/**
 *
 * @author Edwin
 */
public class Person {
 //   String name;
    int birthDay;
    int birthMonth;
    int birthYear;
    
    int year;
    int day;
    int month;
    
    Calendar cal;
    Operation operation;

    public void calculateAge(int birthDay,int birthMonth,int birthYear){
   
        year=operation.substract(cal.get(Calendar.YEAR), birthYear);
    
    }
    
    public void calculateMonth(int birthDay,int birthMonth,int birthYear){
        
        month=operation.substract(cal.get(Calendar.MONTH), birthMonth);
    
        if(month<=0){
        month=12+month;
        year--;
        }
        
    }
    
    public void calculateDay(int birthDay,int birthMonth,int birthYear){
        
        day=operation.substract(cal.get(Calendar.DAY_OF_MONTH), birthDay);
    
        if(day<=0){
        day=30+day;
        month--;
        }

    }

    /*
    public Person( int birthDay, int birthMonth, int birthYear, int year, int day, int month) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.year = year;
        this.day = day;
        this.month = month;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    
    public Person(){
        operation = new Operation();
        cal=Calendar.getInstance();
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
}
