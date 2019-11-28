package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringCharactersUniqueTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringCharactersUniqueTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StringCharactersUniqueTest.class );
    }


    public void testAllUniqueTrue()
    {
    	String testString = "QWERTY";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalse()
    {
    	String testString = "APPLE";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueTrueLongString()
    {
    	String testString = "1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*()";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseLongString()
    {
    	String testString = ".1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*().";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharacters(testString);
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
        
}
