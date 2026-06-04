package com.rc.LinkedList;

public class LinkedList {
	
	class Node {
		Integer data;
		Node next;
		public Node(Integer n) {
			this.data=n;	
		}
	}
	
	Node head;
	
	
	public void insert(Integer data) {
		Node n=new Node(data);
		if(this.head==null) {
			this.head=n;
			return;
		}
		Node t=head;
		while(t.next!=null){
			t=t.next;
		}
		t.next=n;
	}
	
	public void insertAtStart(Integer data) {
		Node n=new Node(data);
		n.next=this.head;
		head=n;
	}
	
	public void traverse() {
		Node t=this.head;
		while(t!=null) {
			if(t.next!=null)
				System.out.print(t.data+"->");
			else
				System.out.print(t.data);

			t=t.next;	
		}
	}
}
