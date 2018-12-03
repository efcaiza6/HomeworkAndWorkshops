/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.controlStatementAndDataTypes;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Date date=new Date();
        
        Person person;
        person = new Person (0,0,0,0,0,0);
        
        boolean bandera=false;
        
        do {            
            try {
                do {            
                    System.out.println("Ingrese el anio de su nacimiento: ");
                    Scanner a = new Scanner(System.in);
                    person.setBirthYear(a.nextInt());
                    bandera=true;
                } while (person.birthYear<1900 || person.birthYear>date.getYear()+1900);
            } catch (Exception e) {
                System.out.println("Solo ingrese números");
                bandera=false;
            }
        } while (bandera==false);
        
        bandera=false;
        
        do {      
            try {
                do {            
                    System.out.println("Ingrese el dia de su nacimiento: ");
                    Scanner d = new Scanner(System.in);
                    person.setBirthDay(d.nextInt());
                    bandera=true;
                } while (person.birthDay<=0 || person.birthDay>30);
            } catch (Exception e) {
                System.out.println("Solo ingrese números");
                bandera=false;
            }
        } while (bandera==false);
        
        do {            
            try {
                do {            
                    System.out.println("Ingrese el mes de su nacimiento: ");
                    Scanner m = new Scanner(System.in);
                    person.setBirthMonth(m.nextInt());
                    bandera=true;
                } while (person.birthMonth<=0 || person.birthMonth>12);
            } catch (Exception e) {
                System.out.println("Solo ingrese números");
                bandera=false;
            }
        } while (bandera==false);
        
        person.calculateAge(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear(), 0,0,0);
        
    }
    
}
