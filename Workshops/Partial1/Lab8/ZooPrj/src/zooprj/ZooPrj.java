/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprj;

import ec.edu.espe.zooprj.model.Student;

/**
 *
 * @author Edwin
 */
public class ZooPrj {

    /**
     * @param args the command line arguments
     */

    private static String name="Edwin";
    public static void main(String[] args) {
        System.out.println("Hi my name is " +name);
        Student datos;
        datos = new Student("Cristian","L003355644");
        System.out.println("El nombre del estudiante es " + datos.getName()
        + " y el Id es el " + datos.getId());
    }
    
}
