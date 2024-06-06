package com.demo.trees;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int val) {
			data=val;
			left=null;
			right=null;
		}
	}
	
	public void insertKey(int val) {
		root=insertData(root,val);
		
	}
	
	private Node insertData(Node root, int val) {
		
		Node newNode=new Node(val);
		if(root==null) {
			root=newNode;
			return root;
		}
		else {
			if(val<root.data) {
				root.left=insertData(root.left,val);
			}
			else {
				root.right=insertData(root.right,val);
			}
		}
		return root;
	}
	
	public void inOrder() {
		inorderTraversal(root);
	}

	// Inorder = LDR
	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}
	}
	
	public void preOrder() {
		preorderTraversal(root);
	}

	// Preorder = DLR
	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void postOrder() {
		postorderTraversal(root);
	}

	//PostOrder = LRD
	private void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
	

}
