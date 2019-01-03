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
public class OwnerTest {
    
    public OwnerTest() {
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
     * Test of getSalary method, of class Owner.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Owner instance = new Owner();
        double expResult = 45.7;
        double result = instance.getSalary();
        assertEquals(expResult, result, 45.7);
        System.out.println("getSalary correct funtion");
    }
    
    @Test
    public void testGetSalary2() {
        System.out.println("getSalary");
        Owner instance = new Owner();
        double expResult = 200;
        double result = instance.getSalary();
        assertEquals(expResult, result, 200);
        System.out.println("getSalary correct funtion");
    }
    
    @Test
    public void testGetSalary3() {
        System.out.println("getSalary");
        Owner instance = new Owner();
        double expResult = 185.6;
        double result = instance.getSalary();
        assertEquals(expResult, result, 185.6);
        System.out.println("getSalary correct funtion");
    }
    
    @Test
    public void testGetSalary4() {
        System.out.println("getSalary");
        Owner instance = new Owner();
        double expResult = 127.5;
        double result = instance.getSalary();
        assertEquals(expResult, result, 127.5);
        System.out.println("getSalary correct funtion");
    }

    /**
     * Test of setSalary method, of class Owner.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 126.7;
        Owner instance = new Owner();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }
    
    @Test
    public void testSetSalary2() {
        System.out.println("setSalary");
        double salary = 189.05;
        Owner instance = new Owner();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }
    
    @Test
    public void testSetSalary3() {
        System.out.println("setSalary");
        double salary = 234;
        Owner instance = new Owner();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }
    
    @Test
    public void testSetSalary4() {
        System.out.println("setSalary");
        double salary = 150;
        Owner instance = new Owner();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }

    /**
     * Test of getBarberShopEarnings method, of class Owner.
     */
    @Test
    public void testGetBarberShopEarnings() {
        System.out.println("getBarberShopEarnings");
        Owner instance = new Owner();
        double expResult = 200;
        double result = instance.getBarberShopEarnings();
        assertEquals(expResult, result, 200);
        System.out.println("getBarberShopEarning correct funtion");
    }
    
    @Test
    public void testGetBarberShopEarnings2() {
        System.out.println("getBarberShopEarnings");
        Owner instance = new Owner();
        double expResult = 224;
        double result = instance.getBarberShopEarnings();
        assertEquals(expResult, result, 224);
        System.out.println("getBarberShopEarning correct funtion");
    }
    
    @Test
    public void testGetBarberShopEarnings3() {
        System.out.println("getBarberShopEarnings");
        Owner instance = new Owner();
        double expResult = 14.56;
        double result = instance.getBarberShopEarnings();
        assertEquals(expResult, result, 134.56);
        System.out.println("getBarberShopEarning correct funtion");
    }
    
    @Test
    public void testGetBarberShopEarnings4() {
        System.out.println("getBarberShopEarnings");
        Owner instance = new Owner();
        double expResult = 179.84;
        double result = instance.getBarberShopEarnings();
        assertEquals(expResult, result, 179.84);
        System.out.println("getBarberShopEarning correct funtion");
    }

    /**
     * Test of setBarberShopEarnings method, of class Owner.
     */
    @Test
    public void testSetBarberShopEarnings() {
        System.out.println("setBarberShopEarnings");
        double barberShopEarnings = 298.56;
        Owner instance = new Owner();
        instance.setBarberShopEarnings(barberShopEarnings);
        System.out.println("setBarberShopEarning correct funtion");
    }
    
    @Test
    public void testSetBarberShopEarnings2() {
        System.out.println("setBarberShopEarnings");
        double barberShopEarnings = 199.99;
        Owner instance = new Owner();
        instance.setBarberShopEarnings(barberShopEarnings);
        System.out.println("setBarberShopEarning correct funtion");
    }
    
    @Test
    public void testSetBarberShopEarnings3() {
        System.out.println("setBarberShopEarnings");
        double barberShopEarnings = 134.89;
        Owner instance = new Owner();
        instance.setBarberShopEarnings(barberShopEarnings);
        System.out.println("setBarberShopEarning correct funtion");
    }
    
    @Test
    public void testSetBarberShopEarnings4() {
        System.out.println("setBarberShopEarnings");
        double barberShopEarnings = 222.44;
        Owner instance = new Owner();
        instance.setBarberShopEarnings(barberShopEarnings);
        System.out.println("setBarberShopEarning correct funtion");
    }

    /**
     * Test of getBarberShopExpenses method, of class Owner.
     */
    @Test
    public void testGetBarberShopExpenses() {
        System.out.println("getBarberShopExpenses");
        Owner instance = new Owner();
        double expResult = 89.78;
        double result = instance.getBarberShopExpenses();
        assertEquals(expResult, result, 89.78);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetBarberShopExpenses2() {
        System.out.println("getBarberShopExpenses");
        Owner instance = new Owner();
        double expResult = 93.4;
        double result = instance.getBarberShopExpenses();
        assertEquals(expResult, result, 93.4);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetBarberShopExpenses3() {
        System.out.println("getBarberShopExpenses");
        Owner instance = new Owner();
        double expResult = 100;
        double result = instance.getBarberShopExpenses();
        assertEquals(expResult, result, 100);
        System.out.println("expResult = result");
    }

    /**
     * Test of setBarberShopExpenses method, of class Owner.
     */
    @Test
    public void testSetBarberShopExpenses() {
        System.out.println("setBarberShopExpenses");
        double barberShopExpenses = 34.6;
        Owner instance = new Owner();
        instance.setBarberShopExpenses(barberShopExpenses);
        System.out.println("SetBarberShopExpenses correct funtion");
    }
    
    @Test
    public void testSetBarberShopExpenses2() {
        System.out.println("setBarberShopExpenses");
        double barberShopExpenses = 99.99;
        Owner instance = new Owner();
        instance.setBarberShopExpenses(barberShopExpenses);
        System.out.println("SetBarberShopExpenses correct funtion");
    }
    
    @Test
    public void testSetBarberShopExpenses3() {
        System.out.println("setBarberShopExpenses");
        double barberShopExpenses = 55.67;
        Owner instance = new Owner();
        instance.setBarberShopExpenses(barberShopExpenses);
        System.out.println("SetBarberShopExpenses correct funtion");
    }

    /**
     * Test of searchService method, of class Owner.
     */
    @Test
    public void testSearchService() {
        System.out.println("searchService");
        String name = "Av";
        Owner instance = new Owner();
        String expResult = "Av de las Glaxias;Av de los Cisnes;Mirasierra;765";
        String result = instance.searchService(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printLocation method, of class Owner.
     */
    @Test
    public void testPrintLocation() {
        System.out.println("printLocation");
        Owner instance = new Owner();
        instance.printLocation();
        System.out.println("PrintLocation correct funtion");
    }
}
