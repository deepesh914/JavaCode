package com.DS_StackAndQueue;

import java.util.Stack;

public class Braces {

	public static void main(String[] args) {
		
		String s = "{[()]}";
		System.out.println(checkBraces(s));

	}

	private static boolean checkBraces(String s) {
		
		if(s.isEmpty())
			return true;
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {	
			char current = s.charAt(i);
			if(current =='{' || current=='[' || current=='('){
				stack.push(current);
			}
			if(current =='}' || current==']' || current==')'){
				
				if(stack.isEmpty())
					return false;
				
				char last = stack.peek();
				
				if((current=='}' && last=='{') || (current==']' && last=='[') || (current==')' && last=='(')){
					stack.pop();
				}
				else 
					return false;
			}
		}
		return (stack.isEmpty());
	}

}
