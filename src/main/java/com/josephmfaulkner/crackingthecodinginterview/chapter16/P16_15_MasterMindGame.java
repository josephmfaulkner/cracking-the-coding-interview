package com.josephmfaulkner.crackingthecodinginterview.chapter16;

public class P16_15_MasterMindGame {

	
	public static String getHits(String testMatch, String testGuess) {
		assert(isValidString(testMatch) && isValidString(testGuess));
		
		int colorCount[] = {0,0,0,0};
		
		int hitCount  =        getHitCount(testMatch, testGuess, colorCount);
		int pHitCount = getPartialHitCount(testMatch, testGuess, colorCount);
		
		
		return hitCount + "-" + pHitCount;
	}
	
	private static final char RED    = 'R';
	private static final char GREEN  = 'G';
	private static final char BLUE   = 'B';
	private static final char YELLOW = 'Y';
	

	private static int colorIndex(char color)
	{
		switch(color)
		{
			case RED:
				return 0;
			case GREEN: 
				return 1; 
			case BLUE: 
				return 2; 
			case YELLOW: 
				return 3;
			default: 
				throw new RuntimeException("Invalid character: " + color);
		}
		
	}
	
	
	private static boolean isValidCharacter(char c)
	{
		return (c == RED || c == GREEN || c == BLUE || c == YELLOW );
	}
	
	private static boolean isValidString(String string)
	{
		if(string.length() != 4)
		{
			return false;
		}
		for(char c : string.toCharArray())
		{
			if(!(isValidCharacter(c)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static int getHitCount(String testMatch, String testGuess, int[] colorCount) {
		int hitCount = 0; 
		
		for(int i = 0; i < testMatch.length(); i++)
		{
			if(testMatch.charAt(i) == testGuess.charAt(i))
			{
				hitCount++;
			}
			else
			{
				addToColorCount(colorCount, testMatch.charAt(i));
			}
			
		}
		
		return hitCount;
	}
	
	
	private static void addToColorCount(int[] colorCount, char color) {
		
		colorCount[colorIndex(color)]++;
	
	}


	private static int getPartialHitCount(String testMatch, String testGuess, int[] colorCount) {
		int partialHitCount = 0; 
		
		for(int i = 0; i < testMatch.length(); i++)
		{
			if(testMatch.charAt(i) != testGuess.charAt(i))
			{
				partialHitCount+= getPartialHitIfAny(colorCount, testGuess.charAt(i));
			}		
		}
		
		return partialHitCount;
	}


	private static int getPartialHitIfAny(int[] colorCount, char color) {
		int returnPartialHit = 0;
		
		if(colorCount[colorIndex(color)] > 0)
		{
			colorCount[colorIndex(color)]--;
			returnPartialHit = 1;
		}
		
		return returnPartialHit;
	}
	

}
