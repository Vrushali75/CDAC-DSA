package com.demo.graphs;

import java.util.Scanner;

public class AdjacencyList {

	Node[] heads;
	
	public AdjacencyList(int num) {
		heads=new Node[num];
	}
	class Node{
		int data;
		Node next;
		
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public void addGraph() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<heads.length;i++) {
			for(int j=0;j<heads.length;j++) {
				System.out.println("Edge: "+i+"----> "+j+": ");
				int num=sc.nextInt();
				if(num==1) {
					Node newNode=new Node(j);
					if(heads[i]==null) {
						heads[i]=newNode;
					}
					else {
						newNode.next=heads[i];
						heads[i]=newNode;
					}
				}
			}
		}
	}

	//Displaying the graph by adjacency list

	public void displayGraph() {
		for(int i=0;i<heads.length;i++) {
			System.out.println("Node: "+i+": ");
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.println(temp.data+"---->");
			}
			System.out.println("Null");
		}
	}
	
	

}
