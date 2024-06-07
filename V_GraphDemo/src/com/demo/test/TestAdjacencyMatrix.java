package com.demo.test;

import com.demo.graphs.AdjacencyMatrix;

public class TestAdjacencyMatrix {

	public static void main(String[] args) {
		AdjacencyMatrix adm=new AdjacencyMatrix(5);
		adm.addGraph();
		adm.displayGraph();

	}

}
