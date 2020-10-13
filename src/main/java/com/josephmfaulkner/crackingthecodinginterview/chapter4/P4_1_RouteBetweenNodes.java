package com.josephmfaulkner.crackingthecodinginterview.chapter4;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class P4_1_RouteBetweenNodes {
	
	private static boolean isPathOneWay(GraphNode nodeA, GraphNode nodeB) {
		Queue<GraphNode> nodeQueue = new LinkedBlockingQueue<GraphNode>();
		GraphNode cursor;
		nodeQueue.add(nodeA);
		
		while(!nodeQueue.isEmpty()) {
			cursor = nodeQueue.poll();
			if(cursor.isVisited())
			{
				continue;
			}
			cursor.markVisited();
			
			if(cursor == nodeB)
			{
				return true;
			}
			
			for(GraphNode edge : (List<GraphNode>) cursor.getEdges())
			{
				nodeQueue.add(edge);
			}
			
		}
		
		
		return false;
	}
	
	public static boolean isPath(GraphNode nodeA, GraphNode nodeB) {
		
		boolean isAtoB = isPathOneWay(nodeA, nodeB);
		boolean isBtoA = isPathOneWay(nodeB, nodeA);
		
		return isAtoB || isBtoA;
		
	}
}
