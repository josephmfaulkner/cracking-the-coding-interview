package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.util.Map;

public class StringCharsPermutation {
	
	private static boolean sameCharacters(Map<Character, Integer> map1, Map<Character, Integer> map2) {
		
		if ( map1.keySet().size() != map2.keySet().size()) {
			return false;
		}
		
		for(Character c: map1.keySet()) {
			int count1 = map1.get(c);
			int count2 = map2.get(c);
			
			if(count1 != count2) {
				return false;
			}
		}
		
		
		return true; 
	}
	
	public static boolean arePermutation(String inputString1, String inputString2) {
		Map<Character, Integer> charMap1 =  StringUtils.makeCharacterCountMap(inputString1);
		Map<Character, Integer> charMap2 =  StringUtils.makeCharacterCountMap(inputString2);
		
		return sameCharacters(charMap1, charMap2);
	}
}
