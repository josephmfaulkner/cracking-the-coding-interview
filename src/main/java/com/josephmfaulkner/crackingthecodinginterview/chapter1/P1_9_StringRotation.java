package com.josephmfaulkner.crackingthecodinginterview.chapter1;

public class P1_9_StringRotation {

	public static boolean isRotation(String string, String rotatedString) {
		
		String checkString = rotatedString + rotatedString;
		
		return checkString.contains(string);
		
	}
	
}
