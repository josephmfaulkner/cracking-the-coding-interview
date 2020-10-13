package com.josephmfaulkner.crackingthecodinginterview.chapter4;

import java.util.List;
import java.util.Vector;

public class GraphNode<DATA_TYPE> {
	private DATA_TYPE data;
	private List<GraphNode> edges;
	private boolean visited;
	
	public GraphNode(DATA_TYPE data){
		this.data = data;
		this.visited = false;
		this.edges = new Vector<GraphNode>();
	}
	
	public void addEdge(GraphNode node) {
		this.edges.add(node);
	}
	
	public List<GraphNode> getEdges(){
		return this.edges;
	}
	
	public void markVisited()
	{
		this.visited = true;
	}
	
	public boolean isVisited()
	{
		return this.visited;
	}
}
