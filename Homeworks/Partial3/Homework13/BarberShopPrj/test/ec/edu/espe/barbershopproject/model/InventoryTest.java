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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of registerProduct method, of class Inventory.
     */
    @Test
    public void testRegisterProduct() {
        System.out.println("registerProduct");
        Inventory instance = new Inventory();
        Product expResult = null;
        Product result = instance.registerProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of deleteProduct method, of class Inventory.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        Product product = null;
        Inventory instance = new Inventory();
        instance.deleteProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellProduct method, of class Inventory.
     */
    @Test
    public void testSellProduct() {
        System.out.println("sellProduct");
        String code = "Str453";
        int num = 0;
        Inventory instance = new Inventory();
        float expResult = 0.0F;
        float result = instance.sellProduct(code, num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Inventory.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String code = "Set";
        int num = 8;
        Inventory instance = new Inventory();
        instance.addProduct(code, num);
        System.out.println("TestAddProduct correct funtion");
    }
    
    @Test
    public void testAddProduct2() {
        System.out.println("addProduct");
        String code = "Lkoo";
        int num = 12;
        Inventory instance = new Inventory();
        instance.addProduct(code, num);
        System.out.println("TestAddProduct correct funtion");
    }
    
    @Test
    public void testAddProduct3() {
        System.out.println("addProduct");
        String code = "Loo876";
        int num = 5;
        Inventory instance = new Inventory();
        instance.addProduct(code, num);
        System.out.println("TestAddProduct correct funtion");
    }
    
    @Test
    public void testAddProduct4() {
        System.out.println("addProduct");
        String code = "L00455";
        int num = 5;
        Inventory instance = new Inventory();
        instance.addProduct(code, num);
        System.out.println("TestAddProduct correct funtion");
    }
    
    /**
     * Test of toString method, of class Inventory.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Product p = new Product("01","Shampo",10,13f);
        Inventory instance = new Inventory();
        String expResult = "01;Shampo;13.0";
        String result = instance.toString(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printInventory method, of class Inventory.
     */
    @Test
    public void testPrintInventory() {
        System.out.println("printInventory");
        Inventory instance = new Inventory();
        instance.printInventory();
        System.out.println("testPrintInventory correct funtion");
    }

    /**
     * Test of espace method, of class Inventory.
     */
    @Test
    public void testEspace() {
        System.out.println("espace");
        int esp = 0;
        Inventory instance = new Inventory();
        String expResult = "";
        String result = instance.espace(esp);
        System.out.println("testEspace correct funtion");
    }
    
}
