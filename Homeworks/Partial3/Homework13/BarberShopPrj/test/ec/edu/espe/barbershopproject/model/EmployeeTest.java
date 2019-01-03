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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        instance.setId("1");
        String expResult = "1";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "L00356745";
        Employee instance = new Employee();
        instance.setId(id);
        System.out.println("setId correct funtion");
    }
    
        @Test
    public void testSetId2() {
        System.out.println("setId");
        String id = "BS157";
        Employee instance = new Employee();
        instance.setId(id);
        System.out.println("setId correct funtion");
    }
    
        @Test
    public void testSetId3() {
        System.out.println("setId");
        String id = "3647484";
        Employee instance = new Employee();
        instance.setId(id);
        System.out.println("setId correct funtion");
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Employee instance = new Employee();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetSalary2() {
        System.out.println("getSalary");
        Employee instance = new Employee();
        double expResult = 120;
        double result = instance.getSalary();
        assertEquals(expResult, result, 120);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testGetSalary3() {
        System.out.println("getSalary");
        Employee instance = new Employee();
        double expResult = 150.58;
        double result = instance.getSalary();
        assertEquals(expResult, result, 150.58);
        System.out.println("expResult = result");
    }

    /**
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 25.67;
        Employee instance = new Employee();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }
    
    @Test
    public void testSetSalary2() {
        System.out.println("setSalary");
        double salary = 174.67;
        Employee instance = new Employee();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }
    
    @Test
    public void testSetSalary3() {
        System.out.println("setSalary");
        double salary = 250.22;
        Employee instance = new Employee();
        instance.setSalary(salary);
        System.out.println("setSalary correct funtion");
    }

    /**
     * Test of attend method, of class Employee.
     * @throws java.lang.Exception
     */
    @Test
    public void testAttend() throws Exception {
        System.out.println("attend");
        Customer customer = null;
        Employee employee = null;
        Employee instance = new Employee();
        instance.attend(customer, employee);
        System.out.println("Attend correct funtion");
    }
}
