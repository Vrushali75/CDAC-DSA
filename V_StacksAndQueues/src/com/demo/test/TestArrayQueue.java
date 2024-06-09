package com.demo.test;

import com.demo.queues.ArrayQueue;

public class TestArrayQueue {

	public static void main(String[] args) {
		ArrayQueue arr=new ArrayQueue(5);
		arr.enqueue(10);
		arr.enqueue(20);
		arr.enqueue(30);
		arr.enqueue(40);
		
		arr.display();
		while(!arr.isEmpty()) {
			System.out.println(arr.dequeue());
		}
	}

}
