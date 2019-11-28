package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class StringCharsUnique {
	
	private static Map<Character, Integer> makeCharacterCountMap(String inputString) {
	    Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		
	    for(int i = 0; i < inputString.length(); i++) {
			
			char c = inputString.charAt(i);
			Integer charCount = characterMap.get(c);
			
			if(charCount == null)
			{
				charCount = 0; 
			}
			charCount++;
			
			characterMap.put(c, charCount);
			
		}
	    
	    return characterMap;
	
	}
	
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
		
		Map<Character, Integer> charMap = makeCharacterCountMap(inputString);
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
