package com.test.tests;

import com.test.list.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addFirst(3);
		linkedList.addFirst(4);
		System.out.println(linkedList.toString());
		System.out.println("Size :"+linkedList.getSize());
		linkedList.addLast(5);
		System.out.println(linkedList.toString());
		System.out.println("Size :"+linkedList.getSize());
		linkedList.deleteFirst();
		System.out.println(linkedList.toString());
		System.out.println("Size :"+linkedList.getSize());
		linkedList.deleteLast();
		System.out.println(linkedList.toString());
		System.out.println("Size :"+linkedList.getSize());
		
		

	}

}
