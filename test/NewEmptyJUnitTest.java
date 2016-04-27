/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javajenkinstest.JavaJenkinsTest;
import javajenkinstest.Metodos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiehua
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
       
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pruebaSumaPositiva()
    {
     Metodos c = new Metodos();
        int x = c.Suma(5,6);                
        assertEquals(x, 11);
    }
    
    @Test
    public void pruebaSumaNegativa()
    {
     Metodos c = new Metodos();
        int x = c.Suma(-5,6);                
        assertEquals(x, 1);
    }
}
