/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab24_formandclass;

import java.io.File;
import java.util.Scanner;
import javax.xml.ws.BindingProvider;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Edwin Caiza
 */
public class Login_Users {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner x;
    
    public static void main(String[] args) {
        String username = "Caiza";
        String password = "123";
        String file = "Usuarios.txt";
        
        verifyLogin(username, password, file);
    }
    
    public static boolean verifyLogin(String username, String password, String file) {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        
        try {
            x = new Scanner(new File(file));
            x.useDelimiter("[;\n]");
            
            while (x.hasNext() && !found) {                
                tempUsername = x.next();
                tempPassword = x.next();
                
                if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
                    found = true;
                }
            }
            x.close();
            System.out.println(found);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return found;
    }
    
}
