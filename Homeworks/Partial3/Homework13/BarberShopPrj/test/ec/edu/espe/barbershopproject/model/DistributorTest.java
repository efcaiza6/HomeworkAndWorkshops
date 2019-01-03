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
public class DistributorTest {
    
    public DistributorTest() {
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
     * Test of deliverOrder method, of class Distributor.
     */
    @Test
    public void testDeliverOrder() {
        System.out.println("deliverOrder");
        Distributor instance = new Distributor();
        boolean expResult =false;
        boolean result = instance.deliverOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCompanyName method, of class Distributor.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Distributor instance = new Distributor();
        String expResult = "Fuer";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }

    /**
     * Test of setCompanyName method, of class Distributor.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "Barber Shop";
        Distributor instance = new Distributor();
        instance.setCompanyName(companyName);
        System.out.println("setCompany correct funtion");
    }
    
    @Test
    public void testSetCompanyName2() {
        System.out.println("setCompanyName");
        String companyName = "Peluquería Unisex";
        Distributor instance = new Distributor();
        instance.setCompanyName(companyName);
        System.out.println("setCompany correct funtion");
    }
    
    @Test
    public void testSetCompanyName3() {
        System.out.println("setCompanyName");
        String companyName = "Barbershop Blackshepp";
        Distributor instance = new Distributor();
        instance.setCompanyName(companyName);
        System.out.println("setCompany correct funtion");
    }
    
}
