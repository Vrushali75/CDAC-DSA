package com.demo.linkedlist;

public class DoublyLinkedList {
	public Node head=null;
	class Node{
		
		int data;
		Node next;
		Node prev;
		Node(int val)
		{
			data=val;
			next=null;
			prev=null;
		}
	}
	public void addNodeByPos(int val,int pos) {
		Node newNode=new Node(val);
		if(head==null)
		{
			System.out.println("List is Empty");
			head=newNode;
		}
		else
		{
			if(pos==1)
			{
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
			else
			{
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2;i++)
				{
					temp=temp.next;
				}
				if(temp!=null) //adding in between or at end
				{
					newNode.next=temp.next;
					newNode.prev=temp;
					
					//adding in between 
					if(temp.next!=null)
					{
						temp.next.prev=newNode;
						
					}
					temp.next=newNode;
				}
			}
		}
		
	}
	public void displayAll() {
		if(head==null)
			System.out.println("List is empty");
		else
		{
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				System.out.println("Data: "+temp.data);
			}
		}
		
	}
	public void deleteNodeByPos(int pos) {
		if(head==null)
			System.out.println("List is Empty. There is nothing to delete");
		else
		{
			if(pos==1)
			{
				Node temp=head;
				head=head.next;
				
				temp.next=null;
				temp.prev=null;
				temp=null;
			}
			else
			{
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2;i++)
				{
					temp=temp.next;
				}
			}
		}
		
	}
	
}
