package com.Collection;

import java.util.Stack;

public class BracesCount {
	
	public static void main(String[] args) {
		String str = "([]()){}";
		System.out.println(checkBraces(str));
	}
	
	public static boolean checkBraces(String str){
		
		if(str.isEmpty())
			return true;
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			
			char current = str.charAt(i);
			
			if(current == '(' || current == '{' || current == '['){
				stack.push(current);
			}
			
			if(current == ')' || current == '}' || current == ']'){
				char last = stack.peek();
				if(current == ')' && last == '(' || last == '{' && current == '}' || last == '[' && current == ']'){
					stack.pop();
				}
				else
					return false;
			}
		}		
		return stack.isEmpty();
	}
}
