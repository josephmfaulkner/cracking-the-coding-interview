package com.josephmfaulkner.crackingthecodinginterview.chapter16;

public class P16_14_BestLine {
	
	private double epsilon = 0.0001;
	
	public static String makeLineFromPoints(int point1[], int point2[]) {
		assert(point1.length == 2 && point2.length == 2);
		
		int point1X = point1[0]; 
		int point1Y = point1[1];
		
		int point2X = point2[0]; 
		int point2Y = point2[1];
		
		int rise = point2Y - point1Y;
		int run = point2X - point1X;
		
		boolean infiniteSlope = (Math.abs(run) < 1) ? true : false;
		
		int theta = 0;
		
		if(infiniteSlope)
		{
			theta = 90;
		}
		else
		{
			theta = (int) ( Math.atan(rise/run) * (180/Math.PI) );
		}
		
		int xInterCept = 0;
		int yInterCept = 0; 
		
		if(infiniteSlope)
		{
			xInterCept = point2X;
		}
		else
		{
			yInterCept = (int)( point1Y * (rise/run) - point1X );
		}
		
		String lineAsString = "";
		
		lineAsString = theta + "-" + xInterCept + "-" + yInterCept;
		
		return lineAsString;
	}
}
