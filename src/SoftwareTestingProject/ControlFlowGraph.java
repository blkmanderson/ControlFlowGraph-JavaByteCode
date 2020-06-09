package SoftwareTestingProject;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ControlFlowGraph {
	
	Set<Node> nodes; // Set of nodes
	
	Map<Node, Set<Node>> edges; // Adjacency set
	
	static class Node {
		String clazz;
		String method;
		int id;
		
		public Node(String clazz, String method, int id) {
			this.clazz = clazz;
			this.method = method;
			this.id = id;
		}
		
		public String toString() {
			return clazz + "." + method + ": " + id;
		}
		
		public boolean equals(Object o) {
	        if(o == this) {
	            return true;
	        }

	        if(o == null) {
	            return false;
	        }
	        
			if(o.getClass() != this.getClass()) {
				return false;
			} 
			
			Node node = (Node) o;
			
			if(node.clazz == this.clazz && node.method == this.method && node.id == this.id) {
				return true;
			} else {
				return false;
			}
			
		}
		
		public int hashCode() {
			return Objects.hash(this.clazz, this.method, this.id);
		}
	}
	
	public String toString () { // for ControlFlowGraph
		return "# nodes = " + nodes.size() + "\nnodes = " + nodes + "\nedges = " + edges ;
	}
	
	public ControlFlowGraph() {
		nodes = new HashSet < Node >();
		edges = new HashMap < Node , Set < Node > >();
	}
	
	public void addNode(String clazz, String method, int id) {
		Node node = new Node(clazz, method, id);
		
		if(nodes.add(node)) {
			Set<Node> set = Collections.emptySet();
			edges.put(node, set);
		}
	}
	
	public void addEdge(String clazz1, String method1, int id1, String clazz2, String method2, int id2) {
		
		Node node1 = new Node(clazz1, method1, id1);
		Node node2 = new Node(clazz2, method2, id2);
		
		addNode(clazz1, method1, id1);
		addNode(clazz2, method2, id2);
		
		Set<Node> set = new HashSet<>(Collections.emptySet());
		set.addAll(edges.get(node1));
		
		if(set.add(node2)) {
			edges.put(node1, set);
		}
	}
	
	public void addEdge(String clazz, String method, int id1, int id2) {
		Node node1 = new Node(clazz, method, id1);
		Node node2 = new Node(clazz, method, id2);
		
		Set<Node> set = new HashSet<>(Collections.emptySet());
		set.addAll(edges.get(node1));
		
		if(set.add(node2)) {
			edges.put(node1, set);
		}
	}
	
	private boolean addToVisited(Node node1, Node node2, Set<Node> set) {
		
		Set<Node> edge = edges.get(node1);
		
		if(edge.contains(node2)) {
			return true;
		} 
		
		set.add(node1);
		
		return false;
	}
	
	public boolean reachable(String c1 , String m1 , int id1 , String c2 , String m2 , int id2) {
		Node node1 = new Node(c1, m1, id1);
		Node node2 = new Node(c2, m2, id2);
		
		if(node1.equals(node2)) {
			return true;
		}
		
		Set<Node> set = new HashSet<>(Collections.emptySet());
		
		for(Node node : nodes) {
			if(set.contains(node) == false) {
				if(addToVisited(node1, node2, set)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean allNodesReachable(String c, String m, int id) {
		
		Iterator < Node > it = nodes . iterator ();
			while ( it . hasNext ()) {
				Node n = it . next ();
				if (!reachable(c , m , id , c , m , n . id)) {
					return false ;
				}
			}
			return true ;
		} 
}
