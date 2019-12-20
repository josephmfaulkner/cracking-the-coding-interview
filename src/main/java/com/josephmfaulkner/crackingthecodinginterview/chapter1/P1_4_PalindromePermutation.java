package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.util.Map;

public class P1_4_PalindromePermutation {

	private static boolean palindromePermutation(Map<Character,Integer> charCount) {
		
		int oddCharCount = 0;
		
		for(char key: charCount.keySet()) {
			int  count = charCount.get(key);
			
			if ( count % 2 != 0 ) {
				oddCharCount ++;
			}
			
		}
		
		if(oddCharCount > 1) {
			return false;
		}
		
		return true;
	}
	
	public static boolean palindromePermutation(String testString) {
		
		Map<Character,Integer> charCount = StringUtils.makeCharacterCountMap(testString);
		
		boolean result = palindromePermutation(charCount);
		
		return result;
	}

}
