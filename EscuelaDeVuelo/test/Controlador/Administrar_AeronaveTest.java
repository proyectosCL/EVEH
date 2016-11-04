/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aeronave;
import java.util.ArrayList;
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
public class Administrar_AeronaveTest {
    
    public Administrar_AeronaveTest() {
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
     * Test of ingresarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testIngresarAeronave() {
        System.out.println("ingresarAeronave");
        Aeronave nuevoAeronave = null;
        Administrar_Aeronave instance = new Administrar_Aeronave();
        boolean expResult = false;
        boolean result = instance.ingresarAeronave(nuevoAeronave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testBuscarAeronave() {
        System.out.println("buscarAeronave");
        String matricula = "";
        Administrar_Aeronave instance = new Administrar_Aeronave();
        boolean expResult = false;
        boolean result = instance.buscarAeronave(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testEliminarAeronave() {
        System.out.println("eliminarAeronave");
        String id = "";
        Administrar_Aeronave instance = new Administrar_Aeronave();
        boolean expResult = false;
        boolean result = instance.eliminarAeronave(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asociarComponentes method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testAsociarComponentes() {
        System.out.println("asociarComponentes");
        Administrar_Aeronave instance = new Administrar_Aeronave();
        instance.asociarComponentes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alertarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testAlertarAeronave() {
        System.out.println("alertarAeronave");
        Administrar_Aeronave instance = new Administrar_Aeronave();
        instance.alertarAeronave();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testCargarAeronave() {
        System.out.println("cargarAeronave");
        int matricula = 0;
        Administrar_Aeronave instance = new Administrar_Aeronave();
        Aeronave expResult = null;
        Aeronave result = instance.cargarAeronave(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testModificarAeronave() {
        System.out.println("modificarAeronave");
        Aeronave nuevoAeronave = null;
        Administrar_Aeronave instance = new Administrar_Aeronave();
        boolean expResult = false;
        boolean result = instance.modificarAeronave(nuevoAeronave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarAeronave method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testListarAeronave() {
        System.out.println("listarAeronave");
        Administrar_Aeronave instance = new Administrar_Aeronave();
        ArrayList<Aeronave> expResult = null;
        ArrayList<Aeronave> result = instance.listarAeronave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPorMatricula method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testListarPorMatricula() {
        System.out.println("listarPorMatricula");
        String matri = "";
        Administrar_Aeronave instance = new Administrar_Aeronave();
        ArrayList<Aeronave> expResult = null;
        ArrayList<Aeronave> result = instance.listarPorMatricula(matri);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarHoras method, of class Administrar_Aeronave.
     */
    @org.junit.Test
    public void testSumarHoras() {
        System.out.println("sumarHoras");
        Administrar_Aeronave instance = new Administrar_Aeronave();
        instance.sumarHoras();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
