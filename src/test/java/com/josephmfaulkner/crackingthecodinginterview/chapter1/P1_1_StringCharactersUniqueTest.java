package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class P1_1_StringCharactersUniqueTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_1_StringCharactersUniqueTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_1_StringCharactersUniqueTest.class );
    }


    public void testAllUniqueTrue()
    {
    	String testString = "QWERTY";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalse()
    {
    	String testString = "APPLE";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueTrueLongString()
    {
    	String testString = "1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*()";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseLongString()
    {
    	String testString = ".1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*().";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
        
}
