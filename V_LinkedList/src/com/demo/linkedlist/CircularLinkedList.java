package com.demo.linkedlist;

public class CircularLinkedList {

	Node head=null;
	Node last=null;
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public void addByPos(int val, int pos) {
		Node newNode=new Node(val);
		if(head==null) {
			System.out.println("List is empty");
			head=newNode;
			last=newNode;
			newNode.next=head;
		}
		else {
			if(pos==1) {
				newNode.next=head;
				head=newNode;
				last.next=newNode;
			}
			else{
				Node temp=head;
				for(int i=0;temp!=last && i<pos-2;i++) {
					temp=temp.next;
				}
				newNode.next=temp.next;
				temp.next=newNode;
				if(temp==last)
					last=newNode;
			}
		}
		
	}

	public void display() {
		Node temp=head;
		for(;temp!=last;temp=temp.next)
		{
			System.out.println(" "+temp.data);
		}
		System.out.println("----------------------------");
		
	}

	public void delByPos(int pos) {
		if(head==null)
			System.out.println("List is empty");
		else
		{
			if(pos==1) {
				//if only one node is present
				if(head==last) {
					head=null;
					last=null;
				}
				//if more than one node is present
				else {
					last.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
					temp=null;
				}
			}
			//if you want to delete in between
			else {
				Node temp=head;
				Node prev=null;
				
				for(int i=0;temp!=last && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				prev.next=temp.next;
				if(temp==last)
					last=prev;
				temp.next=null;
				temp=null;
			}
			System.out.println("Nodes after deletion are: ");
		}
		
	}

}
