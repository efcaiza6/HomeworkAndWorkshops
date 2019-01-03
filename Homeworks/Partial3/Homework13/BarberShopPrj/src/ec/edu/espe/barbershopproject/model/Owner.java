
package ec.edu.espe.barbershopproject.model;

import ec.edu.espe.BarberShop.files.utils.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Bryan Zurita
 * @author Sebastian Zuñiga
 */
public class Owner extends Person{
    private double salary;
    private double barberShopEarnings;
    private double barberShopExpenses;



    /**
     * Getter
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Getter
     * @return the barberShopEarnings
     */
    public double getBarberShopEarnings() {
        return barberShopEarnings;
    }

    /**
     * Setter
     * @param barberShopEarnings the barberShopEarnings to set
     */
    public void setBarberShopEarnings(double barberShopEarnings) {
        this.barberShopEarnings = barberShopEarnings;
    }

    /**
     * Getter
     * @return barberShopExpenses
     */
    public double getBarberShopExpenses() {
        return barberShopExpenses;
    }

    /**
     * Setter
     * @param barberShopExpenses the barberShopExpenses to set
     */
    public void setBarberShopExpenses(double barberShopExpenses) {
        this.barberShopExpenses = barberShopExpenses;
    }
    
    /**
     * Add to the "Ubicacion" file the data of a new location
     * @param location
     * @throws IOException 
     */
    public void newLocation(Location location) throws IOException{
        String aux = "";
        aux = findLocation(location, false);
        FileManager.writeFile(new File("Ubicacion.csv"), aux);
    }
    
    /**
     * Search in the location file for an address given in the argument
     * @param name
     * @return 
     */
    public String searchService(String name) {
        String aux;
        aux = FileManager.searchInFile(new File("Ubicacion.csv"), name);
        return aux;
    }
    
    /**
     * Stores the data of a location in a location type object and also, in a string
     * @param location
     * @param ModifyOrNewVerification
     * @return
     * @throws IOException 
     */
    public String findLocation(Location location , boolean ModifyOrNewVerification) throws IOException {
        String nameFile;
        
        Scanner bc= new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la calle principal de la peluquería");
        String streetName=bc.nextLine();
        location.setMainStreetName(streetName);
        System.out.println("Ingrese el nombre de la calle secundaria de la peluquería");
        String secondStreet=bc.nextLine();
        location.setSecondaryStreetName(secondStreet);
        System.out.println("Ingrese referencias en donde se encuentra la peluquería");
        String references=bc.nextLine();
        location.setReferences(references);
        System.out.println("Ingrese el codigo postal de la peluquería");
        String postalCode=bc.nextLine();
        location.setPostalCode(postalCode);
        
        return location.getMainStreetName()+ ";" + location.getSecondaryStreetName() + ";" + location.getReferences() + ";" + location.getReferences();
    }
  
   /**
     * Print on the screen the locations stored in the Ubicacion file
     */
    public void printLocation(){
    int cont = 0;
    
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader readFile = new FileReader("Ubicacion.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            System.out.println("\033[36m   ........................................... Ubicacion ...........................................");
            String title = "CALLE PRINCIPAL;CALLE SECUNDARIA;REFERENCIAS;CODIGO POSTAL;";
            while ((chain = buffer.readLine()) != null) {
                cont++;
                String principalStreet = chain.split(";")[0];
                String secondaryStreet = chain.split(";")[1];
                String references = chain.split(";")[2];
                String postalCode= chain.split(";")[3];
                acumtotal += principalStreet + ";" + secondaryStreet.toUpperCase() + ";" + references+ ";"+ postalCode+ ";" ;
                if (chain.split(";")[0].length() > num) {
                    num = chain.split(";")[0].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][4];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + espace(espacios);
                }
            }
            for (int i = 0; i < 4; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[35m\t" + title.split(";")[i] + espace(espacios));
            }
            System.out.println("\n");
            System.out.println("    ............................................................................................");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    System.out.print("\t"+llenar[i][j]);

                }
                System.out.println("\n");
            System.out.println("    ............................................................................................");
            }
            buffer.close();
        } catch (Exception e) {
        };

    }
    
     /**
     * Saves in a String a number of spaces ordered
     * @param esp
     * @return es
     */
     public String espace(int esp) {
        int cont = 0;
        String es = "";
        while (cont <= esp) {
            cont++;
            es += " ";
        }
        return es;
    }
}    