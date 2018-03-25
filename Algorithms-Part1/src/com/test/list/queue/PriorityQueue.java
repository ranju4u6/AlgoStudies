/*package com.test.list.queue;

import java.util.LinkedList;


public class PriorityQueue<T>{
	
	
	
	LinkedList<T> queueStorage = new LinkedList<T>();
	
	*//**
	 * Add items to queue
	 * @param newItem
	 *//*
	public void enqueue(T newItem){
		
		if(queueStorage.size() == 0)
			queueStorage.addLast(newItem);
		else{
			
			T currentItem = queueStorage.getFirst();
			
			
			// TO DO
			
		}
	}
	
	*//**
	 * Remove items from queue and return the removed item
	 * @return
	 *//*
	public T dequeue(){
		if(queueStorage.size() == 0)throw new RuntimeException("Queue is empty !!");
		
		
		T item = queueStorage.getFirst();
		queueStorage.removeFirst();
		
		return item;
	}
	
	
	public String toString(){
		return queueStorage.toString();
	}

}
*/