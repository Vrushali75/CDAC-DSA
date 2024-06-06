package com.demo.test;

import com.demo.graphs.AdjacencyList;

public class TestDFS {

	public static void main(String[] args) {
		AdjacencyList graph=new AdjacencyList(7);
		graph.addGraph();
		graph.displayGraph();
		graph.dfsTraversal(0);
		graph.bfsTraversal(0);

	}

}
