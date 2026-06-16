package com.rc.StackinLinkedList;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		
		
		LikedListStack ls=new LikedListStack();
		ls.push(123);
		ls.push(787);
		ls.push(345);
		ls.push(87);
		ls.push(234);
		ls.push(87);
		ls.DisplayStack();
		System.out.println();
		System.out.println(ls.peek());
		ls.pop();
		ls.DisplayStack();
	}
}
