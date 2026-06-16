package com.rc.LinkedQueue;

public class MainClass {
	public static void main(String[] args) {
		LinkedQueue lq=new LinkedQueue();
		lq.enqueuq(12);
		lq.enqueuq(13);
		lq.enqueuq(14);
		lq.enqueuq(15);
		lq.enqueuq(16);
		lq.enqueuq(17);
		lq.DisplayQueue();
		
		lq.dequeuq();
		lq.dequeuq();
		System.out.println(lq.size());
		lq.DisplayQueue();

	}
}
