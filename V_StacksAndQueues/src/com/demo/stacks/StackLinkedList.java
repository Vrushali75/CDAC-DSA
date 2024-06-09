package com.demo.stacks;

public class StackLinkedList<T>{
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
			System.out.println("Pushed");
		}
		else {
			newNode.next=top;
			top=newNode;
			System.out.println("Pushed");
		}
	}

	public void display() {
		if(top==null)
			System.out.println("Stack is empty");
		else {
			for(Node temp=top;temp!=null;temp=temp.next) {
				System.out.println(" "+temp.data);
			}
			System.out.println("------------------------------");
		}
		
	}

	public T pop() {
		if(!isEmpty()) {
			T n=top.data;
			Node temp=top;
			top=top.next;
			temp.next=null;
			temp=null;
			System.out.println("popped");
			return n;
		}
		else {
			System.out.println("Stack is empty");
			return null;
		}
		
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
}
