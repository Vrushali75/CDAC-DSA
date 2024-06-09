package com.demo.test;

import com.demo.queues.QueueLinkedList;

public class TestQueueLinkedList {

	public static void main(String[] args) {
		QueueLinkedList que=new QueueLinkedList();
		
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		
		que.display();
		while(!que.isEmpty()) {
			System.out.println(que.dequeue());
		}
	}

}
