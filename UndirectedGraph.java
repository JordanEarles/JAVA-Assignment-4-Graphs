package graph;

import java.util.*;

import graph.DirectedGraph.Node;

public class UndirectedGraph {
	public class Node {
		private String name;
		private int id;
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getId(int id) {
			this.id = id;
			return id;
		}
		
		public String getName(String name) {
			this.name = name;
			return name;
			}
	}

	private HashMap<Node, ArrayList<Node>> graph = new HashMap<Node, ArrayList<Node>>();
    private ArrayList<Node> parent = new ArrayList<>();

	
	public void addNode(Node n) {
		if (graph.containsKey(n)) {
			System.out.println("The node is already in the graph");
		}
		else {
			graph.put(n, new ArrayList<Node>());
		}
	}
	
	public void addNeighbour(Node p, Node n) {
		if(graph.containsKey(p)) {
			ArrayList<Node> l = graph.get(p);
			graph.put(n, l);
			ArrayList<Node> k = graph.get(n);
			graph.put(p, k);
			}
		else {
			System.out.println("The parent node does not exist");
		}
	}
	
	public void addNeighbourList(Node p,  ArrayList<Node> neighbourList) {
		if(graph.containsKey(p)) {
		for(int i=0; i < neighbourList.size(); i++) { 
			addNeighbour(p, neighbourList.get(i));
		}
		}
		else {
			System.out.println("The parent node does not exist");
		}

	}
	
	public Node getNeighboursOfNode(Node n) {
		if(graph.containsKey(n)) {
			graph.get(n);
		}
		else {
			System.out.println("The Node doesn't exist in the graph");
		}
		return null;
	}
	
	public void deleteNode(Node p, Node n) {
		if(graph.containsKey(p)) {
			graph.get(p);
			graph.remove(n);
			graph.get(n);
			graph.remove(p);
		}
		else {
			System.out.println("That node doesn't exist in the graph");
		}
	} 
}
