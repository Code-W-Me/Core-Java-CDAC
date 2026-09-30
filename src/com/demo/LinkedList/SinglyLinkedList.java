package com.demo.LinkedList;

//import com.sun.org.apache.bcel.internal.classfile.Node;
	
	public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int n) {
			data = n;
			next = null;
		}
		
	}
	public SinglyLinkedList() {
		head = null;
	}
//add a node at the end
	public void addNode(int val) {
		 Node newNode=new Node(val);
		 //if list is empty
	 if(head==null) {
		  head=newNode;
	 }else {
		 //place the temp at the last node
			 Node temp=head;
			 while(temp.next!=null) {
				 temp=temp.next;
			 }
			 temp.next=newNode;
		 }
		 
	}
	public void addByPosition(int val, int pos) {
		if(head!=null) {
		Node newNode = new Node(val);
		
		if(pos==1) {
			newNode.next=head;
			head = newNode;
		}else {
			Node temp = head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp = temp.next;
			}
			if(temp!=null) {
				newNode.next = temp.next;
				temp.next=newNode;
			}
		}
		}else {
			System.out.println("List is empty");
	}
		
	}
	//add after given number
//	public void addAfterGivenNumber(int val,int num) {
//		Node newnode = new Node(val);
//		if(head!=null) {
//			if(head.data==num) {
//				newnode.next = head;
//				head = newnode;
//			}else {
//				Node prev=head;
//				Node temp = prev.next;
//				while(temp!=null && temp.data!=num) {
//					temp=temp.next;
//				}
//				if(temp!=null && temp.data==num) {
//					newnode.next = prev.next;
//					prev.next= newnode;
//				}else {
//					System.out.println("Not found");
//				}
//			}
//		}else {
//			System.out.println("list is empty");
//		}
//	}
	//add before given number
	public void addBeforeGivenNumber(int val,int num) {
		Node newnode = new Node(val);
		if(head!=null) {
			if(head.data == num) {
				newnode.next=head;
				head = newnode;
			}else {
				Node prev = head;
				Node temp = prev.next;
				
				while(temp!=null && temp.data!=num) {
					prev = temp;
					temp=temp.next;
					
				}
				if(temp!=null && temp.data==num) {
					newnode.next=temp;
					prev.next=newnode;
				}else {
					System.out.println("not found");
				}
			}
		}else {
			System.out.println("List is empty");
		}
	}
	// Delete By value
	public void deleteByValue(int val) {
		if(head!=null) {
			//delete from the beginning
			
			if(head.data==val) {
				Node temp=head;
				head=head.next;
				temp.next=null;
			}else {
				Node prev =head;
				Node temp=prev.next;
				while(temp!=null && temp.data !=val) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null && temp.data ==val) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(val+" Not found");
				}
			}
			
			
			
		}else {
			System.out.println("List is Empty");
		}
	}
	
	
	public void deleteByPosition(int pos) {
		if(head!=null) {
			if(pos==1) {
				Node temp = head;
				head= head.next;
				temp.next=null;
			}else {
				Node prev = head;
				Node temp = prev.next;
				for(int i=1;temp.next!=null && i<pos-2;i++) {
					prev = temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next = null;
				}else {
					System.out.println("Position is out of bounds");
				}
			}
		}else {
			System.out.println("List is empty");
		}
	}

	
	public void displayAll() {
		for(Node temp=head;temp!=null;temp=temp.next) {
			System.out.print(temp.data+"---->");
		}
		System.out.println("null");
	}
	
	




}
