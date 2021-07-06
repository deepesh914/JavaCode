package com.DS_StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementHackerRank {

	public static void main(String[] args) {
		
		System.out.println("Enter input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> maxSt = new Stack<Integer>();
		
		while(n>0){
			int choice = sc.nextInt();
			if(choice==1){
				int num = sc.nextInt();
				st.push(num);
				if(maxSt.isEmpty() || num>=maxSt.peek()){
					maxSt.push(num);
				}
			}
			if(choice==2){
				int data = st.pop();
				if(maxSt.peek()==data){
					maxSt.pop();
				}
			}
			if(choice==3){
				System.out.println(maxSt.peek());
			}
			n--;
		}
	}
}
