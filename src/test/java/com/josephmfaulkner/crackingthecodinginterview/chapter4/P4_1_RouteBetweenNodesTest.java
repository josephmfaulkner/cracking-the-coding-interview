package com.josephmfaulkner.crackingthecodinginterview.chapter4;
import static org.junit.Assert.*;
import org.junit.Test;

public class P4_1_RouteBetweenNodesTest {

	@Test
	public void noPath2Nodes() {
		
		GraphNode<Integer> node1 = new GraphNode<Integer>(1);
		GraphNode<Integer> node2 = new GraphNode<Integer>(2);
		
		boolean expectedIsPath = false;
		boolean actualIsPath   = P4_1_RouteBetweenNodes.isPath(node1, node2);
		
		assertEquals(expectedIsPath, actualIsPath);
	
	}
	
	@Test
	public void isPath2Nodes() {
		
		GraphNode<Integer> node1 = new GraphNode<Integer>(1);
		GraphNode<Integer> node2 = new GraphNode<Integer>(2);
		
		node1.addEdge(node2);
		
		boolean expectedIsPath = true;
		boolean actualIsPath   = P4_1_RouteBetweenNodes.isPath(node1, node2);
		
		assertEquals(expectedIsPath, actualIsPath);
	
	}
	
	@Test
	public void isPath5Nodes() {
		
		GraphNode<Integer> node1 = new GraphNode<Integer>(1);
		GraphNode<Integer> node2 = new GraphNode<Integer>(2);
		GraphNode<Integer> node3 = new GraphNode<Integer>(3);
		GraphNode<Integer> node4 = new GraphNode<Integer>(4);
		GraphNode<Integer> node5 = new GraphNode<Integer>(5);
		
		node1.addEdge(node2);
		node2.addEdge(node3);
		node3.addEdge(node4);
		node4.addEdge(node5);
		
		boolean expectedIsPath = true;
		boolean actualIsPath   = P4_1_RouteBetweenNodes.isPath(node1, node5);
		
		assertEquals(expectedIsPath, actualIsPath);
	
	}
	
	@Test
	public void noPath5Nodes() {
		
		GraphNode<Integer> node1 = new GraphNode<Integer>(1);
		GraphNode<Integer> node2 = new GraphNode<Integer>(2);
		GraphNode<Integer> node3 = new GraphNode<Integer>(3);
		GraphNode<Integer> node4 = new GraphNode<Integer>(4);
		GraphNode<Integer> node5 = new GraphNode<Integer>(5);
		
		node1.addEdge(node2);
		node2.addEdge(node3);
		node3.addEdge(node4);
		node5.addEdge(node4);
		
		boolean expectedIsPath = false;
		boolean actualIsPath   = P4_1_RouteBetweenNodes.isPath(node1, node5);
		
		assertEquals(expectedIsPath, actualIsPath);
	
	}
	
}