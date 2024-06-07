package com.demo.graphs;

import java.util.Scanner;

public class AdjacencyMatrix {

	int[][] graph;
	public AdjacencyMatrix(int num) {
		graph=new int[num][num]; 
	}
	
	//Function for adding the graph elements
	public void addGraph() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++) {
				System.out.println("Edge: "+i+"-----> "+j+": ");
				graph[i][j]=sc.nextInt();
			}
		}
	}
    	
	//Function for displaying the graph elements
	public void displayGraph() {
		System.out.println("Graph is: ");
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[0].length;j++) 
			{
				System.out.print(" "+graph[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
