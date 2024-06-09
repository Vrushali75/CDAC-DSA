package com.demo.test;

import com.demo.queues.CircularQueueArray;

public class TestCircularQueueArray {

	public static void main(String[] args) {
		CircularQueueArray que=new CircularQueueArray(5);
		System.out.println("List for enqueuing is: ");
		que.enqueue(100);
		que.enqueue(200);
		que.enqueue(300);
		que.enqueue(400);
		que.enqueue(500);
		
		
		que.display();
		System.out.println("List after dequeuing is: ");
		while(!que.isEmpty()) {
			System.out.println(que.dequeue());
		}

	}

}
