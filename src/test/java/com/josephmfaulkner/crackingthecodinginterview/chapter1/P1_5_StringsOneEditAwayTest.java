package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class P1_5_StringsOneEditAwayTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_5_StringsOneEditAwayTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_5_StringsOneEditAwayTest.class );
    }

    public void testOneEditAwayRemoveTrue()
    {
    	String testString1 = "pale";
    	String testString2 = "ple";
    	boolean expectedOneEditAway = true; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
    
    public void testOneEditAwayRemoveFalse()
    {
    	String testString1 = "palee";
    	String testString2 = "ple";
    	boolean expectedOneEditAway = false; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
    
    public void testOneEditAwayInsertTrue()
    {
    	String testString1 = "pale";
    	String testString2 = "pales";
    	boolean expectedOneEditAway = true; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
    
    public void testOneEditAwayInsertFalse()
    {
    	String testString1 = "pale";
    	String testString2 = "bake";
    	boolean expectedOneEditAway = false; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
    
    public void testOneEditAwayReplaceTrue()
    {
    	String testString1 = "apple";
    	String testString2 = "appie";
    	boolean expectedOneEditAway = true; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
    
    public void testOneEditAwayReplaceFalse()
    {
    	String testString1 = "apple";
    	String testString2 = "bppla";
    	boolean expectedOneEditAway = false; 
    	
    	boolean actualOneEditAway = P1_5_StringsOneEditAway.areOneEditAway(testString1,testString2);
    		
        assertEquals( expectedOneEditAway, actualOneEditAway );
    }
      
}

