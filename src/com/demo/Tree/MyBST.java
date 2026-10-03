package com.demo.Tree;

public class MyBST {
Node root;
class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public MyBST() {
	this.root = null;
}
public void InsertNode(int key) {
	root= InsertData(root,key);
}
private Node InsertData(Node root, int key) {
	// TODO Auto-generated method stub
	Node newnode = new Node(key);
	if(root==null) {
		root=newnode;
		return root;
	}else {
		if(key<root.data) {
			root.left= InsertData(root.left,key);
		}else {
			root.right= InsertData(root.right,key);
		}
		return root;
	}
}
public void deleteNode(int key) {
	root = deleteData(root,key);
}
private Node deleteData(Node root, int key) {
	// TODO Auto-generated method stub
	if(root==null) {
		return null;
	}else {
		if(key<root.data) {
			root.left = deleteData(root.left,key);
		}else if(key>root.data) {
			root.right = deleteData(root.right,key);
		}else {
//			1. if node is leaf
			if(root.left==null && root.right==null) {
				return null;
				//2. root has one child
			}
			if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
//			3. root has 3 children
			root.data=minval(root.right);
			root.right=deleteData(root.right,root.data);
			
		}
	}
	return root;
}

private int minval(Node right) {
	// TODO Auto-generated method stub
	int minval = root.data;
	while(root.left!=null) {
		minval=root.left.data;
		root=root.left;
	}
	return minval;
}
public boolean search(int key) {
	return (boolean) searchByBTRecurssive(root,key);
}
private boolean searchByBTRecurssive(Node root, int key) {
	// TODO Auto-generated method stub
	if(root!=null) {
		Node temp = root;
		while(temp!=null) {
			if(temp.data == key) {
				System.out.println("Key Found");
				return true;
			}else if(key<temp.data) {
				temp=temp.left;
			}else {
				temp=temp.right;
			}
		}
		System.out.println(key+" Note found");
		return false;
	
}
	return false;


}
public void inOrder() {
	inorderTraversal(root);
	System.out.println();
	
}
private void inorderTraversal(Node root) {
	// TODO Auto-generated method stub
	if(root!=null) {
		inorderTraversal(root.left);
		System.out.println(root.data+",  ");
		inorderTraversal(root.right);

	}
}
public void preOrder() {
	preorderTraversal(root);
	System.out.println();

}
private void preorderTraversal(Node root) {
	// TODO Auto-generated method stub
	if(root!=null) {
		System.out.println(root.data+",  ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}
	
}
public void postOrder() {
	postorderTravrsal(root);
	System.out.println();

}
private void postorderTravrsal(Node root) {
	// TODO Auto-generated method stub
	if(root!=null) {
		postorderTravrsal(root.left);
		postorderTravrsal(root.right);
		System.out.println(root.data+",  ");
	}
}
}
