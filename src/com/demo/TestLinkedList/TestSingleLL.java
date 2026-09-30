package com.demo.TestLinkedList;

import com.demo.LinkedList.SinglyLinkedList;

public class TestSingleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(12);
		list.addNode(30);
		list.addNode(11);
		list.addNode(1);
		list.addNode(10);
		list.addNode(65);
		list.addNode(22);
		list.displayAll();

		list.addByPosition(20, 3);
//		list.addAfterGivenNumber(4, 20);
		list.addBeforeGivenNumber(6969, 1);
		list.displayAll();

	}

}
