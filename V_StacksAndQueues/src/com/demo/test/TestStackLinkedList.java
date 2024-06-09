package com.demo.test;

import com.demo.stacks.StackLinkedList;

public class TestStackLinkedList {

	public static void main(String[] args) {
		StackLinkedList<Integer> st=new StackLinkedList<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.display();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
