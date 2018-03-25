package com.test.list.queue;

import com.test.list.LinkedList;

public class LinkedListQueue<T> {
	
	LinkedList<T> queueStorage = new LinkedList<T>();
	
	/**
	 * Add items to queue
	 * @param newItem
	 */
	public void enqueue(T newItem){
		queueStorage.addLast(newItem);
	}
	
	/**
	 * Remove items from queue and return the removed item
	 * @return
	 */
	public T dequeue(){
		if(queueStorage.getSize() == 0)throw new RuntimeException("Queue is empty !!");
		
		
		T item = queueStorage.getFirst();
		queueStorage.deleteFirst();
		
		return item;
	}
	
	
	public String toString(){
		return queueStorage.toString();
	}
	

}
