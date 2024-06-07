package com.demo.test;

import java.util.Scanner;

import com.demo.linkedlist.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedlist=new LinkedList();
		
		//adding new nodes
		linkedlist.addNode(50);
		linkedlist.addNode(60);
		linkedlist.addNode(80);
		linkedlist.addNode(70);
		linkedlist.addNode(13);
		linkedlist.addNode(3);
		linkedlist.addNode(72);
		linkedlist.addNode(56);
		linkedlist.displayLinkedList();
		
		//Adding new node at the mentioned condition
		linkedlist.addNodeByPosition(100,3);
		linkedlist.displayLinkedList();
		
		//Deleting node at the given position
		System.out.println("Enter position of node to be deleted: ");
	
		linkedlist.deleteNode(3);
		linkedlist.displayLinkedList();
		linkedlist.deleteByValue(60);
		linkedlist.displayLinkedList();
		linkedlist.displayEvenLinkedList();

	}
}
