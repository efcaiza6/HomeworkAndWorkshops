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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getFullName method, of class Person.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Person instance = new Person();
        String expResult = "Sebastian";
        String result = instance.getFullName();
        System.out.println("GetFullName correct funtion");
    }

    /**
     * Test of setFullName method, of class Person.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "Sebastian";
        Person instance = new Person();
        instance.setFullName(fullName);
        System.out.println("SetFullName correct funtion");
    }
    
    @Test
    public void testSetFullName2() {
        System.out.println("setFullName");
        String fullName = "Byron Cóndor";
        Person instance = new Person();
        instance.setFullName(fullName);
        System.out.println("SetFullName correct funtion");
    }
    
    @Test
    public void testSetFullName3() {
        System.out.println("setFullName");
        String fullName = "Bryan Zurita";
        Person instance = new Person();
        instance.setFullName(fullName);
        System.out.println("SetFullName correct funtion");
    }
    
    @Test
    public void testSetFullName4() {
        System.out.println("setFullName");
        String fullName = "Edwin Caiza";
        Person instance = new Person();
        instance.setFullName(fullName);
        System.out.println("SetFullName correct funtion");
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new Person();
        int expResult = 18;
        int result = instance.getAge();
        System.out.println("GetAge correct funtion");
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 18;
        Person instance = new Person();
        instance.setAge(age);
        System.out.println("SetAge correct funtion");
    }
    
    @Test
    public void testSetAge2() {
        System.out.println("setAge");
        int age = 20;
        Person instance = new Person();
        instance.setAge(age);
        System.out.println("SetAge correct funtion");
    }
    
    @Test
    public void testSetAge3() {
        System.out.println("setAge");
        int age = 22;
        Person instance = new Person();
        instance.setAge(age);
        System.out.println("SetAge correct funtion");
    }
    
    @Test
    public void testSetAge4() {
        System.out.println("setAge");
        int age = 34;
        Person instance = new Person();
        instance.setAge(age);
        System.out.println("SetAge correct funtion");
    }

    /**
     * Test of getIdentifyCardNumber method, of class Person.
     */
    @Test
    public void testGetIdentifyCardNumber() {
        System.out.println("getIdentifyCardNumber");
        Person instance = new Person();
        instance.setIdentifyCardNumber("1725644528");
        String expResult = "1725644528";
        String result = instance.getIdentifyCardNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdentifyCardNumber method, of class Person.
     */
    @Test
    public void testSetIdentifyCardNumber() {
        System.out.println("setIdentifyCardNumber");
        String identifyCardNumber = "1725644528";
        Person instance = new Person();
        instance.setIdentifyCardNumber(identifyCardNumber);
        System.out.println("SetIdentifyCardNumber correct funtion");
    }
    
    @Test
    public void testSetIdentifyCardNumber2() {
        System.out.println("setIdentifyCardNumber");
        String identifyCardNumber = "17256443444";
        Person instance = new Person();
        instance.setIdentifyCardNumber(identifyCardNumber);
        System.out.println("SetIdentifyCardNumber correct funtion");
    }
    
    @Test
    public void testSetIdentifyCardNumber3() {
        System.out.println("setIdentifyCardNumber");
        String identifyCardNumber = "1710030568";
        Person instance = new Person();
        instance.setIdentifyCardNumber(identifyCardNumber);
        System.out.println("SetIdentifyCardNumber correct funtion");
    }

    /**
     * Test of getPhoneNumber method, of class Person.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Person instance = new Person();
        String expResult = "0995700324";
        String result = instance.getPhoneNumber();
        System.out.println("GetPhoneNumber correct funtion");
    }

    /**
     * Test of setPhoneNumber method, of class Person.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0995700324";
        Person instance = new Person();
        instance.setPhoneNumber(phoneNumber);
        System.out.println("SetPhoneNumber correct funtion");
    }
    
    @Test
    public void testSetPhoneNumber2() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0995345968";
        Person instance = new Person();
        instance.setPhoneNumber(phoneNumber);
        System.out.println("SetPhoneNumber correct funtion");
    }
    
    @Test
    public void testSetPhoneNumber3() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0935700324";
        Person instance = new Person();
        instance.setPhoneNumber(phoneNumber);
        System.out.println("SetPhoneNumber correct funtion");
    }
    
    @Test
    public void testSetPhoneNumber4() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0965744324";
        Person instance = new Person();
        instance.setPhoneNumber(phoneNumber);
        System.out.println("SetPhoneNumber correct funtion");
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAddress();
        System.out.println("GetAddress correct funtion");
    }

    /**
     * Test of setAddress method, of class Person.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "24 de Mayo y Ascazubi";
        Person instance = new Person();
        instance.setAddress(address);
        System.out.println("SetAddress correct funtion");
    }
    
    public void testSetAddress2() {
        System.out.println("setAddress");
        String address = "Av Morita y Rodolfo";
        Person instance = new Person();
        instance.setAddress(address);
        System.out.println("SetAddress correct funtion");
    }
    
    public void testSetAddress3() {
        System.out.println("setAddress");
        String address = "Av. Lola Quintana";
        Person instance = new Person();
        instance.setAddress(address);
        System.out.println("SetAddress correct funtion");
    }

    /**
     * Test of checkIdentifyCardNumber method, of class Person.
     */
    @Test
    public void testCheckIdentifyCardNumber() {
        System.out.println("checkIdentifyCardNumber");
        String idCard = "1725644528";
        Person instance = new Person();
        boolean expResult = true;
        boolean result = instance.checkIdentifyCardNumber(idCard);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckIdentifyCardNumber2() {
        System.out.println("checkIdentifyCardNumber");
        String idCard = "1710045463";
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.checkIdentifyCardNumber(idCard);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckIdentifyCardNumber3() {
        System.out.println("checkIdentifyCardNumber");
        String idCard = "1256544528";
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.checkIdentifyCardNumber(idCard);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckIdentifyCardNumber4() {
        System.out.println("checkIdentifyCardNumber");
        String idCard = "0925644528";
        Person instance = new Person();
        boolean expResult = true;
        boolean result = instance.checkIdentifyCardNumber(idCard);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckIdentifyCardNumber5() {
        System.out.println("checkIdentifyCardNumber");
        String idCard = "17256528";
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.checkIdentifyCardNumber(idCard);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }

    /**
     * Test of checkPhoneNumber method, of class Person.
     */
    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String phoneNumber = "0969180469";
        Person instance = new Person();
        boolean expResult = true;
        boolean result = instance.checkPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckPhoneNumber2() {
        System.out.println("checkPhoneNumber");
        String phoneNumber = "0995363737";
        Person instance = new Person();
        boolean expResult = true;
        boolean result = instance.checkPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
    @Test
    public void testCheckPhoneNumber3() {
        System.out.println("checkPhoneNumber");
        String phoneNumber = "0995700324";
        Person instance = new Person();
        boolean expResult = true;
        boolean result = instance.checkPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        System.out.println("expResult = result");
    }
    
}
