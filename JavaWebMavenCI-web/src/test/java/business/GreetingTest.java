
package business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amine
 */
public class GreetingTest {
    
     static Greeting instance ;
     
    public GreetingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         instance = new Greeting();
         System.out.println("business.GreetingTest.setUpClass()");
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance=null;
    }
    
    @Before
    public void setUp() {
        System.out.println("business.GreetingTest.setUp()");
    }
    
    @After
    public void tearDown() {
        System.out.println("business.GreetingTest.tearDown()");
    }

    /**
     * Test of sayHello method, of class Greeting.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        String name = "Google";
//        Greeting instance = new Greeting();
        String expResult = "Hello Google";
        String result = instance.sayHello(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
