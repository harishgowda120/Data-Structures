package com.rc.StackinLinkedList;

class Node{
	Object data;
	Node next;
	public Node(Object data) {
		this.data=data;
	}
	
}

public class LikedListStack {
	Node head;
	Node top;
	
	public <E> void push(E data) {
		Node newnode=new Node(data);
		if(this.head==null&&this.top==null) {
			head=newnode;
			top=newnode;
		}
		else {
			top.next=newnode;
			top=newnode;
		}
	}
	
	public int pop() {
		if(top==null) {
			return -1;
		}
		if(head.next==null) {
			top=null;
			head=null;
			return 1;
		}
		Node t=head;
		while(t.next!=top) {
			t=t.next;
		}
		top=t;
		top.next=null;
		return 1;
	}
	public Object peek() {
		return top.data;
	}

	public void DisplayStack() {
		Node t=head;
		while(t!=null) {
			if(t.next!=null)
				System.out.print(t.data+"->");
			else
				System.out.print(t.data);
			t=t.next;		}
	}
}
