/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.controlStatementAndDataTypes;


import ec.edu.espe.lab10.utils.Lab10;
import java.io.File;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Edwin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        Lab10 fileMan=new Lab10();
        File file = new File("Register_Age.csv");
        int operand1 = 20;
        int operand2 = 6;
        String name, inString;
        int birthDay=0;
        int birthMonth=0;
        int birthYear=0;
        /*operand1 = input.nextInt();
        opernad2 = input.nextInt();*/
        Operation operation = new Operation();
        System.out.println("The sum is:"+operation.add(operand1, operand2));
        System.out.println("The subtraction is: "+operation.substract(operand1, operand2));
        System.out.println("The multiplication is: "+operation.mult(operand1, operand2));
        System.out.println("La division es: "+operation.div(operand1, operand2));
        
        Person person = new Person ();
        int cont=0;
        System.out.println("Ingrese el nombre");
        name=in.nextLine();
        while(cont==0){
            System.out.println("Ingrese el dia de su nacimiento: ");
            birthDay=in.nextInt();
            if(birthDay<=0 || birthDay>31){
                System.out.println("Dia Ingresado Incorrecto");
                cont=0;
            }else {
            cont=1;
                }
        }
        cont=0;
        while(cont==0){
            System.out.println("Ingrese el mes de su nacimiento: ");
            birthMonth=in.nextInt();
            if(birthMonth<=0 || birthMonth>12){
                System.out.println("Mes Ingresado Incorrecto");
                cont=0;
            }else{
                cont=1;
            }
        }
        cont=0;
        while(cont==0){
            System.out.println("Ingrese el anio de su nacimiento: ");
            birthYear=in.nextInt();
            if(birthYear<=1900 || birthYear>cal.get(Calendar.YEAR)){
                System.out.println("Año Ingresado Incorrecto");
                cont=0;
            }else{
                cont=1;
            }
        }
        
        person.calculateDay(birthDay, birthMonth, birthYear);
        person.calculateMonth(birthDay, birthMonth, birthYear);
        person.calculateAge(birthDay,birthMonth,birthYear);
        
        System.out.println("usted tiene "+person.getYear()+" años "
        +person.getMonth()+" meses y "+person.getDay()+" dias");
        
        inString = "" + name + ";" + person.getYear() + ";" 
        + person.getMonth() + ";" + person.getDay();

        fileMan.WriterFile(file, inString);
        fileMan.ReaderFile(file);
    }
    
}
