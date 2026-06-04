package com.rc.LinkedList;

public class MainClass {
public static void main(String[] args) {
	LinkedList ll=new LinkedList(new Node(100, null));
	ll.insert(new Node(200, null));
	ll.insert(new Node(300, null));
	ll.insert(new Node(400, null));
	ll.insert(new Node(500, null));
	
	ll.traverse();

	
}
}
