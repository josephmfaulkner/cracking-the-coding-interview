package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class P1_4_PalindromePermutationTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public P1_4_PalindromePermutationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( P1_4_PalindromePermutationTest.class );
    }
    
    
    public void testPalindromePermutation1True()
    {
    	String testString = "ABBA";
    	boolean expectedResult = true; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testPalindromePermutation2True()
    {
    	String testString = "OABOBAO";
    	boolean expectedResult = true; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testPalindromePermutation3True()
    {
    	String testString = "ABABO";
    	boolean expectedResult = true; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testPalindromePermutation1False()
    {
    	String testString = "PERM";
    	boolean expectedResult = false; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testPalindromePermutation2False()
    {
    	String testString = "ABOBAIII";
    	boolean expectedResult = false; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
    public void testPalindromePermutation3False()
    {
    	String testString = "ABABOI";
    	boolean expectedResult = false; 
    	
    	boolean actualResult = P1_4_PalindromePermutation.palindromePermutation(testString);
    		
        assertEquals( expectedResult, actualResult );
    }
    
}
