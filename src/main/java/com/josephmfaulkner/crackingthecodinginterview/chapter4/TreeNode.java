package com.josephmfaulkner.crackingthecodinginterview.chapter4;

public class TreeNode<DATATYPE> {
	private DATATYPE data;
	private TreeNode<DATATYPE> leftNode;
	private TreeNode<DATATYPE> rightNode;
	
	public TreeNode(DATATYPE data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public DATATYPE getData() {
		return this.data;
	}
	
	public TreeNode<DATATYPE> getLeft() {
		return this.leftNode;
	}
	
	public void setLeft(TreeNode<DATATYPE> left) {
		this.leftNode = left;
	}
	
	public TreeNode<DATATYPE> getRight() {
		return this.rightNode;
	}
	
	public void setRight(TreeNode<DATATYPE> right) {
		this.rightNode = right;
	}
	
	private static void iOTraverseRecursive(TreeNode cursor, StringBuilder stringBuilder) {
		if(cursor == null)
		{
			return;
		}
		
		iOTraverseRecursive(cursor.getLeft(), stringBuilder);
		stringBuilder.append(cursor.getData().toString());
		stringBuilder.append("; ");
		iOTraverseRecursive(cursor.getRight(), stringBuilder);
		
	}
	
	public String iOTraverse() {
		StringBuilder stringBuilder = new StringBuilder();
		iOTraverseRecursive(this, stringBuilder);
		return stringBuilder.toString();
	}
	
	
}
