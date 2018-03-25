package com.test.tests;

import com.test.array.stack.ArrayStack;

public class TestArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack<Integer> intArrayStack =new ArrayStack<Integer>(Integer.class);
		
		System.out.println("SIZE :"+intArrayStack.getSize());
		
		intArrayStack.push(1);
		intArrayStack.push(2);
		intArrayStack.push(3);
		intArrayStack.push(4);
		
		System.out.println("SIZE :"+intArrayStack.getSize());
		System.out.println(intArrayStack);
		
		
		intArrayStack.push(5);
		
		System.out.println("SIZE :"+intArrayStack.getSize());
		System.out.println(intArrayStack);
		
		
		System.out.println("TOP Element: "+intArrayStack.peep());
		
		intArrayStack.pop();
		
		System.out.println("SIZE :"+intArrayStack.getSize());
		System.out.println(intArrayStack);

	}

}
