package com.demo.test;

import com.demo.stacks.ArrayStackLinkedList;

public class TestStackArray {

	public static void main(String[] args) {
		ArrayStackLinkedList arr=new ArrayStackLinkedList(5);
		arr.push(10);
		arr.push(20);
		arr.push(30);
		arr.push(40);
		arr.push(50);
		
		arr.display();
		while(!arr.isEmpty()) {
			System.out.println(arr.pop());
		}

	}

}
