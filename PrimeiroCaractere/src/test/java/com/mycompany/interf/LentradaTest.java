/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ariane
 */
public class LentradaTest {
    
    public LentradaTest() {
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
     * Teste de verificacao de retorno correto de string 
     */
    @org.junit.Test
    public void testLeEntrada() {
        System.out.println("leEntrada");
        Lentrada instance = new Lentrada();
        instance.leEntrada("aAbBABac");
        char expResult = 'b';
        char result = instance.firstChar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Teste de verificacao de erro de retorno 
     */
    @org.junit.Test
    public void testLeEntradaErrada() {
        System.out.println("leEntrada");
        Lentrada instance = new Lentrada();
        instance.leEntrada("aAbBABac");
        char expResult = 'b';
        char result = instance.firstChar();
        
        assertNotEquals('D', result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Teste de verificacao de ok getNext Metodo
     */
    @org.junit.Test
    public void testgetNextOK() {
        System.out.println("leEntrada");
        Lentrada instance = new Lentrada();
        instance.leEntrada("aAbBABac");
        char expResult = 'a';
        char result = instance.getNext();
        assertEquals('a', result);
    }
    
    
    /**
     * Teste de verificacao de ok hasNext Metodo
     */
    @org.junit.Test
    public void testHasNextOK() {
        System.out.println("leEntrada");
        Lentrada instance = new Lentrada();
        instance.leEntrada("aAbBABac");
        boolean expected = true; 
        boolean result = instance.hasNext();
        
        assertEquals(expected, result);
    }
    

    /**
     * Teste de verificacao de ok hasNext Metodo
     */
    @org.junit.Test
    public void testHasNextErro() {
        System.out.println("leEntrada");
        Lentrada instance = new Lentrada();
        instance.leEntrada("a");
        
        instance.getNext();
        
        
        boolean expected = false; 
        boolean result = instance.hasNext();
        
        assertEquals(expected, result);
    }

    
}
