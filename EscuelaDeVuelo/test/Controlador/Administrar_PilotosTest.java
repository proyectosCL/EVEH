/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Piloto;
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
public class Administrar_PilotosTest {
    
    public Administrar_PilotosTest() {
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
     * Test of ingresarPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testIngresarPiloto() {
        System.out.println("ingresarPiloto");
        Piloto npiloto = null;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        instance.ingresarPiloto(npiloto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testModificarPiloto() {
        System.out.println("modificarPiloto");
        Piloto npiloto = null;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        instance.modificarPiloto(npiloto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testEliminarPiloto() {
        System.out.println("eliminarPiloto");
        int id = 0;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        instance.eliminarPiloto(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alertarPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testAlertarPiloto() {
        System.out.println("alertarPiloto");
        Administrar_Pilotos instance = new Administrar_Pilotos();
        instance.alertarPiloto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarHoras method, of class Administrar_Pilotos.
     */
    @Test
    public void testSumarHoras() {
        System.out.println("sumarHoras");
        Administrar_Pilotos instance = new Administrar_Pilotos();
        instance.sumarHoras();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarIdPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testBuscarIdPiloto() {
        System.out.println("buscarIdPiloto");
        String rut = "";
        Administrar_Pilotos instance = new Administrar_Pilotos();
        int expResult = 0;
        int result = instance.buscarIdPiloto(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testListarPiloto() {
        System.out.println("listarPiloto");
        Administrar_Pilotos instance = new Administrar_Pilotos();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPiloto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPilotoIngresar method, of class Administrar_Pilotos.
     */
    @Test
    public void testListarPilotoIngresar() {
        System.out.println("listarPilotoIngresar");
        Administrar_Pilotos instance = new Administrar_Pilotos();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPilotoIngresar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRutPiloto method, of class Administrar_Pilotos.
     */
    @Test
    public void testBuscarRutPiloto() {
        System.out.println("buscarRutPiloto");
        int id = 0;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        String expResult = "";
        String result = instance.buscarRutPiloto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPilotoR method, of class Administrar_Pilotos.
     */
    @Test
    public void testBuscarPilotoR() {
        System.out.println("buscarPilotoR");
        int id_persona = 0;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        boolean expResult = false;
        boolean result = instance.buscarPilotoR(id_persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPilotoMasCantidadLicencia method, of class Administrar_Pilotos.
     */
    @Test
    public void testListarPilotoMasCantidadLicencia() {
        System.out.println("listarPilotoMasCantidadLicencia");
        Administrar_Pilotos instance = new Administrar_Pilotos();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPilotoMasCantidadLicencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPilotoID method, of class Administrar_Pilotos.
     */
    @Test
    public void testListarPilotoID() {
        System.out.println("listarPilotoID");
        int id = 0;
        Administrar_Pilotos instance = new Administrar_Pilotos();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPilotoID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
