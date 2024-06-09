package com.demo.test;

import java.util.Scanner;

import com.demo.stacks.StackLinkedList;

public class TestParenthesis {

	public static void main(String[] args) {
		System.out.println("Enter parenthesis to check it is balanced or imbalanced: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StackLinkedList<Character> stk=new StackLinkedList<>();
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			Character ch=s.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				stk.push(ch);
			}
			else{
				if(!stk.isEmpty()) {
					Character ch1=stk.pop();
					switch(ch) {
					case ')':
						if(ch1!='(')
						{
							System.out.println("No balanced Parenthesis");
							flag=false;
						}
						break;
						
					case ']':
						if(ch1!='[')
						{
							System.out.println("No balanced Parenthesis");
							flag=false;
						}
						break;
						
					case '}':
						if(ch1!='{')
						{
							System.out.println("No balanced Parenthesis");
							flag=false;
						}
						break;
					}
				}
				else
				{
					System.out.println("No balanced parenthesis");
					flag=false;
				}
			}
			if(!flag)
				break;
		}
		if( flag && stk.isEmpty())
			System.out.println("Balanced Parenthesis");
		else
			System.out.println("No balanced parenthesis");

	}

}
