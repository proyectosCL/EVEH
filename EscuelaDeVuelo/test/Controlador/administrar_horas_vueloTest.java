/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcbla
 */
public class administrar_horas_vueloTest {
    
    public administrar_horas_vueloTest() {
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
     * Test of sumarHoras method, of class administrar_horas_vuelo.
     */
    @Test
    public void testSumarHoras() {
        System.out.println("sumarHoras");
        administrar_horas_vuelo instance = new administrar_horas_vueloImpl();
        instance.sumarHoras();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class administrar_horas_vueloImpl implements administrar_horas_vuelo {

        public void sumarHoras() {
        }
    }
    
}
