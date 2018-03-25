package com.test.tests.usages.stack;

import com.test.list.stack.LinkedListStack;



/**
 * Postfix calculator is used to remove ambiguity 
 * between the operations to be performed first while 
 * using the normal arithmetic expression.
 * Eg.
 * 	5 + 6 * 7 - 1
 * 	Its tricky to understand which operation has to 
 * be performed first, whether it is + or *. Postfix notation 
 * removes this ambiguity by keeping the operation after operands.
 * 
 * The above example can be expressed  in postfix notation as,
 * 	5 6 7 * + 1 -
 * 
 * @author renju
 *
 */

public class PostfixCalculator {
	
	LinkedListStack<Integer> calculatorStack = new LinkedListStack<Integer>();
	
	
	public int calculate(String postfixExpression){
		
		String[] splittedExpression = postfixExpression.split("\\ ");
		
		
		for(int i = 0; i < splittedExpression.length ; i++){
			
			if(isInteger(splittedExpression[i])){
				
				calculatorStack.push(Integer.parseInt(splittedExpression[i]));
				
			}else{
				
				
				int operand_2 = calculatorStack.pop();
				int operand_1 = calculatorStack.pop();
				
				
				switch(splittedExpression[i]){
				case "+":
					calculatorStack.push(operand_1 + operand_2);
					break;
				case "-":
					calculatorStack.push(operand_1 - operand_2);
					break;
				case "*":
					calculatorStack.push(operand_1 * operand_2);
					break;
				case "/":
					calculatorStack.push(operand_1 / operand_2);
					break;
				case "%":
					calculatorStack.push(operand_1 % operand_2);
					break;
					default:
						throw new RuntimeException("Unknown operation !");

				}
				
				
				
				
			}
			
		}
		
		return calculatorStack.pop();
		
	}
	
	private static boolean isInteger(String value){
		try{
			Integer.parseInt(value);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		PostfixCalculator calculator = new PostfixCalculator();
		System.out.println(calculator.calculate("5 6 7 * + 1 -"));
	}

}
