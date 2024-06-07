package com.demo.linkedlist;

public class LinkedList {
	public Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node() 
		{
			data=0;
			next=null;
		}
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}

	public void addNode(int value) {
		Node newNode=new Node(value);
		
		//add at the first position if the list is empty
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			
			//this loop will place the temp at the last node
			while(temp.next!=null)
			{
				
				temp=temp.next;
			}
			temp.next=newNode;	
		}
	}
	
	//adding linkedlist at the position given by the user
	
	
	public void displayLinkedList()
	{
		if(head==null)
			System.out.println("List is empty");
						   //temp.next!=null (for stopping temp before null)
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			System.out.println(" Data: "+temp.data);
		}
		System.out.println("----------------------------------");
	}

	public void addNodeByPosition(int value, int pos) {
		
		Node newNode=new Node(value);
		
		//if list is empty add node at 1st position
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			Node temp=head;
			for(int i=0;temp!=null && i<pos-2;i++)
			{
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

	public int deleteNode(int pos) {
		
		int n=-1;
		//Deleting a node by position
		//Condition for empty list
		if(head==null)
			System.out.println("The list is empty, there is nothing to delete");
		
		//Condition if 1st node is to be deleted
		else if(pos==1)
		{
			Node temp=head;
			head=head.next;
			temp.next=null;
			n=temp.data;
			temp=null;
		}
		
		//Condition for deleting a node at a specified position
		else
		{
			Node prev=null;
			Node temp=head;
			for(int i=0;temp!=null && i<pos-1;i++)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null) {
			prev.next=temp.next;
			temp.next=null;
			n=temp.data;
			temp=null;
			}
			else
			{
				System.out.println("Data not found");
			}
		}
		return n;

	}

	public void deleteByValue(int val) {
		Node temp=head;
		Node prev=null;
		
		//condition for 1st condition
		if(head.data==val)
		{
			head=head.next;
			temp.next=null;
			temp=null;
		}
		
		//condition for deleting a node in between
		else
		{
			while(temp!=null && temp.data!=val)
			{
				prev=temp;
				temp=temp.next;
			}
		}
		
		//delete the node
		if(temp!=null)
		{
			prev.next=temp.next;
			temp.next=null;
			temp=null;
		}
		else
			System.out.println("Data not found");
		
		
	}

	public void displayEvenLinkedList() {
		Node temp=head;
		System.out.println("Displaying even numbers only: ");
		if(head==null)
			System.out.println("List is empty");
		else
		{
			for(;temp!=null;temp=temp.next)
			{
				if(temp.data%2==0)
					System.out.println(" | "+temp.data);
					
			}
		}
		
		
	}

	
}


