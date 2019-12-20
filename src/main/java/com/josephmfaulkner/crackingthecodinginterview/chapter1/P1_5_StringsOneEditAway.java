package com.josephmfaulkner.crackingthecodinginterview.chapter1;

import java.lang.Math;

public class P1_5_StringsOneEditAway {

	public static boolean areOneEditAway(String testString1, String testString2) {
		
		int i1 = 0; 
		int i2 = 0; 
		
		int editsMade = 0;
		
		int s1Length = testString1.length();
		int s2Length = testString2.length();
		
		int lengthDiff = s2Length - s1Length;
		
		if( Math.abs(lengthDiff) > 1) {
			return false;
		}
		
		while( i1 < s1Length && i2 < s2Length )
		{
			if( testString1.charAt(i1) == testString2.charAt(i2) ) {
				i1++; 
				i2++;
			}
			else {
				
				if(editsMade > 0) {
					return false;
				}
				
				if(s1Length < s2Length) {
					i2++;
				}
				else if(s1Length > s2Length) {
					i1++;
				}
				else {
					i1++; 
					i2++;
				}

				editsMade++;
			}
		}
	
		return true;
	}

}
