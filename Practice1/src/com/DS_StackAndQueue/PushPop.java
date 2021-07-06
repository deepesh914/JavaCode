package com.DS_StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PushPop {
	Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack<Character>();

    void pushCharacter(char ch){
        this.stack.push(ch);
    }
    void enqueueCharacter(char ch){
        this.queue.add(ch);
    }    
    char popCharacter(){
        return this.stack.pop();
    }
    char dequeueCharacter(){
        return this.queue.remove();
    }	
	public static void main(String[] args) {
	        /*Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the value");
	        String input = scan.nextLine();*/
	        String input = "naman";
	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a PushPop object:
	        PushPop p = new PushPop();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }
	        System.out.println( "The word " + input + " is " 
                    + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

	}
}
