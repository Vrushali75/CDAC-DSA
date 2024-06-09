package com.demo.stacks;

public class ArrayStackLinkedList {

	int[] arr;
	int top;
	
	
	
	public ArrayStackLinkedList(int size) {
		super();
		this.arr = new int[size];
		top = -1;
	}
	
	public boolean isFull() {
		if(top==arr.length-1) {
			System.out.println("Stack is full");
		}
		return top==arr.length-1;
	}
	
	public boolean isEmpty() {
		if(top==-1)
			System.out.println("Stack is empty");
		return top==-1;
	}

	public void push(int val) {
		if(!isFull())
		{
			top++;
			arr[top]=val;
		}
		
	}

	public void display() {
		for(int i:arr) {
			System.out.println(" "+i);
		}
		System.out.println("--------------------");
		
	}

	public int pop() {
		if(!isEmpty()) {
			int n=arr[top];
			top--;
			return n;
		}
		return -1;
	}

}
