/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab12_inherance;

import ec.edu.espe.Inheritance.Animal;
import ec.edu.espe.Inheritance.File_Man;
import ec.edu.espe.Inheritance.Mammal;
import ec.edu.espe.Inheritance.Reptile;
import java.io.*;

/**
 *
 * @author Edwin
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File_Man file_Man = new File_Man();
        File file = new File("Zoo.txt");
        String inFile= "";
        
        Animal animal [] = new Animal[7];
        animal[0] = new Mammal(2,"Land",4,202,1997,"Monkey");
        animal[1] = new Reptile(5,956,2002,"Crocodile");
        animal[2] = new Mammal(2,"Land",4,666,1999,"Elephant");
        animal[3] = new Reptile(7,196, 2002,"Iguana");
        animal[4] = new Mammal(2,"Flying",2,199,2000,"Bat");
        animal[5] = new Mammal(1, "water", 0, 11, 2010, "Dolphin");
        
        
        for (int i = 0; i < 6; i++) {
            if(animal[i] instanceof Mammal){
                System.out.println("El mamifero "+animal[i].getCientificName()+ " con Id "
                +animal[i].getId()+" es de tipo "+((Mammal)animal[i]).getType()
                + "\ntiene "+((Mammal)animal[i]).getNumberOfNipple()+" tetillas, "
                +((Mammal)animal[i]).getNumberLegs()+" patas y su estancia en el zoo es "
                +animal[i].ComputYearOfStay()+" años.");
            }else{
                System.out.println("El Reptil "+animal[i].getCientificName()+" con Id "
                +animal[i].getId()+" pone "+((Reptile)animal[i]).getEggs()
                +" huevos y su estancia en el zoo es "+animal[i].ComputYearOfStay()+" años.");
            }
        }
        for (int i = 0; i < 6; i++) {
            if(animal[i] instanceof Mammal){
                inFile="El mamifero "+animal[i].getCientificName()+ " con Id "
                +animal[i].getId()+" es de tipo "+((Mammal)animal[i]).getType()
                + " \ntiene "+((Mammal)animal[i]).getNumberOfNipple()+" tetillas, "
                +((Mammal)animal[i]).getNumberLegs()+" patas y su estancia en el zoo es "
                +animal[i].ComputYearOfStay()+" años.";
            file_Man.WriterFile(file, inFile);
            }else{
                inFile="El Reptil "+animal[i].getCientificName()+" con Id "
                +animal[i].getId()+" pone "+((Reptile)animal[i]).getEggs()
                +" huevos y su estancia en el zoo es "+animal[i].ComputYearOfStay()+" años.";
            file_Man.WriterFile(file, inFile);
            }
        }
      
    }
    
}
