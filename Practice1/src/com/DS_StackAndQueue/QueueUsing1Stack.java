package com.DS_StackAndQueue;
import java.util.Stack;
//Last In First Out using Queue(Behavior FIFO)
public class QueueUsing1Stack {

	public Stack<Integer> st;

	public QueueUsing1Stack() {
		super();
		st  = new Stack<Integer>();
	}
	
	public void enQueue(int data){
		if(st.isEmpty()){
			st.push(data);
		}else{
			int size = st.size();
			st.push(data);
			while(size>0){
				st.push(st.pop());
				size--;
			}
		}
		
	}
	
	public int deQueue(){
		return st.pop();
	}

	public static void main(String[] args) {
		
		QueueUsing1Stack q = new QueueUsing1Stack();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
