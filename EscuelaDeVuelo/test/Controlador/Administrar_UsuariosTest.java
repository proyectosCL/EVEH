/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
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
public class Administrar_UsuariosTest {
    
    public Administrar_UsuariosTest() {
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
     * Test of ingresarUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testIngresarUsuario() {
        System.out.println("ingresarUsuario");
        Usuario nuevoUsuario = null;
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.ingresarUsuario(nuevoUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarPUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testCargarPUsuario() {
        System.out.println("cargarPUsuario");
        int id = 0;
        Administrar_Usuarios instance = new Administrar_Usuarios();
        Usuario expResult = null;
        Usuario result = instance.cargarPUsuario(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String cuenta = "";
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.buscarUsuario(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticarUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testAutenticarUsuario() {
        System.out.println("autenticarUsuario");
        String usuario = "";
        String pass = "";
        Administrar_Usuarios instance = new Administrar_Usuarios();
        Usuario expResult = null;
        Usuario result = instance.autenticarUsuario(usuario, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("modificarUsuario");
        Usuario nuevoUsuario = null;
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.modificarUsuario(nuevoUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String cuenta = "";
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.eliminarUsuario(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeBaja method, of class Administrar_Usuarios.
     */
    @Test
    public void testDarDeBaja() {
        System.out.println("darDeBaja");
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.darDeBaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeAlta method, of class Administrar_Usuarios.
     */
    @Test
    public void testDarDeAlta() {
        System.out.println("darDeAlta");
        String cuenta = "";
        Administrar_Usuarios instance = new Administrar_Usuarios();
        boolean expResult = false;
        boolean result = instance.darDeAlta(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Administrar_Usuarios instance = new Administrar_Usuarios();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Administrar_Usuarios.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Administrar_Usuarios instance = new Administrar_Usuarios();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
