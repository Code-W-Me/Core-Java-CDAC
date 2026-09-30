package demo.DoublyLL;

public class DoublyLinkedList {
Node head;
class Node{
	int Data;
	Node prev, next;
	public Node(int num) {
		Data = num;
		prev=null;
		next=null;
	}
}
public DoublyLinkedList(){
	head=null;
}
public void addnode(int val) {
	Node newnode=new Node(val);
	if(head==null) {
		head=newnode;
	}else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.prev=temp;
	}
}
public void addByPosition(int val,int pos) {
	if(head!=null) {
		Node newnode = new Node(val);
		if(pos==1){
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}else {
			Node temp=head;
			for(int i=1;temp!=null&& i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next=newnode;
			//add at the middle
			if(newnode.next!=null) {
				newnode.next.prev=newnode;
			}
			}else {
				System.out.println("Not found");
			}
		}
	}else {
		System.out.println("List is Empty");
	}
	
}
public void addAfterGivenNum(int val,int num) {
	if(head!=null) {
		Node newnode =new  Node(val);
		Node temp=head;
		while(temp!=null && temp.Data!=num) {
			temp=temp.next;
		}
		if(temp!=null && temp.Data==num) {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next=newnode;
			if(temp.next!=null) {
				newnode.next.prev=newnode;
			}
		}else {
			System.out.println("Not found");
		}
	}else {
		System.out.println("List is empty");
	}
}
public void addBeforeGivenNum(int val, int num) {
	if(head!=null) {
		Node newnode = new Node(val);
		if(head.Data==num) {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}else {
			Node temp=head;
			while(temp!=null && temp.Data!=num) {
				temp=temp.next;
			}if(temp!=null && temp.Data==num) {
				newnode.prev=temp.prev;
				temp.prev.next=newnode;
				newnode.next=temp;
				temp.prev=newnode;
			}
		}
	}else {
		System.out.println("Empty");
	}
}




}
