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
public class BarberShopTest {
    
    public BarberShopTest() {
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
     * Test of searchEmployee method, of class BarberShop.
     */
    @Test
    public void testSearchEmployee() {
        System.out.println("searchEmployee");
        BarberShop instance = new BarberShop();
        String identifyCard = "1725264822";
        String expResult = "1725264822;1;BRYAN ZURITA;20;22332946;300.0;AV NO SE";
        String result = instance.searchEmployee(identifyCard);
        assertEquals(expResult, result);
    }

     /**
     * Test of newEmployee method, of class BarberShop.
     */
    @Test
    public void testNewEmployee() throws Exception {
        System.out.println("newEmployee");
        BarberShop instance = new BarberShop();
        Employee employee = null; 
        int expResult = 0;
        int result = instance.newEmployee(employee);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of newCustomer method, of class BarberShop.
     */
    @Test
    public void testNewCustomer() throws Exception {
        System.out.println("newCustomer");
        Person customer = null;
        BarberShop instance = new BarberShop();
        int expResult = 0;
        int result = instance.newCustomer(customer);//
        assertEquals(expResult, result);
       
    }

   
    /**
     * Test of searchCostumer method, of class BarberShop.
     */
    @Test
    public void testSearchCostumer() {
        System.out.println("searchCustomer");
        BarberShop instance = new BarberShop();
        String identifyCard = "1717301491";
        String expResult = "1717301491;Miler Zambrano;25;984369341;Ponciano";
        String result = instance.searchCustomer(identifyCard);
        assertEquals(expResult, result);
    }

    

    /**
     * Test of newService method, of class BarberShop.
     */
    @Test
    public void testNewService() throws Exception {
        System.out.println("newService");
        Service service = null;
        BarberShop instance = new BarberShop();
        int expResult = 0;
        int result = instance.newService(service);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchService method, of class BarberShop.
     */
    @Test
    public void testSearchService() {
        System.out.println("searchService");
        BarberShop instance = new BarberShop();
        String name = "S284";
        String expResult = "S284;peinado con secadora;5.0 ";
        String result = instance.searchService(name);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of printEmployee method, of class BarberShop.
     */
    @Test
    public void testPrintEmployee() {
        System.out.println("printEmployee");
        BarberShop instance = new BarberShop();
        instance.printEmployee();
    
    }

    /**
     * Test of printCustomer method, of class BarberShop.
     */
    @Test
    public void testPrintCustomer() {
        System.out.println("printCustomer");
        BarberShop instance = new BarberShop();
        instance.printCustomer();
    
    }

    /**
     * Test of espace method, of class BarberShop.
     */
    @Test
    public void testEspace() {
        System.out.println("espace");
        int esp = 0;
        BarberShop instance = new BarberShop();
        String expResult = " ";
        String result = instance.space(esp);
        assertEquals(expResult, result);
     
    }

    
}
