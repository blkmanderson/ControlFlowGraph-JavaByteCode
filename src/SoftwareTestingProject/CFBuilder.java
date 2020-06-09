package SoftwareTestingProject;

public class CFBuilder {
	public ControlFlowGraph build() {
		
		ControlFlowGraph controlFlowGraph = new ControlFlowGraph();
		
		controlFlowGraph.addNode("BinarySearch", "binSearch", 1);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 2);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 3);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 4);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 5);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 6);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 7);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 8);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 9);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 10);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 11);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 12);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 13);
		controlFlowGraph.addNode("BinarySearch", "binSearch", 14);
		
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 1, 2);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 2, 3);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 3, 4);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 4, 5);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 5, 6);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 6, 7);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 6, 8);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 8, 9);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 9, 11);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 9, 10);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 11, 12);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 12, 13);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 10, 13);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 13, 14);
		controlFlowGraph.addEdge("BinarySearch", "binSearch", 14, 4);
		
		return controlFlowGraph;
	}
}
