package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		
		dlist.addNodeByPos(10,1);
		dlist.addNodeByPos(20,2);
		dlist.addNodeByPos(30,3);
		dlist.addNodeByPos(40,4);
		dlist.addNodeByPos(50,5);
		dlist.displayAll();
		dlist.deleteNodeByPos(3);
		

	}

}
