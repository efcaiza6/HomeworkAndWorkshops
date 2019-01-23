/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import ec.edu.espe.GUI.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab25_excersisecomplete.Product;

/**
 *
 * @author Edwin Caiza
 */
public class FileManager {
    
    Vector vprincipal = new Vector();
    
    public void guardar(Product producto){
        vprincipal.addElement(producto);
    }
    
    public void saveArchive(Product producto){
        try {
            FileWriter fw = new FileWriter("Producto.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(producto.getId());
            pw.print(";"+producto.getName());
            pw.print(";"+producto.getPrecio());
            pw.print(";"+producto.getPorcenta());
            pw.println(";"+producto.getPvp());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public DefaultTableModel listaProduct(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Id");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Precio");
        cabeceras.addElement("Porcentaje");
        cabeceras.addElement("Pvp");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        
        try {
            FileReader fr = new FileReader("Producto.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null) {                
                StringTokenizer dato = new StringTokenizer(d,";");
                
                Vector x = new Vector();
                
                while (dato.hasMoreTokens()) {                    
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;
    }
    
}
