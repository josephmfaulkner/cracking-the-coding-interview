package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class P1_9_StringRotationTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_9_StringRotationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_9_StringRotationTest.class );
    }
    
    
    public void testIsStringRotation1True()
    {
    	String testString = "waterbottle";
    	String testString2 = "ttlewaterbo";
    	boolean expectedResult = true; 
    	
    	boolean actualResult = P1_9_StringRotation.isRotation(testString, testString2); 
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testIsStringRotation2False()
    {
    	String testString = "waterbottle";
    	String testString2 = "potatoes";
    	boolean expectedResult = false; 
    	
    	boolean actualResult = P1_9_StringRotation.isRotation(testString, testString2); 
    		
        assertEquals( expectedResult, actualResult );
    }
   
}
