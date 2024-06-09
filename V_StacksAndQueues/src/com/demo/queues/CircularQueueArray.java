package com.demo.queues;

public class CircularQueueArray {

	int[] arr;
	int front,rear;
	public CircularQueueArray(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		if(front==0 && rear==arr.length-1) {
			System.out.println("Queue is full");
			return true;
		}
		if(front==rear+1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	
	
	public boolean enqueue(int val) {
		if(!isFull()) {
			if(front==-1)
				front=0;
			rear=(rear+1)%arr.length;
			arr[rear]=val;
			return true;
		}
		return false;
	}

	public void display() {
		int i=front;
		for(;i!=rear;i=(i+1)%arr.length) {
			System.out.println(" "+arr[i]);
		}
		System.out.println(" "+arr[i]);
		System.out.println("---------------------------");
	}

	public int dequeue() {
		if(!isEmpty())
		{
			int n=arr[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else{
				front=(front+1)%arr.length;
			}
			return n;
		}
		return -1;
	}

}
