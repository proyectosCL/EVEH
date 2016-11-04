/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Licencia;
import Modelo.Tipo_licencia;
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
public class Administrar_LicenciaTest {
    
    public Administrar_LicenciaTest() {
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
     * Test of ingresarLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testIngresarLicencia() {
        System.out.println("ingresarLicencia");
        Licencia nlicencia = null;
        Administrar_Licencia instance = new Administrar_Licencia();
        instance.ingresarLicencia(nlicencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testModificarLicencia() {
        System.out.println("modificarLicencia");
        Licencia nlicencia = null;
        Administrar_Licencia instance = new Administrar_Licencia();
        instance.modificarLicencia(nlicencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testEliminarLicencia() {
        System.out.println("eliminarLicencia");
        int id = 0;
        Administrar_Licencia instance = new Administrar_Licencia();
        instance.eliminarLicencia(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTipoLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testListarTipoLicencia() {
        System.out.println("listarTipoLicencia");
        Administrar_Licencia instance = new Administrar_Licencia();
        ArrayList<Tipo_licencia> expResult = null;
        ArrayList<Tipo_licencia> result = instance.listarTipoLicencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testListarLicencia() {
        System.out.println("listarLicencia");
        Administrar_Licencia instance = new Administrar_Licencia();
        ArrayList<Licencia> expResult = null;
        ArrayList<Licencia> result = instance.listarLicencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLicencia2 method, of class Administrar_Licencia.
     */
    @Test
    public void testListarLicencia2() {
        System.out.println("listarLicencia2");
        String rut = "";
        Administrar_Licencia instance = new Administrar_Licencia();
        ArrayList<Licencia> expResult = null;
        ArrayList<Licencia> result = instance.listarLicencia2(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNumeroLicencia method, of class Administrar_Licencia.
     */
    @Test
    public void testBuscarNumeroLicencia() {
        System.out.println("buscarNumeroLicencia");
        int numero = 0;
        Administrar_Licencia instance = new Administrar_Licencia();
        boolean expResult = false;
        boolean result = instance.buscarNumeroLicencia(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNumeroLicenciaModificar method, of class Administrar_Licencia.
     */
    @Test
    public void testBuscarNumeroLicenciaModificar() {
        System.out.println("buscarNumeroLicenciaModificar");
        int numero = 0;
        int id = 0;
        Administrar_Licencia instance = new Administrar_Licencia();
        boolean expResult = false;
        boolean result = instance.buscarNumeroLicenciaModificar(numero, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLicenciaID method, of class Administrar_Licencia.
     */
    @Test
    public void testListarLicenciaID() {
        System.out.println("listarLicenciaID");
        int id = 0;
        Administrar_Licencia instance = new Administrar_Licencia();
        ArrayList<Licencia> expResult = null;
        ArrayList<Licencia> result = instance.listarLicenciaID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
