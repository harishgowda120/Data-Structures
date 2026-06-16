package com.rc.LinkedQueue;

class Node{
	Integer data;
	Node next;
	public Node(Integer n) {
		this.data=n;
	}
}
public class LinkedQueue {
	private Node front,rear;
	private int size;
	
	public void enqueuq(Integer n) {
		Node newNode=new Node(n);
		if(front==null&&rear==null) {
			front=rear=newNode;
			
		}else {
			rear.next=newNode;
			rear=newNode;
		}
		size++;
		
	}
	
	public void dequeuq() {
		if(front==null&&rear==null) {
			System.out.println("queue is empty.....");
		}else {
			front=front.next;
		}
		if(front ==null)rear=null;
		size--;
		System.out.println("dequeue is successful....");
	}
	
	public void DisplayQueue() {
		Node t=front;
		while(t!=null) {
			if(t.next!=null)
				System.out.print(t.data+"->");
			else
				System.out.println(t.data);
			t=t.next;
		}
	}
	public int size() {
		return size;
	}
}
