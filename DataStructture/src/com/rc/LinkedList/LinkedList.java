package com.rc.LinkedList;

public class LinkedList {
	Node st;
	public LinkedList(Node st) {
		this.st=st;
	}
	
	public void insert(Node n) {
		if(this.st==null) {
			this.st=n;
			return;
		}
		Node t=st;
		while(t.next!=null){
			t=t.next;
		}
		t.next=n;
	}
	
	public void traverse() {
		Node t=this.st;
		while(t!=null) {
			System.out.print(t.val+"->");
			t=t.next;	
		}
	}
}
