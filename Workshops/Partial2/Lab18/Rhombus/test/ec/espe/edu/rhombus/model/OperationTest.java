/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.rhombus.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class OperationTest {
    
    public OperationTest() {
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
     * Test of perimeter method, of class Operation.
     */
    @Test
    public void testPerimeterSimpleCases() {
        System.out.println("perimeter");
        double greaterDiag = 2.3;
        double minorDiag = 1.6;
        Operation instance = new Operation();
        double expResult = 5.60;
        double result = instance.perimeter(greaterDiag, minorDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El perimetro del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcto");
        
        greaterDiag = 25;
        minorDiag = 17;
        expResult = 60.46;
        result = instance.perimeter(greaterDiag, minorDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El perimetro del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcto");
        
        greaterDiag = 106.87;
        minorDiag = 29.19;
        expResult = 221.57;
        result = instance.perimeter(greaterDiag, minorDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El perimetro del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcto");
        
       
    }
    
     @Test
     
    public void testPerimeterWrongCases() {
        
        double greaterDiag = 0;
        double minorDiag = 2;
        Operation instance = new Operation();
        double expResult = 4;
        double result = instance.perimeter(greaterDiag, minorDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El perimetro del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcto");
    }
    
      @Test
     
    public void testPerimeterCharacters() {
        
        double greaterDiag = 14.87;
        double minorDiag = 'f';
        Operation instance = new Operation();
        double expResult = 0.0;
        double result = instance.perimeter(greaterDiag, minorDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El perimetro del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcto");
    }

    @Test
    public void testAreaSimpleCases() {
        System.out.println("area");
        double minorDiag = 3;
        double greaterDiag = 25;
        Operation instance = new Operation();
        double expResult = 37.5;
        double result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
        
         minorDiag = 7;
         greaterDiag = 16;
         expResult = 56;
         result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
        
         minorDiag = 13.2;
         greaterDiag = 25.6;
         expResult = 168.96;
         result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
        
         minorDiag =11.7;
         greaterDiag = 37.64;
         expResult = 220.19;
         result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
        
         minorDiag = 3.27;
         greaterDiag = 9.99;
         expResult = 16.33;
         result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );    
    }
    
     @Test
    public void testAreaWrongCases() {
        double minorDiag = -11.7;
        double greaterDiag = 18;
        Operation instance = new Operation();
        double expResult = -105.3;
        double result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
    }
    
     @Test
    public void testAreaCharactersCases() {
        double minorDiag = 'a';
        double greaterDiag = 'b';
        Operation instance = new Operation();
        double expResult = 0.0;
        double result = instance.area(minorDiag, greaterDiag);
        assertEquals(expResult, result, 0.0);
        System.out.println("El area del rombo con diagonales "+minorDiag+" y "+greaterDiag+" es correcta" );
    }
}
