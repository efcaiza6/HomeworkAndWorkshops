/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.controlStatementAndDataTypes;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int operand1 = 20;
        int operand2 = 6;
        /*operand1 = input.nextInt();
        opernad2 = input.nextInt();*/
        Operation operation = new Operation();
        System.out.println("The sum is:"+operation.add(operand1, operand2));
        System.out.println("The subtraction is: "+operation.substract(operand1, operand2));
        System.out.println("The multiplication is: "+operation.mult(operand1, operand2));
        System.out.println("La division es: "+operation.div(operand1, operand2));
        
        Person person;
        person = new Person (0,0,0,0,0,0);
        
        System.out.println("Ingrese el dia de su nacimiento: ");
        Scanner d = new Scanner(System.in);
        person.setBirthDay(d.nextInt());
        System.out.println("Ingrese el mes de su nacimiento: ");
        Scanner m = new Scanner(System.in);
        person.setBirthMonth(m.nextInt());
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el anio de su nacimiento: ");
        person.setBirthYear(a.nextInt());
        person.calculateAge(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear(), 0,0,0);
        
        
    }
    
}
