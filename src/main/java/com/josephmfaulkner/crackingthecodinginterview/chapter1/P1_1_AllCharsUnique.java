package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class P1_1_AllCharsUnique {

	private static boolean allUniqueCharactersMap(Map<Character, Integer> characters) {		
		for(Character c: characters.keySet()) {
			int charCount = characters.get(c);
			if (charCount > 1) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean allUniqueCharacters(String inputString) {
		
		Map<Character, Integer> charMap = StringUtils.makeCharacterCountMap(inputString);
		boolean unique = allUniqueCharactersMap(charMap);
		
		return unique;
		
	}
	
	
	public static boolean allUniqueCharactersSort(char inputString[]) {
		Arrays.sort(inputString);
		
		for(int i = 0; i < inputString.length - 1; i++) {
			char c1 = inputString[i];
			char c2 = inputString[i + 1];
			
			if(c1 == c2) {
				return false;
			}
		}
		
		return true; 
	}
	
	
	
	
	
}
