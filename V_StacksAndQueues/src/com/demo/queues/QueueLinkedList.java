package com.demo.queues;

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
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println("Added successfully");
	}

	public void display() {
		Node temp=front;
		for(;temp!=null;temp=temp.next) {
			System.out.println(" "+temp.data);
		}
		System.out.println("------------------------");
		
	}

	public int dequeue() {
		if(!isEmpty()) {
			int n=front.data;
			if(rear==front) {
				front=null;
				rear=null;
			}
			else {
				Node temp=front;
				front=front.next;
				temp.next=null;
				temp=null;
			}
			return n;
		}
		System.out.println("Queue is dequeued");
		return -1;
	}
}
