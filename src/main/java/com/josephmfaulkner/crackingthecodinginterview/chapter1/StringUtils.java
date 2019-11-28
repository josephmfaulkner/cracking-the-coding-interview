package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {
	public static Map<Character, Integer> makeCharacterCountMap(String inputString) {
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
}
