package com.josephmfaulkner.crackingthecodinginterview.chapter4;
import java.util.Arrays;

public class P4_2_MinimalTree {
	
	
	public static TreeNode<Integer> getMinimalTree(int[] numbers)
	{		
		return getMinimalTreeRec(numbers, 0, numbers.length - 1);
	}
	
	
	
	private static TreeNode<Integer> getMinimalTreeRec(int[] numbers, int start, int end )
	{
		if(end < start)
		{
			return null;
		}
		
		int numberIndex = (start + end) / 2;
		
		int treeNodeNumber = numbers[numberIndex];
		
		TreeNode<Integer> treeNode = new TreeNode<Integer>(treeNodeNumber);
		
		treeNode.setLeft( getMinimalTreeRec(numbers,start, numberIndex - 1 ));
		treeNode.setRight(getMinimalTreeRec(numbers,numberIndex + 1, end));
				
		return treeNode;
	}
}
