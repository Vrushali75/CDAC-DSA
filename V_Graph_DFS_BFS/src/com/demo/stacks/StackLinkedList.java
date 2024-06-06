package com.demo.stacks;

public class StackLinkedList<T> {
	Node top=null;
	class Node{
		T data;
		Node next;
		
		public Node(T val) {
			data=val;
			next=null;
		}
	}
	
	public void push(T val) {
		Node newNode=new Node(val);
		if(top==null) {
			top=newNode;
			System.out.println("Pushed "+val);
		}
		else {
			newNode.next=top;
			top=newNode;
			System.out.println("Pushed "+val);
		}
	}
	
	public T pop() {
		if(!isEmpty()) {
			T n=top.data;
			Node temp=top;
			top=top.next;
			temp.next=null;
			temp=null;
			return n;
		}
		else {
			System.out.println("Stack is empty");
			return null;
		}
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void display() {
		for(Node temp=top;temp!=null;temp=temp.next) {
			System.out.println(temp.data+" ");
		}
		System.out.println("------------------------------------");
	}
}
