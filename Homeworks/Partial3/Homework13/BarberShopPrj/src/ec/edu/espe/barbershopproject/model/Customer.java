
package ec.edu.espe.barbershopproject.model;


import java.util.Scanner;

/**
 *
 * @author Bryan Zurita
 */
    public class Customer extends Person{
    private String address;
    /**
     * Getter
     * @param address
     * @return adress
     */
    public String getAddress(String address) {
        return address;
    }

    /**
     * Setter
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String id, String fullName,int age,String phone,String address) {
        this.address = address;
    }

    public Customer() {
    }
    
    
    /**
     * This method valid that the payment entry, be in numbers
     * @param bill
     * @return pago
     */
    public double pay(Bill bill){
        Scanner scan = new Scanner(System.in);
        boolean bandera=false;
        double pago = 0;
        do {            
            try {
                System.out.println("Ingrese el pago del cliente");
                pago=scan.nextDouble();
                bandera = true;
            } catch (Exception e) {
                System.out.println("Solo se permite el ingreso de números");
                bandera=false;
            }
        } while (bandera==false);
        return pago;
    }
    
   
}
