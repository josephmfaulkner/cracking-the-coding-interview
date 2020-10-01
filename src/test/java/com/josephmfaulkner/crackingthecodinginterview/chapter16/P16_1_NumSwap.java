package com.josephmfaulkner.crackingthecodinginterview.chapter16;

import static org.junit.Assert.*;

import org.junit.Test;

public class P16_1_NumSwap {

	@Test
	public void swapSameNumbers() {
		
		int num1 = 10;
		int num2 = 10;
		
		P16_1_SwapNumbers.NumHolder numbers = new P16_1_SwapNumbers.NumHolder();
		numbers.num1 = num1;
		numbers.num2 = num2;
		
		P16_1_SwapNumbers.swap(numbers);
		
		assertEquals(num1, numbers.num2);
		assertEquals(num2, numbers.num1);
	
	}
	
	@Test
	public void swapSameNegNumbers() {
		
		int num1 = 10;
		int num2 = -10;
		
		P16_1_SwapNumbers.NumHolder numbers = new P16_1_SwapNumbers.NumHolder();
		numbers.num1 = num1;
		numbers.num2 = num2;
		
		P16_1_SwapNumbers.swap(numbers);
		
		assertEquals(num1, numbers.num2);
		assertEquals(num2, numbers.num1);
	
	}
	
	@Test
	public void swapDifferentNumbers() {
		
		int num1 = 100;
		int num2 = 42;
		
		P16_1_SwapNumbers.NumHolder numbers = new P16_1_SwapNumbers.NumHolder();
		numbers.num1 = num1;
		numbers.num2 = num2;
		
		P16_1_SwapNumbers.swap(numbers);
		
		assertEquals(num1, numbers.num2);
		assertEquals(num2, numbers.num1);
	
	}
	
}
