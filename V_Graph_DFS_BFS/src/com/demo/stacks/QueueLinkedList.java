package com.demo.stacks;

public class QueueLinkedList {
	Node front=null;
	Node rear=null;
	
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public boolean isEmpty() {
		if(front==null) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	
	public void enqueue(int val) {
		Node newNode=new Node(val);
		
		if(isEmpty()) {
			rear=newNode;
			front=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println("Added Successfully!");
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int n=front.data;
			if(rear==front) {
				rear=null;
				front=null;
			}
			else {
				Node temp=front;
				front=front.next;
				temp.next=null;
				temp=null;
			}
			return n;
		}
		else {
			System.out.println("Queue is Empty");
			return -1;
		}
	}
	
	public void display() {
		for(Node temp=front;temp!=null;temp=temp.next) {
			System.out.println(temp.data+" ");
		}
	}
	
	
}
