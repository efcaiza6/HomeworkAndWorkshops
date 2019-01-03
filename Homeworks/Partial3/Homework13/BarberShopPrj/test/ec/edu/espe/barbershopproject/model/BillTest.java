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
public class BillTest {
    
    public BillTest() {
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
     * Test of getBillCode method, of class Bill.
     */
    @Test
    public void testGetBillCode() {
        System.out.println("getBillCode");
        Bill instance = new Bill();
        String expResult = null;
        String result = instance.getBillCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBillCode method, of class Bill.
     */
    @Test
    public void testSetBillCode() {
        System.out.println("getBillCode");
        Bill instance = new Bill();
        String billCode = "1564";
        instance.setBillCode(billCode);
        String expResult = "1564";
        String result = instance.getBillCode();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetBillCode2() {
        System.out.println("getBillCode");
        Bill instance = new Bill();
        String billCode = "164";
        instance.setBillCode(billCode);
        String expResult = "164";
        String result = instance.getBillCode();
        assertEquals(expResult, result);
    }

        @Test
    public void testSetBillCode3() {
        System.out.println("setBillCode");
        String billCode = "ABCD";
        Bill instance = new Bill();
        instance.setBillCode(billCode);
        String expResult = billCode;
        String result = instance.getBillCode();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testSetBillCode4() {
        System.out.println("setBillCode");
        Bill instance = new Bill();
        String billCode = "/ty6";
        instance.setBillCode(billCode);
        String result = instance.getBillCode();
        assertEquals(billCode, result);
    }

    /**
     * Test of addProductOrService method, of class Bill.
     */
    @Test
    public void testAddProductOrService() {
        System.out.println("addProductOrService");
        Product product = null;
        Service service = null;
        Bill instance = new Bill();
        double expResult = 0.0;
        double result = instance.addProductOrService(product, service);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of makeBill method, of class Bill.
     * @throws java.lang.Exception
     */
    @Test
    public void testMakeBill() throws Exception {
        System.out.println("makeBill");
        Employee employee = null;
        Customer customer = null;
        Service service = null;
        Bill instance = new Bill();
        instance.makeBill(employee, customer, service);
        
    }
    
}
