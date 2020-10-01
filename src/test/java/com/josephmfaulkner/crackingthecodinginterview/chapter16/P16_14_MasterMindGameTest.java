package com.josephmfaulkner.crackingthecodinginterview.chapter16;

import static org.junit.Assert.*;

import org.junit.Test;

public class P16_14_MasterMindGameTest {

	@Test
	public void testOneHitNoP() {
		String testMatch = "RGBY";
		String testGuess = "RRRR";
		String expectedHitCount = "1-0";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}
	
	@Test
	public void testAllHits() {
		String testMatch = "RRRR";
		String testGuess = "RRRR";
		String expectedHitCount = "4-0";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}
	
	@Test
	public void testAllPartialHits() {
		String testMatch = "YRGB";
		String testGuess = "BGRY";
		String expectedHitCount = "0-4";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}
	
	@Test
	public void testNoHits() {
		String testMatch = "YYGB";
		String testGuess = "RRRR";
		String expectedHitCount = "0-0";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}
	
	@Test
	public void test2Hit1Partial() {
		String testMatch = "RRGY";
		String testGuess = "RRRG";
		String expectedHitCount = "2-1";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}
	
	@Test
	public void test2Hit2Partial() {
		String testMatch = "RRGY";
		String testGuess = "RRRG";
		String expectedHitCount = "2-1";
		String actualHitCount = P16_15_MasterMindGame.getHits(testMatch, testGuess);
		
		assertEquals(expectedHitCount, actualHitCount);
		
	}

}
