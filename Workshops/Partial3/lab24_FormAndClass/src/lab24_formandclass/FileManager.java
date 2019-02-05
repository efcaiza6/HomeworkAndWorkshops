/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab24_formandclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab24_formandclass.Cliente_Datos;

/**
 *
 * @author Edwin Caiza
 */
public class FileManager {
    
    Vector vprincipal = new Vector();
    
    public void guardar(Cliente_Datos cliente_Datos){
        vprincipal.addElement(cliente_Datos);
    }
    
    public void saveArchive(Cliente_Datos cliente_Datos){
        try {
            FileWriter fw = new FileWriter("Cliente.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(cliente_Datos.getName());
            pw.print(";"+cliente_Datos.getSueldoHoras());
            pw.print(";"+cliente_Datos.getHorasTrabajadas());
            pw.print(";"+cliente_Datos.getAporteSeguro());
            pw.println(";"+cliente_Datos.getSueldoGanado());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public DefaultTableModel listaProduct(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Sueldo por horas");
        cabeceras.addElement("Horas trabajadas");
        cabeceras.addElement("Aporte al IEES");
        cabeceras.addElement("Sueldo Ganado");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        
        try {
            FileReader fr = new FileReader("Cliente.txt");
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
