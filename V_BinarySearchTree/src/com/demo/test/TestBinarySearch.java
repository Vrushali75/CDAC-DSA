package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearch {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insertKey(60);
		tree.insertKey(35);
		tree.insertKey(40);
		tree.insertKey(20);
		tree.insertKey(75);
		tree.insertKey(70);
		tree.insertKey(80);
		tree.inOrder();
		System.out.println("-----------------");
		tree.preOrder();
		System.out.println("-----------------");
		tree.postOrder();

	}

}
