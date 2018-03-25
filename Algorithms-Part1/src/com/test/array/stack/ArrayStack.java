package com.test.array.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStack<T> {
	
	//Array for holding the stack elements
	private T[] stackHoldingArray;
	private int size;
	
	

	@SuppressWarnings("unchecked")
	public ArrayStack(Class<T> clazz){
		stackHoldingArray = (T[])Array.newInstance(clazz, 0);
	}
	
	
	
	
	/**
	 * Used to push new item to stack
	 * @param newItem
	 */
	public void push(T newItem){
		if(size == stackHoldingArray.length){
			
			int newLength = (size == 0)?4:(size*2);
			stackHoldingArray = Arrays.copyOf(stackHoldingArray, newLength);
			
		}
		
		stackHoldingArray[size] = newItem;
		size++;
	}

	
	/**
	 * Poppes out an item from stack
	 * @return
	 */
	public T pop(){
		T item = stackHoldingArray[size-1];
		size--;
		return item;
	}
	
	/**
	 * Retuns the top most item in stack
	 * @return
	 */
	public T peep(){
		return stackHoldingArray[size-1];
	} 
	
	
	
	/**
	 * toString() implementation
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<size; i++){
			sb.append(stackHoldingArray[i]).append("  |  ");
		}
		
		return sb.toString();
	}
	
	
	
	/**
	 * returrns the size of stack
	 * @return
	 */
	public int getSize() {
		return size;
	}

	
	
}
