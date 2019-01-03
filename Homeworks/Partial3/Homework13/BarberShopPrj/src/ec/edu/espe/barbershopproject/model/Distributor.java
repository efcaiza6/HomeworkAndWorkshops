
package ec.edu.espe.barbershopproject.model;

import ec.edu.espe.barbershopproject.model.Bill;
import java.util.Scanner;

/**
 * @author Bryan Zurita
 */
public class Distributor extends Location{
    private String companyName="Fuer";  
    String actualDay="";
    /**
     * This method will receive the order of the products to verify if they were delivered or not
     * @return verificar 
     */
    public boolean deliverOrder(){
  
        String deliverDay;
        
        boolean verificar;
        Scanner scan = new Scanner(System.in);
        
        deliverDay="MIERCOLES";
        
        System.out.println("Que dia es?");
        actualDay=scan.next().toUpperCase();
        
        if (deliverDay.equals(actualDay))
            verificar=true;
        else
            verificar=false;
        return verificar;
    }
    
    /**
     * Getter
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter
     * @param companyName 
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
