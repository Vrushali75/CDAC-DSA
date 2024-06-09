package com.demo.queues;

public class ArrayQueue {

	int[] arr;
	int front;
	int rear;
	
	public ArrayQueue(int size) {
		super();
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(front==arr.length-1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
	
	public void enqueue(int val) {
		if(!isFull()) {
			rear++;
			arr[rear]=val;
			if(front==-1)
				front++;
		}
		else{
			System.out.println("Queu is full");
		}
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int n=arr[front];
			front++;
			if(front==arr.length)
				front=-1;
			return n;
		}
		return -1;
	}

	public void display() {
		for(int i:arr)
			System.out.println(" "+i);
		System.out.println("----------------------------");
	}

}
