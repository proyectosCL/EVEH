/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aerodromo;
import Modelo.Aeronave;
import Modelo.Licencia;
import Modelo.Piloto;
import Modelo.Vuelo;
import java.util.ArrayList;
import java.util.Date;
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
public class Administrar_VueloTest {
    
    public Administrar_VueloTest() {
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
     * Test of ingresarVuelo method, of class Administrar_Vuelo.
     */
    @Test
    public void testIngresarVuelo() {
        System.out.println("ingresarVuelo");
        Vuelo vuelo = null;
        int piloto = 0;
        String[] tripulacion = null;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        instance.ingresarVuelo(vuelo, piloto, tripulacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarVuelo method, of class Administrar_Vuelo.
     */
    @Test
    public void testModificarVuelo() {
        System.out.println("modificarVuelo");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        instance.modificarVuelo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVuelo method, of class Administrar_Vuelo.
     */
    @Test
    public void testEliminarVuelo() {
        System.out.println("eliminarVuelo");
        int id = 0;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        instance.eliminarVuelo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarHoras method, of class Administrar_Vuelo.
     */
    @Test
    public void testSumarHoras() {
        System.out.println("sumarHoras");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        instance.sumarHoras();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarHoras3 method, of class Administrar_Vuelo.
     */
    @Test
    public void testSumarHoras3() {
        System.out.println("sumarHoras3");
        int id = 0;
        Date fecha_inicio = null;
        Date fecha_termino = null;
        String[] licencias = null;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        instance.sumarHoras3(id, fecha_inicio, fecha_termino, licencias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarAerodromo method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarAerodromo() {
        System.out.println("listarAerodromo");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Aerodromo> expResult = null;
        ArrayList<Aerodromo> result = instance.listarAerodromo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarAeronave method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarAeronave() {
        System.out.println("listarAeronave");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Aeronave> expResult = null;
        ArrayList<Aeronave> result = instance.listarAeronave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPiloto method, of class Administrar_Vuelo.
     */
    @Test
    public void testBuscarPiloto() {
        System.out.println("buscarPiloto");
        String rut = "";
        Administrar_Vuelo instance = new Administrar_Vuelo();
        int expResult = 0;
        int result = instance.buscarPiloto(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPiloto method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarPiloto() {
        System.out.println("listarPiloto");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPiloto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPilotoUnico method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarPilotoUnico() {
        System.out.println("listarPilotoUnico");
        int id_vuelos = 0;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPilotoUnico(id_vuelos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLicencias method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarLicencias() {
        System.out.println("listarLicencias");
        int id_vuelos = 0;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Licencia> expResult = null;
        ArrayList<Licencia> result = instance.listarLicencias(id_vuelos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarVuelo method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarVuelo() {
        System.out.println("listarVuelo");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Vuelo> expResult = null;
        ArrayList<Vuelo> result = instance.listarVuelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarVueloNoTerminado method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarVueloNoTerminado() {
        System.out.println("listarVueloNoTerminado");
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Vuelo> expResult = null;
        ArrayList<Vuelo> result = instance.listarVueloNoTerminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPilotoID method, of class Administrar_Vuelo.
     */
    @Test
    public void testListarPilotoID() {
        System.out.println("listarPilotoID");
        int id = 0;
        Administrar_Vuelo instance = new Administrar_Vuelo();
        ArrayList<Piloto> expResult = null;
        ArrayList<Piloto> result = instance.listarPilotoID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
