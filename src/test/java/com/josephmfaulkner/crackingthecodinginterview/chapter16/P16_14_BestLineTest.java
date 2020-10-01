package com.josephmfaulkner.crackingthecodinginterview.chapter16;

import static org.junit.Assert.*;

import org.junit.Test;

public class P16_14_BestLineTest {

	@Test
	public void line45Degree() {
		int point1[] = {0, 0};
		int point2[] = {1, 1};
		String expectedLineResult = "45";
		String actualLineResult = P16_14_BestLine.makeLineFromPoints(point1, point2);
		
		assertEquals(expectedLineResult, actualLineResult);
		
	}

	@Test
	public void line90Degree() {
		int point1[] = {0, 0};
		int point2[] = {0, 1};
		String expectedLineResult = "90";
		String actualLineResult = P16_14_BestLine.makeLineFromPoints(point1, point2);
		
		assertEquals(expectedLineResult, actualLineResult);
		
	}
	
	@Test
	public void lineNeg45Degree() {
		int point1[] = {0, 0};
		int point2[] = {1, -1};
		String expectedLineResult = "-45";
		String actualLineResult = P16_14_BestLine.makeLineFromPoints(point1, point2);
		
		assertEquals(expectedLineResult, actualLineResult);
		
	}
	
	@Test
	public void line135Degree() {
		int point1[] = {0, 0};
		int point2[] = {-1, 1};
		String expectedLineResult = "-45";
		String actualLineResult = P16_14_BestLine.makeLineFromPoints(point1, point2);
		
		assertEquals(expectedLineResult, actualLineResult);
		
	}
	
	@Test
	public void line225Degree() {
		int point1[] = {0, 0};
		int point2[] = {-1, -1};
		String expectedLineResult = "45";
		String actualLineResult = P16_14_BestLine.makeLineFromPoints(point1, point2);
		
		assertEquals(expectedLineResult, actualLineResult);
		
	}
	
}
