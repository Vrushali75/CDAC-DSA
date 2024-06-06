package com.demo.graphs;

import java.util.Scanner;

import com.demo.stacks.QueueLinkedList;
import com.demo.stacks.StackLinkedList;

public class AdjacencyList {

	Node[] heads;
	public AdjacencyList(int num){
		heads=new Node[num];
	}
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data=val;
			next=null;
		}
	}
	public void addGraph() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<heads.length;i++) {
			for(int j=0;j<heads.length;j++) {
				System.out.println("Edge: "+i+"---->"+j+" : ");
				int num=sc.nextInt();
				if(num==1) {
					Node newNode=new Node(j);
					if(heads[i]==null) {
						heads[i]=newNode;
					}
					else{
						newNode.next=heads[i];
						heads[i]=newNode;
					}
				}
				
			}
		}
	}
	public void displayGraph() {
		for(int i=0;i<heads.length;i++) {
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.println("null");
		}
	}
	
	public void dfsTraversal(int val) {
		StackLinkedList<Integer> mystack=new StackLinkedList<Integer>();
		mystack.push(val);
		int[] mydfs=new int[heads.length];
		int cnt=0;
		boolean[] visited=new boolean[heads.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		while(!mystack.isEmpty()) {
			int d=mystack.pop();
			if(!visited[d]) {
				visited[d]=true;
				mydfs[cnt]=d;
				cnt++;
				for(Node temp=heads[d];temp!=null;temp=temp.next) {
					if(!visited[temp.data]) {
						mystack.push(temp.data);
					}
				}
			}
		}
		
		for(int num: mydfs) {
			System.out.print("\t"+num);
		}	
	}
	
	public void bfsTraversal(int val) {
		QueueLinkedList que=new QueueLinkedList();
		que.enqueue(val);
		int[] mybfs=new int[heads.length];
		int cnt=0;
		boolean[] visited=new boolean[heads.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		while(!que.isEmpty()) {
			int d=que.dequeue();
			if(!visited[d]) {
				visited[d]=true;
				mybfs[cnt]=d;
				cnt++;
				for(Node temp=heads[d];temp!=null;temp=temp.next) {
					if(!visited[temp.data]) {
						que.enqueue(temp.data);
					}
				}
			}
		}
		System.out.println();
		for(int num: mybfs) {
			System.out.print("\t"+num);
		}
		
		
	}
}
