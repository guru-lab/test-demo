package FirstTry.test_demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import junit.framework.TestCase;  
import junit.framework.TestSuite;  

/**
 * Unit test for simple App.
 */
public class AppTest extend TestCase
{
    public AppTest( String testName )  
    {  
        super( testName );  
    }  
    /** 
     * @return the suite of tests being tested 
     */  
    public static Test suite()  
    {  
        return new TestSuite( AppTest.class );  
    }  
    /** 
     * Rigourous Test :-) 
     */  
    @Test
    public void simpleTest()
    {
    	int a = 1;
    	int b = 2;
    	
    	assertTrue( a+b == 3 );
        assertTrue( true );
        
  
        
    }
}
