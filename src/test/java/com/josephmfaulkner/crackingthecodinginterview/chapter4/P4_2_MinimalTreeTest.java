package com.josephmfaulkner.crackingthecodinginterview.chapter4;
import static org.junit.Assert.*;
import org.junit.Test;

public class P4_2_MinimalTreeTest {

	@Test
	public void minimalTree1Nodes() {
		
		int[] numbers = {1};
		TreeNode<Integer> minimumTree = P4_2_MinimalTree.getMinimalTree(numbers);

		String expectedTree = "1; ";
		String actualTree   = minimumTree.iOTraverse();
	
		assertEquals(expectedTree, actualTree);
	
	}	
	
	@Test
	public void minimalTree2Nodes() {
		
		int[] numbers = {1, 2};
		TreeNode<Integer> minimumTree = P4_2_MinimalTree.getMinimalTree(numbers);

		String expectedTree = "1; 2; ";
		String actualTree   = minimumTree.iOTraverse();
	
		assertEquals(expectedTree, actualTree);
	
	}	
	
	
	@Test
	public void minimalTree3Nodes() {
		
		int[] numbers = {1, 2, 3};
		TreeNode<Integer> minimumTree = P4_2_MinimalTree.getMinimalTree(numbers);

		String expectedTree = "1; 2; 3; ";
		String actualTree   = minimumTree.iOTraverse();
	
		assertEquals(expectedTree, actualTree);
	
	}
	
	@Test
	public void minimalTree7Nodes() {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		TreeNode<Integer> minimumTree = P4_2_MinimalTree.getMinimalTree(numbers);

		String expectedTree = "1; 2; 3; 4; 5; 6; 7; ";
		String actualTree   = minimumTree.iOTraverse();
	
		assertEquals(expectedTree, actualTree);
	
	}
	
	@Test
	public void minimalTree8Nodes() {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		TreeNode<Integer> minimumTree = P4_2_MinimalTree.getMinimalTree(numbers);

		String expectedTree = "1; 2; 3; 4; 5; 6; 7; 8; ";
		String actualTree   = minimumTree.iOTraverse();
	
		assertEquals(expectedTree, actualTree);
	
	}

}