
package ec.edu.espe.barbershopproject.model;

/**
 * @author Bryan Zurita
 * @author Miquely Calvopiña 
 * @author Sebastian Zuñiga
 */
public class Person {
    private String fullName;
    private int age;
    private String identifyCardNumber;
    private String phoneNumber;
    private String address;

    /**
     * Getter
     * @return fullName 
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter
     * @param fullName 
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter
     * @return age 
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter
     * @return identifuCardNumber 
     */
    public String getIdentifyCardNumber() {
        return identifyCardNumber;
    }

    /**
     * Setter
     * @param identifyCardNumber 
     */
    public void setIdentifyCardNumber(String identifyCardNumber) {
        this.identifyCardNumber = identifyCardNumber;
    }

    /**
     * Getter
     * @return phoneNumber 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter
     * @return address 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * This method validates the entry of an identification card according to the regulations in Ecuador
     * @param idCard
     * @return validation
     */
    public boolean checkIdentifyCardNumber(String idCard) {
     
      boolean validation = false;
        
      try {
            //Condición, una cédula solo puede tener 10 dígitos
            if (idCard.length() == 10) {
                
                //Primeros dos dígitos deben correspoder al codigo de alguna de las 24 provincias
                int stateCode = Integer.parseInt(idCard.substring(0,2));
                
                if (stateCode >=01 && stateCode <=24 ){
                    
                    int thirdDigit = Integer.parseInt(idCard.substring(2, 3));
                    
                //En Ecuador, el tercer dígito de la cédula debe ser >= a 0 y <6
                if (thirdDigit < 6 && thirdDigit >=0) {
                    
                    int[] coefficient = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    
                    int lastDigit = Integer.parseInt(idCard.substring(9,10));
                    
                    int acum = 0;
                    
                    //Las multiplicaciones se realizan entre todos los digitos excepto el ultimo digito y los coeficientes
                    for (int i = 0; i < 9; i++) {
                        
                        int digito = Integer.parseInt(idCard.substring(i, i + 1)) * coefficient[i];
                        
                        //si el resultado de las multiplicaciones es mayor o igual a 10, se debe restar 9
                        if(digito >= 10){
                            digito += (- 9);
                        }
                        
                        acum += ((digito % 10) + (digito / 10));
                    
                    }
                    if ((acum % 10 == 0) && (acum % 10 == lastDigit)) {
                        validation = true;
                    }
                    else if ((10 - (acum % 10)) == lastDigit) {
                        validation = true;
                    } else {
                        validation = false;
                    }
                } else {
                    validation = false;
                }
                
                }else {
                    validation = false;
                }                
                
            } else {
                validation = false;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Una cedula solo puede contener numeros");
            validation = false;
        } catch (Exception er) {
            System.out.println("Hubo un error en el proceso de validacioin");
            validation = false;
        }
        
        return validation;
    }
    
    /**
     * This method validates the entry of a telephone number according to the norms in Ecuador
     * @param phoneNumber
     * @return validation
     */
    public boolean checkPhoneNumber(String phoneNumber){
        
        boolean validation = false;
        
        try{
            if (phoneNumber.length()  == 10){
                
                int firstDigit = Integer.parseInt(phoneNumber.substring(0,1));
                int secondDigit = Integer.parseInt(phoneNumber.substring(1,2));
                
                if (firstDigit == 0 && secondDigit==9){
                    
                    validation = true;
                    
                }else {
                    
                    validation = false;
                    
                }
                
            }else {
                if(phoneNumber.length() == 9){
                    
                    int firstDigit = Integer.parseInt(phoneNumber.substring(0,1));
                    int secondDigit = Integer.parseInt(phoneNumber.substring(1,2));
                    
                    if (firstDigit==0 && (secondDigit>=2||secondDigit<=8)){
                        validation = true;              
                    }else{
                        validation = false;
                    }
                    
                }else {
                    
                validation = false;
                
                }
            }
            
        }catch (NumberFormatException e) {
            validation = false;
        } catch (Exception ex) {
            System.out.println("Una problema en el proceso de validadcion");
            validation = false;
        }
        if (!validation) {
            System.out.println("El numero ingresado es incorrecto");
        }
        return validation;
    }
 
}