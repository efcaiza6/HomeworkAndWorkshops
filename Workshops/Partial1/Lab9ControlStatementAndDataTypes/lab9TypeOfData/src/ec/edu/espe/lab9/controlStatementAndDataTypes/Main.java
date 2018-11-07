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
        int cont=0;
        /*operand1 = input.nextInt();
        opernad2 = input.nextInt();*/
        Operation operation = new Operation();
        operation.add(operand1, operand2);
        System.out.println("The sum is:"+operation.getResult());
        operation.add(operand1, -operand2);
        System.out.println("The subtraction is: "+operation.getResult());
        operation.setResult(0);
        while(cont < operand2){
            operation.add(operand1, operation.getResult());
            cont++;
        }
        cont=0;
        System.out.println("The multiplication is: "+operation.getResult());
        operation.setResult(operand1);
        while((operation.getResult()> 0) && (operation.getResult()> operand2) ){
            operation.add(operation.getResult(), -operand2);
            cont++;
        }
        System.out.println("La division es: "+ cont);
        
        int day;
        int month;
        int year;
        int actuala=2018;
        int actualm=11;
        int actuald=6;
        System.out.println("Ingrese el dia de su nacimiento: ");
        day = input.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        month =  input.nextInt();
        System.out.println("Ingrese el anio de su nacimiento: ");
        year = input.nextInt();
        
        operation.add(actuala,-year);
        System.out.println("Los anios que tiene es: " +operation.getResult());
        operation.add(actualm, -month);
        System.out.println("Los meses que tiene son: " +operation.getResult());
        operation.add(actuald, day);
        System.out.println("Los dias que tiene son: "+operation.getResult());
        System.out.println("Usted tiene ");
        
        
    }
    
}
