package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class P1_2_StringPermutationsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_2_StringPermutationsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_2_StringPermutationsTest.class );
    }


    public void testPermutationsTrue()
    {
    	String testString1 = "ABBA";
    	String testString2 = "BABA";
    	boolean expectedArePermutations = true; 
    	
    	boolean actualArePermutations = P1_2_StringCharsPermutation.arePermutation(testString1,testString2);
    	
        assertEquals( expectedArePermutations, actualArePermutations );
    }
    
    public void testPermutationsTrue2()
    {
    	String testString1 = "eleven plus two";
    	String testString2 = "twelve plus one";
    	boolean expectedArePermutations = true; 
    	
    	boolean actualArePermutations = P1_2_StringCharsPermutation.arePermutation(testString1,testString2);
    	
        assertEquals( expectedArePermutations, actualArePermutations );
    }
    
    public void testPermutationsFalse()
    {
    	String testString1 = "OLIVE";
    	String testString2 = "BABA";
    	boolean expectedArePermutations = false; 
    	
    	boolean actualArePermutations = P1_2_StringCharsPermutation.arePermutation(testString1,testString2);
    	
        assertEquals( expectedArePermutations, actualArePermutations );
    }
    
    public void testPermutationsFalseOneOff()
    {
    	String testString1 = "OLIVE";
    	String testString2 = "OLIVEE";
    	boolean expectedArePermutations = false; 
    	
    	boolean actualArePermutations = P1_2_StringCharsPermutation.arePermutation(testString1,testString2);
    	
        assertEquals( expectedArePermutations, actualArePermutations );
    }
    
    public void testPermutationsFalseOneOff2()
    {
    	String testString1 = "OLIVE";
    	String testString2 = "OLIVEA";
    	boolean expectedArePermutations = false; 
    	
    	boolean actualArePermutations = P1_2_StringCharsPermutation.arePermutation(testString1,testString2);
    	
        assertEquals( expectedArePermutations, actualArePermutations );
    }
      
}
