package com.Collection;

import java.util.Stack;

public class BracesCorrect {

	public static void main(String[] args) {        
	    String str = "[({})]";
	    System.out.println(CheckParentesis(str));
	}
	
	public static boolean CheckParentesis(String str)
	{
	    if (str.isEmpty())
	        return true;

	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++){
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '['){
	            stack.push(current);
	        }

	        if (current == '}' || current == ')' || current == ']'){
	            if (stack.isEmpty())
	                return false;

	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                stack.pop();
	            else 
	                return false;
	        }
	    }
	    return stack.isEmpty();
	}
}
