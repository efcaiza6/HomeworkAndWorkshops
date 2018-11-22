/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Operation;

/**
 *
 * @author Edwin
 */
public class Operation {
    float cosiente;
    float divisor;
    float result;
    short result1;
    public float division(float cosiente, float divisor){
        result=cosiente/divisor;
        return result;
    }
    
    public short add(short num1, short num2) {
        result=(short) (num1+num2);
        return (short) result;
    }
     public float add(float num1, float num2) {
        result=num1+num2;
        return result;
    }

    public float add(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
