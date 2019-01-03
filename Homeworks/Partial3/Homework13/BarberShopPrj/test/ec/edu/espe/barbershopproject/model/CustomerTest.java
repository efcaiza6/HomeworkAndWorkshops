/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.barbershopproject.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "AV. LOLA QUINTANA";
        String result = instance.getAddress("AV. LOLA QUINTANA");
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetAddress2() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "Rumiñahui y 24 de Mayo Sangolquí";
        String result = instance.getAddress("Rumiñahui y 24 de Mayo Sangolquí");
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetAddress3() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "Rio Coca junto al Estacionamiento AutoCar";
        String result = instance.getAddress("Rio Coca junto al Estacionamiento AutoCar");
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "AV. LOLA QUINTANA";
        Customer instance = new Customer();
        instance.setAddress(address);
        System.out.println("setAdrdress correct funtion");
    }
    
    @Test
    public void testSetAddress2() {
        System.out.println("setAddress");
        String address = "Rumiñahui y 24 de Mayo Sangolquí";
        Customer instance = new Customer();
        instance.setAddress(address);
        System.out.println("setAdrdress correct funtion");
    }
    
    @Test
    public void testSetAddress3() {
        System.out.println("setAddress");
        String address = "Rio Coca junto al Estacionamiento AutoCar";
        Customer instance = new Customer();
        instance.setAddress(address);
        System.out.println("setAdrdress correct funtion");
    }
    
    @Test
    public void testSetAddress4() {
        System.out.println("setAddress");
        String address = "Villaflora calle principal";
        Customer instance = new Customer();
        instance.setAddress(address);
        System.out.println("setAdrdress correct funtion");
    }
}
