/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
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
public class Administrar_PersonasTest {
    
    public Administrar_PersonasTest() {
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
     * Test of ingresarPersona method, of class Administrar_Personas.
     */
    @Test
    public void testIngresarPersona() {
        System.out.println("ingresarPersona");
        Persona npersona = null;
        Administrar_Personas instance = new Administrar_Personas();
        boolean expResult = false;
        boolean result = instance.ingresarPersona(npersona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class Administrar_Personas.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        String rut = "";
        Administrar_Personas instance = new Administrar_Personas();
        boolean expResult = false;
        boolean result = instance.buscarPersona(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarPersona method, of class Administrar_Personas.
     */
    @Test
    public void testCargarPersona() {
        System.out.println("cargarPersona");
        String rut = "";
        Administrar_Personas instance = new Administrar_Personas();
        Persona expResult = null;
        Persona result = instance.cargarPersona(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarRol method, of class Administrar_Personas.
     */
    @Test
    public void testAsignarRol() {
        System.out.println("asignarRol");
        Administrar_Personas instance = new Administrar_Personas();
        instance.asignarRol();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPersona method, of class Administrar_Personas.
     */
    @Test
    public void testModificarPersona() {
        System.out.println("modificarPersona");
        Persona persona = null;
        Administrar_Personas instance = new Administrar_Personas();
        boolean expResult = false;
        boolean result = instance.modificarPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeAlta method, of class Administrar_Personas.
     */
    @Test
    public void testDarDeAlta() {
        System.out.println("darDeAlta");
        Administrar_Personas instance = new Administrar_Personas();
        instance.darDeAlta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeBaja method, of class Administrar_Personas.
     */
    @Test
    public void testDarDeBaja() {
        System.out.println("darDeBaja");
        Administrar_Personas instance = new Administrar_Personas();
        instance.darDeBaja();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPersona method, of class Administrar_Personas.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        String rut = "";
        Administrar_Personas instance = new Administrar_Personas();
        boolean expResult = false;
        boolean result = instance.eliminarPersona(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaridpersona method, of class Administrar_Personas.
     */
    @Test
    public void testBuscaridpersona() {
        System.out.println("buscaridpersona");
        String rut = "";
        Administrar_Personas instance = new Administrar_Personas();
        int expResult = 0;
        int result = instance.buscaridpersona(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPersonas method, of class Administrar_Personas.
     */
    @Test
    public void testListarPersonas() {
        System.out.println("listarPersonas");
        Administrar_Personas instance = new Administrar_Personas();
        ArrayList<Persona> expResult = null;
        ArrayList<Persona> result = instance.listarPersonas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
