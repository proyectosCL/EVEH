/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Componente;
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
public class Administrar_ComponenteTest {
    
    public Administrar_ComponenteTest() {
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
     * Test of ingresarNuevoComponente method, of class Administrar_Componente.
     */
    @Test
    public void testIngresarNuevoComponente() {
        System.out.println("ingresarNuevoComponente");
        Componente nuevoComponente = new Componente(0, "Descripcion de prueba1", "Fabricante de prueba1 ", Float.MAX_VALUE, 1, 1);
        Administrar_Componente instance = new Administrar_Componente();
        boolean expResult = false;
        boolean result = instance.ingresarNuevoComponente(nuevoComponente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarNuevoComponenteNave method, of class Administrar_Componente.
     */
    @Test
    public void testIngresarNuevoComponenteNave() {
        System.out.println("ingresarNuevoComponenteNave");
        Componente nuevoComponente = null;
        Administrar_Componente instance = new Administrar_Componente();
        boolean expResult = false;
        boolean result = instance.ingresarNuevoComponenteNave(nuevoComponente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFiltro method, of class Administrar_Componente.
     */
    @Test
    public void testListarFiltro() {
        System.out.println("listarFiltro");
        int tipoCompte = 0;
        Administrar_Componente instance = new Administrar_Componente();
        ArrayList<Componente> expResult = null;
        ArrayList<Componente> result = instance.listarFiltro(tipoCompte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFiltroId method, of class Administrar_Componente.
     */
    @Test
    public void testListarFiltroId() {
        System.out.println("listarFiltroId");
        int idCompte = 0;
        Administrar_Componente instance = new Administrar_Componente();
        ArrayList<Componente> expResult = null;
        ArrayList<Componente> result = instance.listarFiltroId(idCompte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarComponente method, of class Administrar_Componente.
     */
    @Test
    public void testListarComponente() {
        System.out.println("listarComponente");
        Administrar_Componente instance = new Administrar_Componente();
        ArrayList<Componente> expResult = null;
        ArrayList<Componente> result = instance.listarComponente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of definirTipoCompte method, of class Administrar_Componente.
     */
    @Test
    public void testDefinirTipoCompte() {
        System.out.println("definirTipoCompte");
        int id_tipo = 0;
        Administrar_Componente instance = new Administrar_Componente();
        String expResult = "";
        String result = instance.definirTipoCompte(id_tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarComponente method, of class Administrar_Componente.
     */
    @Test
    public void testEliminarComponente() {
        System.out.println("eliminarComponente");
        int id = 0;
        Administrar_Componente instance = new Administrar_Componente();
        instance.eliminarComponente(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponente method, of class Administrar_Componente.
     */
    @Test
    public void testModificarComponente() {
        System.out.println("modificarComponente");
        Componente nuevoComponente = null;
        Administrar_Componente instance = new Administrar_Componente();
        instance.modificarComponente(nuevoComponente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asociarAeronave method, of class Administrar_Componente.
     */
    @Test
    public void testAsociarAeronave() {
        System.out.println("asociarAeronave");
        int idCompte = 0;
        String matriculaNave = "";
        Administrar_Componente instance = new Administrar_Componente();
        instance.asociarAeronave(idCompte, matriculaNave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asociarSubcomponente method, of class Administrar_Componente.
     */
    @Test
    public void testAsociarSubcomponente() {
        System.out.println("asociarSubcomponente");
        Componente nuevoComponente = null;
        Administrar_Componente instance = new Administrar_Componente();
        boolean expResult = false;
        boolean result = instance.asociarSubcomponente(nuevoComponente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarIdSubComponente method, of class Administrar_Componente.
     */
    @Test
    public void testBuscarIdSubComponente() {
        System.out.println("buscarIdSubComponente");
        Administrar_Componente instance = new Administrar_Componente();
        int expResult = 0;
        int result = instance.buscarIdSubComponente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCompteLibre method, of class Administrar_Componente.
     */
    @Test
    public void testListarCompteLibre() {
        System.out.println("listarCompteLibre");
        Administrar_Componente instance = new Administrar_Componente();
        ArrayList<Componente> expResult = null;
        ArrayList<Componente> result = instance.listarCompteLibre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarHoras method, of class Administrar_Componente.
     */
    @Test
    public void testSumarHoras() {
        System.out.println("sumarHoras");
        Administrar_Componente instance = new Administrar_Componente();
        instance.sumarHoras();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
