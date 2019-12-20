package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class P1_1_AllCharsUniqueSortTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_1_AllCharsUniqueSortTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_1_AllCharsUniqueSortTest.class );
    }


    public void testAllUniqueTrueSort()
    {
    	String testString = "QWERTY";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseSort()
    {
    	String testString = "APPLE";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueTrueLongStringSort()
    {
    	String testString = "1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*()";
    	boolean expectedAllUnique = true; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
    
    public void testAllUniqueFalseLongStringSort()
    {
    	String testString = ".1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*().";
    	boolean expectedAllUnique = false; 
    	boolean actualAllUnique = P1_1_AllCharsUnique.allUniqueCharactersSort(testString.toCharArray());
    	
        assertEquals( expectedAllUnique, actualAllUnique );
    }
        
}