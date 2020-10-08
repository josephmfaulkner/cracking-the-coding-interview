package com.josephmfaulkner.crackingthecodinginterview.chapter17;

import static org.junit.Assert.*;
import org.junit.Test;

public class P17_7_CountAliasNamesTest {

	@Test
	public void countAlias1Name() {
		String aliases[][] = {
				{"John","Jon"},
				{"Jon", "Jonny"},
				{"Jonathan", "Jonny"}
		};
		String counts[][]  = {
				{"Jon", "10"},
				{"Jonathan", "10"},
				{"John", "5"}
		};
		String expectedCountResult = "Jonny: 25;";
		String actualCountResult = new P17_7_CountAliasNames().countNames(aliases, counts);
		
		assertEquals(expectedCountResult, actualCountResult);
		
	}
	
	@Test
	public void countAlias3Names() {
		String aliases[][] = {
				{"John","Jon"},
				{"Jon", "Jonny"},
				{"Jonathan", "Jonny"},
				
				{"Liz","Elizabeth"},
				{"Lizzy", "Liz"},
				{"Lizzo", "Liz"},
				
				{"Tom","Thomas"},
				{"Tommy", "Thomas"}
		};
		String counts[][]  = {
				{"Jon", "10"},
				{"Jonathan", "10"},
				{"John", "5"},
				
				{"Tom", "10"},
				{"Tommy", "3"},
				
				{"Elizabeth", "10"}	
		};
		String expectedCountResult = "Thomas: 13;Jonny: 25;Lizzo: 10;";
		String actualCountResult = new P17_7_CountAliasNames().countNames(aliases, counts);
		
		assertEquals(expectedCountResult, actualCountResult);
		
	}
	
	@Test
	public void countAlias5Names2NoAlias() {
		String aliases[][] = {
				{"John","Jon"},
				{"Jon", "Jonny"},
				{"Jonathan", "Jonny"},
				
				{"Liz","Elizabeth"},
				{"Lizzy", "Liz"},
				{"Lizzo", "Liz"},
				
				{"Tom","Thomas"},
				{"Tommy", "Thomas"}
		};
		String counts[][]  = {
				{"Jon", "10"},
				{"Jonathan", "10"},
				{"John", "5"},
				
				{"Tom", "10"},
				{"Tommy", "3"},
				
				{"Elizabeth", "10"},
				
				{"Joseph", "10"},
				{"Joseph", "10"},
				
				{"Jeremy", "5"}		
		};
		String expectedCountResult = "Thomas: 13;Jonny: 25;Lizzo: 10;Joseph: 20;Jeremy: 5;";
		String actualCountResult = new P17_7_CountAliasNames().countNames(aliases, counts);
		
		assertEquals(expectedCountResult, actualCountResult);
		
	}
	
	@Test
	public void countAlias5NamesNoAlias() {
		String aliases[][] = {

		};
		String counts[][]  = {
				{"Jon", "10"},
				{"Jonathan", "10"},
				{"John", "5"},
				
				{"Tom", "10"},
				{"Tommy", "3"},
				
				{"Elizabeth", "10"},
				
				{"Joseph", "10"},
				{"Joseph", "10"},
				
				{"Jeremy", "5"}	
		};
		
		String expectedCountResult = "Jon: 10;Jonathan: 10;John: 5;Tom: 10;Tommy: 3;Elizabeth: 10;Joseph: 20;Jeremy: 5;";
		String actualCountResult = new P17_7_CountAliasNames().countNames(aliases, counts);
				
		assertEquals(expectedCountResult, actualCountResult);
		
	}

}