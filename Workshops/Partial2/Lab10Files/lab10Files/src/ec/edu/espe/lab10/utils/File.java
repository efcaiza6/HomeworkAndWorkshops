/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab10.utils;

import ec.edu.espe.lab9.controlStatementAndDataTypes.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Edwin
 */
public class File {
    private int year;
    private int month;
    private int day;
     
    public void writter(File archive,String text){
        FileWriter file; 
        BufferedWriter salida;
        try{
            file = new FileWriter(archive,true);
            salida = new BufferedWriter(file);
            salida.newLine();
            salida.write(text);
            salida.close();
        }catch(IOException e){
            
        }
    } 
    
       public void reader(){
        String leer;
        try{
        FileReader fileReader = new FileReader("Edad.csv");
        BufferedReader entrada = new BufferedReader(fileReader);
        leer = entrada.readLine();
        while(leer!=null){
            System.out.println(leer);
            leer= entrada.readLine();
        }

        }catch(IOException e){
            System.out.println("Ocurrio un Error");
        }   
    }
}
