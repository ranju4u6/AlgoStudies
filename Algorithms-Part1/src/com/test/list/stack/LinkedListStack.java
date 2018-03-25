package com.test.list.stack;

import com.test.list.LinkedList;

public class LinkedListStack<T> {
	
	
	LinkedList<T> stackStrorageLinkedList = new LinkedList<T>(); 
	
	
	/**
	 * Insert new item to stack
	 * @param newItem
	 */
	public void push(T newItem){
		
		stackStrorageLinkedList.addFirst(newItem);
		
	}
	
	/**
	 * Takes the top item out of Stack.
	 * Removes that item.
	 * @return
	 */
	public T pop(){
		
		T item = stackStrorageLinkedList.getFirst();
		stackStrorageLinkedList.deleteFirst();
		
		return item;
		
	}
	
	/**
	 * Returns the top item in Stack.
	 * @return
	 */
	public T peep(){
		
		T item = stackStrorageLinkedList.getFirst();		
		return item;
		
	}
	
	/**
	 * String representation of stack
	 */
	public String toString(){
		return stackStrorageLinkedList.toString();
	}
	
	/**
	 * Size of stack
	 */
	public long size(){
		return stackStrorageLinkedList.getSize();
	}
	
	

}
