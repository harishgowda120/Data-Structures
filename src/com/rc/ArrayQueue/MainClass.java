package com.rc.ArrayQueue;

public class MainClass {
	public static void main(String[] args) {
		ArrayQueue aq=new ArrayQueue(5);
		aq.enqueue(12);
		aq.enqueue(13);
		aq.enqueue(14);
		aq.enqueue(15);
		aq.enqueue(16);
		System.out.println(aq);
		aq.dequeue();
		aq.dequeue();
		System.out.println(aq);
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		System.out.println(aq);



		
	}
}
