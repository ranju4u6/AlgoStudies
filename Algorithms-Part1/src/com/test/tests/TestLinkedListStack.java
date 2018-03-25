package com.test.tests;

import com.test.list.stack.LinkedListStack;

public class TestLinkedListStack {

	public static void main(String[] args) {
		
		
		LinkedListStack<Integer> integerStack = new LinkedListStack<>();
		
		System.out.println(integerStack.toString());
		System.out.println(integerStack.size());
		
		integerStack.push(10);
		System.out.println(integerStack.toString());
		System.out.println(integerStack.size());
		
		
		integerStack.push(20);
		integerStack.push(30);
		integerStack.push(40);
		System.out.println(integerStack.toString());
		System.out.println(integerStack.size());
		
		System.out.println("On top: "+integerStack.peep());
		
		System.out.println("Popping out: "+integerStack.pop());
		System.out.println(integerStack.toString());
		System.out.println(integerStack.size());
		
		
		
		

	}

}
