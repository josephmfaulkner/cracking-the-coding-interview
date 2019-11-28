package com.josephmfaulkner.crackingthecodinginterview.chapter1;

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
		Iterator<Character> mapItor = characters.keySet().iterator();
		
		while(mapItor.hasNext()) {
			Character c = mapItor.next();
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
}
