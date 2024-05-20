package AssignmentNo05;

import java.util.Scanner;

class Stack {
	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	Node top;

	Stack() {
		top = null;
	}

	public boolean isEmpty() {
		return top==null;
	}

	public void push(int value) {
		Node newnode = new Node(value);
			newnode.next = top;
			top = newnode;
		
	}

	public int pop() {
		if (top==null) {
			System.out.println("Stack is Empty");
			return -1;
		} 
		else{
			int temp=top.data;
			top = top.next;
			return temp;
		}
		
	}

	public int peek() {
		 if (top == null) {
	         System.out.println("Stack is empty");
	         return -1;
	     }
     return top.data;
	}
}

public class A5_Q1 {

	public static void main(String[] args) {
		
		Stack st= new Stack();		
		st.push(60);
		st.push(50);
		//System.out.println("peek data: "+st.peek());
		st.push(40);
		System.out.println(""+st.pop());
		System.out.println(""+st.pop());
		System.out.println(""+st.pop());
		System.out.println(""+st.pop());
		
		
		
	}

}