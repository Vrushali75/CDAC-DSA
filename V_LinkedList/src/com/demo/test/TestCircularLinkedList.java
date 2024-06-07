package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		CircularLinkedList cir=new CircularLinkedList();
		cir.addByPos(100,1);
		cir.addByPos(200,2);
		cir.addByPos(300,3);
		cir.addByPos(400,4);
		cir.addByPos(500,5);
		cir.addByPos(600,6);
		
		cir.display();
		
		//delete by position
		cir.delByPos(2);
		cir.delByPos(5);
		cir.display();

		
	}

}
