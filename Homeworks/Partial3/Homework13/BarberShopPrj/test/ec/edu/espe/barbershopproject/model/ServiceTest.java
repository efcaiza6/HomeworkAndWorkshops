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
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getFullName method, of class Service.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Service instance = null;
        String expResult = "";
        String result = instance.getFullName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFullName method, of class Service.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String name = "";
        Service instance = null;
        instance.setFullName(name);
        
    }

    /**
     * Test of getCost method, of class Service.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Service instance = null;
        double expResult = 3456f;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setCost method, of class Service.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 456.56;
        Service instance = null;
        instance.setCost(cost);
        
    }

    /**
     * Test of getCode method, of class Service.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Service instance = null;
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCode method, of class Service.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Service instance = null;
        instance.setCode(code);
        
    }

    /**
     * Test of generateCode method, of class Service.
     */
    @Test
    public void testGenerateCode() {
        System.out.println("generateCode");
        Service instance = null;
        String expResult = "";
        String result = instance.generateCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Service.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Service service = null;
        Service instance = null;
        String expResult = "";
        String result = instance.toString(service);
        assertEquals(expResult, result);
        
    }
    
}
