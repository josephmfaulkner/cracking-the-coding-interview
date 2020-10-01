package com.josephmfaulkner.crackingthecodinginterview.chapter16;

public class P16_1_SwapNumbers {
	public static class NumHolder {
		public int num1;
		public int num2;
	}
	
	public static void swap(NumHolder numbers)
	{
		numbers.num1 += numbers.num2;
		
		numbers.num2 = numbers.num1 - numbers.num2;
		numbers.num1 = numbers.num1 - numbers.num2;
	}
}
