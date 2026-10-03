package com.demo.TestTree;

import com.demo.Tree.MyBST;

public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBST bst = new MyBST();
		bst.InsertNode(10);
		bst.InsertNode(20);
		bst.InsertNode(30);
		bst.InsertNode(40);
		bst.InsertNode(50);
		bst.InsertNode(60);
		bst.InsertNode(70);
		System.out.println("in");
		bst.inOrder();
		System.out.println("Pre");
		bst.preOrder();
		System.out.println("Post");
		bst.postOrder();
		bst.search(50);
//		bst.inOrder();
		bst.deleteNode(60);
		bst.inOrder();



	}

}
