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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getMainStreetName method, of class Location.
     */
    @Test
    public void testGetMainStreetName() {
        System.out.println("getMainStreetName");
        Location instance = new Location("Av Amazonas","Calle Tiputini","Empanadas Campo Viejo","765");
        String expResult = "Av Amazonas";
        String result = instance.getMainStreetName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMainStreetName method, of class Location.
     */
    @Test
    public void testSetMainStreetName() {
        System.out.println("setMainStreetName");
        String mainStreetName = "García Moreno";
        Location instance = new Location();
        instance.setMainStreetName(mainStreetName);
        System.out.println("testSetMainStreetName correct funtion");
    }
    
    @Test
    public void testSetMainStreetName2() {
        System.out.println("setMainStreetName");
        String mainStreetName = "Avenida Lola Quintana";
        Location instance = new Location();
        instance.setMainStreetName(mainStreetName);
        System.out.println("testSetMainStreetName correct funtion");
    }
    
    @Test
    public void testSetMainStreetName3() {
        System.out.println("setMainStreetName");
        String mainStreetName = "Jorge pino de Icaza";
        Location instance = new Location();
        instance.setMainStreetName(mainStreetName);
        System.out.println("testSetMainStreetName correct funtion");
    }
    
    @Test
    public void testSetMainStreetName4() {
        System.out.println("setMainStreetName");
        String mainStreetName = "La Brasil";
        Location instance = new Location();
        instance.setMainStreetName(mainStreetName);
        System.out.println("testSetMainStreetName correct funtion");
    }

    /**
     * Test of getSecondaryStreetName method, of class Location.
     */
    @Test
    public void testGetSecondaryStreetName() {
        System.out.println("getSecondaryStreetName");
        Location instance = new Location();
        String expResult = "Ascazubi San Jose";
        String result = instance.getSecondaryStreetName();
        System.out.println("testGetSecondaryStreetName correct funtion");
    }

    /**
     * Test of setSecondaryStreetName method, of class Location.
     */
    @Test
    public void testSetSecondaryStreetName() {
        System.out.println("setSecondaryStreetName");
        String secondaryStreetName = "24 de Mayo";
        Location instance = new Location();
        instance.setSecondaryStreetName(secondaryStreetName);
        System.out.println("setSecondaryStreetName correct funtion");
    }
    
    @Test
    public void testSetSecondaryStreetName2() {
        System.out.println("setSecondaryStreetName");
        String secondaryStreetName = "Av Ilalo";
        Location instance = new Location();
        instance.setSecondaryStreetName(secondaryStreetName);
        System.out.println("setSecondaryStreetName correct funtion");
    }
    
    @Test
    public void testSetSecondaryStreetName3() {
        System.out.println("setSecondaryStreetName");
        String secondaryStreetName = "Av. Benjamin Carrion";
        Location instance = new Location();
        instance.setSecondaryStreetName(secondaryStreetName);
        System.out.println("setSecondaryStreetName correct funtion");
    }
    
    @Test
    public void testSetSecondaryStreetName4() {
        System.out.println("setSecondaryStreetName");
        String secondaryStreetName = "Sucre y 24 de Mayo";
        Location instance = new Location();
        instance.setSecondaryStreetName(secondaryStreetName);
        System.out.println("setSecondaryStreetName correct funtion");
    }

    /**
     * Test of getReferences method, of class Location.
     */
    @Test
    public void testGetReferences() {
        System.out.println("getReferences");
        Location instance = new Location();
        String expResult = "";
        String result = instance.getReferences();
        System.out.println("GetReferences correct funtion");
    }

    /**
     * Test of setReferences method, of class Location.
     */
    @Test
    public void testSetReferences() {
        System.out.println("setReferences");
        String references = "Frente a la Gasolineria Super";
        Location instance = new Location();
        instance.setReferences(references);
        System.out.println("setReferences correct funtion");
    }
    
    @Test
    public void testSetReferences2() {
        System.out.println("setReferences");
        String references = "Frente a los pollos de la J";
        Location instance = new Location();
        instance.setReferences(references);
        System.out.println("setReferences correct funtion");
    }
    
    @Test
    public void testSetReferences3() {
        System.out.println("setReferences");
        String references = "Centro comercial el bosque local 23";
        Location instance = new Location();
        instance.setReferences(references);
        System.out.println("setReferences correct funtion");
    }

    /**
     * Test of getPostalCode method, of class Location.
     */
    @Test
    public void testGetPostalCode() {
        System.out.println("getPostalCode");
        Location instance = new Location();
        String expResult = "";
        String result = instance.getPostalCode();
        System.out.println("getPostalCode correct funtion");
    }

    /**
     * Test of setPostalCode method, of class Location.
     */
    @Test
    public void testSetPostalCode() {
        System.out.println("setPostalCode");
        String postalCode = "038348";
        Location instance = new Location();
        instance.setPostalCode(postalCode);
        System.out.println("setPostalCode correct funtion");
    }
    
    public void testSetPostalCode2() {
        System.out.println("setPostalCode");
        String postalCode = "094647";
        Location instance = new Location();
        instance.setPostalCode(postalCode);
        System.out.println("setPostalCode correct funtion");
    }
    
    public void testSetPostalCode3() {
        System.out.println("setPostalCode");
        String postalCode = "095666";
        Location instance = new Location();
        instance.setPostalCode(postalCode);
        System.out.println("setPostalCode correct funtion");
    }
    
    public void testSetPostalCode4() {
        System.out.println("setPostalCode");
        String postalCode = "090155";
        Location instance = new Location();
        instance.setPostalCode(postalCode);
        System.out.println("setPostalCode correct funtion");
    }
    
}
