package com.demo.hashing;

import org.w3c.dom.Node;

public class HashTable {

	Node[] heads;
	public HashTable(int size) {
		heads=new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	class Node{
		Node next;
		int data;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
		
	public void insertData(int num) {
		Node newNode=new Node(num);
		int pos=num%heads.length;
		if(heads[pos]==null) {
			heads[pos]=newNode;
		}
		else {
			newNode.next=heads[pos];
			heads[pos]=newNode;
		}
		
	}

	public void displayData() {
		for(int i=0;i<heads.length;i++) {
			System.out.println(i+"----------");
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
		}
		
	}

	public boolean searchData(int num) {
		int pos=num%heads.length;
		if(heads[pos]==null) {
			System.out.println("Bucket is empty");
			return false;
		}
		else {
			for(Node temp=heads[pos];temp!=null;temp=temp.next) {
				if(temp.data==num) {
					System.out.println("Number found: "+num);
					return true;
				}
			}
			System.out.println("Number not found");
			return false;
		}
	}

}
