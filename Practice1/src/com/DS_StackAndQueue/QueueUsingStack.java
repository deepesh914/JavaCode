package com.DS_StackAndQueue;
import java.util.Stack;
//First In First Out using Stack(Behavior LIFO)
public class QueueUsingStack {

	Stack<Character> st1 = new Stack<Character>();
	Stack<Character> st2 = new Stack<Character>();
	
	public void push(char data){
		if(st1.isEmpty())
			st1.push(data);
		else{
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}
			st1.push(data);
		}
		while(!st2.isEmpty()){
			st1.push(st2.pop());
		}
	}
	
	public char pop(){
		return st1.pop();
	}
	
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.push('A');
		q.push('B');
		q.push('C');
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}
