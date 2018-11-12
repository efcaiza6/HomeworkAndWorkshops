/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab10.utils;

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
public class Lab10 {
    
    public void WriterFile(File file, String inString){

        try{

            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file, true));

            buffWriter.newLine();
            buffWriter.write(inString);
            buffWriter.close();

        }catch(IOException e){

            System.out.println("No se encontro el archivo o"

                    + " ha ocurrido un error fatal :)");

        }

    }

    public void ReaderFile(File file){

                String line = "";

        try{

            BufferedReader reader = new BufferedReader(new FileReader(file));

            while(line != null){

                System.out.println(line);

                line = reader.readLine();

            }

            reader.close();

        }catch(IOException e){

            System.out.println("No se encontro el archivo");

        }

    }
}
