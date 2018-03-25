package com.test.tests;

import com.test.list.queue.LinkedListQueue;

public class TestLinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListQueue<String> stringQueue = new LinkedListQueue<String>();

		stringQueue.enqueue("ABCD");
		
		stringQueue.enqueue("EFGH");
		
		stringQueue.enqueue("IJKL");
		
		stringQueue.enqueue("MNOP");
		
		
		System.out.println(stringQueue.toString());
		
		System.out.println("Dequeue :"+ stringQueue.dequeue());
		
		System.out.println(stringQueue.toString());
	}

}
