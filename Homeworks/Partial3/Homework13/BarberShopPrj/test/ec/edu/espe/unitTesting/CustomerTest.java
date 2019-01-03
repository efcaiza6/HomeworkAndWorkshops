/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.unitTesting;

import ec.edu.espe.barbershopproject.model.Bill;
import ec.edu.espe.barbershopproject.model.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Edwin Caiza
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testValidationIdCard1(){
        String idCard = "1725644528";
        boolean expResult= true;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
    @Test
    public void testValidationIdCard2(){
        String idCard = "1725644528";
        boolean expResult= true;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
    @Test
    public void testValidationIdCard3(){
        String idCard = "1725648";
        boolean expResult= true;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
    @Test
    public void testValidationIdCard4(){
        String idCard = "1234567784";
        boolean expResult= false;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
    @Test
    public void testValidationIdCard5(){
        String idCard = "1725958528";
        boolean expResult= false;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
    @Test
    public void testPay(){
        String idCard = "1710030568";
        boolean expResult= true;
        Customer customer = new Customer();
        boolean actualResult=customer.checkIdentifyCardNumber(idCard);
        assertEquals(expResult,actualResult);
        
    }
}
