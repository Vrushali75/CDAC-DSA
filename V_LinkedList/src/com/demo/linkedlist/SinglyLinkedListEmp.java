package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyLinkedListEmp {
	public Node head=null;
	
	class Node{
		Employee data;
		Node next;
		
		public Node(){
			data=null;
			next=null;
		}
		public Node(Employee obj)
		{
			data=obj;
			next=null;
		}
	}

	public void addEmployeeByPos(Employee emp,int pos) {
		Node newNode=new Node(emp);
		if(head==null) {
			System.out.println("List is empty");
			newNode.next=head;
			head=newNode;
		}
		else {
			Node temp=head;
			for(int i=0;temp!=null && i<pos-2;i++)
			{
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}	
		}
	}

	public void displayNodes() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				System.out.println(" "+temp.data);
			}
		}
		
	}

	public void showByName(String nm) {
		if(head==null)
			System.out.println("List is empty");
		else {
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				if(temp.data.getEname().equalsIgnoreCase(nm))
				{
					System.out.println("Data: "+temp.data);
				}
			}
		}
		
	}

	public void delById(int eid) {
		if(head==null)
			System.out.println("List is empty");
		else {
			Node temp=head;
			Node prev=null;
			if(head.data.getEid()==eid)
			{
				head=head.next;
				temp.next=null;
				temp=null;
			}
			else{
				while(temp!=null && temp.data.getEid()!=eid)
				{
					prev=temp;
					temp=temp.next;
				}
				while(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}	
			}
		}	
		System.out.println("Data Deleted successfully");
	}

	public void showById(int id) {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				if(temp.data.getEid()==id) {
					System.out.println("Data: "+temp.data);
				}
			}
		}
		
	}
}
