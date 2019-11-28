package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringCharactersUniqueSortTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringCharactersUniqueSortTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StringCharactersUniqueSortTest.class );
    }


    public void testAllUniqueTrueSort()
    {
    	String testString = "QWERTY";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseSort()
    {
    	String testString = "APPLE";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueTrueLongStringSort()
    {
    	String testString = "1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*()";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseLongStringSort()
    {
    	String testString = ".1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*().";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = StringCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
        
}