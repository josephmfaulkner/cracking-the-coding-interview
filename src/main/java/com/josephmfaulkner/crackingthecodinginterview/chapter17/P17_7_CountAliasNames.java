package com.josephmfaulkner.crackingthecodinginterview.chapter17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class P17_7_CountAliasNames {
	
	private class NameEntry {
		public String name; 
		public int count;
		
		public NameEntry(String name)
		{
			this.name = name; 
			this.count = 0; 
		}
	}
	
	private class NameGraphNode {
		public String name; 
		List<NameGraphNode> aliasEdges;
		
		NameEntry nameEntry; 
		
		public NameGraphNode(String name)
		{
			this.name = name;
			this.aliasEdges = new Vector<NameGraphNode>();
			this.nameEntry = null;
		}
		
		public void addAlias(NameGraphNode edge)
		{
			this.aliasEdges.add(edge);
		}
		
	}
	
	private List<NameEntry> nameEntries;
	private Map<String, NameGraphNode> nameAliasLookup;
	
	public P17_7_CountAliasNames()
	{
		this.nameEntries = new Vector<NameEntry>();
		this.nameAliasLookup = new HashMap<String, NameGraphNode>();
	}
	
	public String printNames()
	{
		StringBuilder nameStringBuilder = new StringBuilder();
		for(NameEntry entry : this.nameEntries)
		{
			nameStringBuilder.append(entry.name + ": " + entry.count + ";");
		}
		
		return nameStringBuilder.toString();
	}
	
	public String countNames(String[][] aliases, String counts[][])
	{
		this.readAliases(aliases);
		this.readCount(counts);
		return this.printNames();
	}
	
	private void readAliases(String[][] namesList)
	{
		for(String[] names : namesList)
		{
			String name1 = names[0];
			String name2 = names[1];
			
			addAlias(name1, name2);
		}
		
		processAliases();
	}
	
	private void readCount(String[][] nameCounts)
	{
		for(String[] nameCount : nameCounts)
		{
			String name = nameCount[0];
			int count = Integer.parseInt(nameCount[1]);
			
			countAlias(name, count);
		}
		
		processAliases();
	}
	
	
	private void addAlias(String name1, String name2)
	{
		NameGraphNode name1Node;
		NameGraphNode name2Node;
		
		if(this.nameAliasLookup.containsKey(name1))
		{
			name1Node = this.nameAliasLookup.get(name1);
		}
		else
		{
			name1Node = new NameGraphNode(name1);
			this.nameAliasLookup.put(name1, name1Node);
		}
		
		if(this.nameAliasLookup.containsKey(name2))
		{
			name2Node = this.nameAliasLookup.get(name2);
		}
		else
		{
			name2Node = new NameGraphNode(name2);
			this.nameAliasLookup.put(name2, name2Node);
		}
		
		name1Node.addAlias(name2Node);
		name2Node.addAlias(name1Node);
		
	}
	
	private void addNoAliasSingleton(String name, int count)
	{
		NameGraphNode nameNode = new NameGraphNode(name);
		NameEntry entry = new NameEntry(name);
		entry.count = count;
		nameNode.nameEntry = entry;
		
		this.nameAliasLookup.put(name, nameNode);
		this.nameEntries.add(entry);
	}
	

	
	private void processAliases()
	{
		for(String alias : this.nameAliasLookup.keySet())
		{
			NameGraphNode nameNode = this.nameAliasLookup.get(alias);
			visitNameNode(nameNode, null);
		}
	}
	
	private void countAlias(String name, int count)
	{
		if(this.nameAliasLookup.containsKey(name))
		{
			NameGraphNode nameNode = this.nameAliasLookup.get(name);
			nameNode.nameEntry.count += count;
		}
		else
		{
			this.addNoAliasSingleton(name, count);
		}
	}
	
	private void visitNameNode(NameGraphNode node, NameEntry entry)
	{
		if(node == null)
		{
			return;
		}
		
		if(node.nameEntry != null)
		{
			return;
		}
		
		if(entry == null)
		{
			entry = new NameEntry(node.name);
			this.nameEntries.add(entry);
		}
		
		node.nameEntry = entry;
		
		for(NameGraphNode alias: node.aliasEdges)
		{
			visitNameNode(alias, entry);
		}
	}

	
}
