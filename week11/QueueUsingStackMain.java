package week11;

import java.util.Stack;

class QueueUsingStack	{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void enqueue(int x) {
		s1.push(x);
	}
	public int dequeue() {
		if(s1.isEmpty())
			return -1;
		else {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			Integer x = s2.pop();
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return x;
		}
	}
}

public class QueueUsingStackMain {
	public static void main(String[] args) {
		QueueUsingStack q1 = new QueueUsingStack();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	}
}
