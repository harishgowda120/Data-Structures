package com.rc.ArrayQueue;

import java.util.Arrays;

public class ArrayQueue {
	private Integer[] queue;
	private int front=-1, rear=-1;
	
	public ArrayQueue(int c) {
		queue=new Integer[c];
	}
	
	public void enqueue(Integer data) {
		if(rear==queue.length-1) {
			System.out.println("queue is full");
			return;
		}
		if(front==-1&&rear==-1) {
			queue[++rear]=data;
			front=0;
		}
		else {
			queue[++rear]=data;
		}
	}
	
	public void dequeue() {
		if(rear==-1) {
			System.out.println("queue is Empty....");
			return;
		}
		queue[front++]=0;
		if(front==queue.length)
		{
			front=-1;
			rear=-1;
		}
		System.out.println("dequeue Succesfull.....");
	}

	@Override
	public String toString() {
		return "ArrayQueue [queue=" + Arrays.toString(queue) + "]";
	}
	
	
	
}
