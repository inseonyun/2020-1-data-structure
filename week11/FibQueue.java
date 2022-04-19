package week11;

import java.util.Scanner;

class Num {
	int number;
	Num link;
}

class FibonacciQueue {
	Num front;
	Num rear;
	int count; //원소 개수
	
	public FibonacciQueue()	{
		front = null;
		rear = null;
		count = 0;
	}
	public boolean isEmpty()	{
		return (count == 0);	//원소 수가 0이면 true
	}
	public void enQueue(int x) {
		Num newNode = new Num();
		newNode.number = x;
		newNode.link = null;
		if(count == 0) {
			front = rear = newNode;
		}else {
			rear.link = newNode;
			rear = newNode;
		}
		count++;
	}
	public int deQueue()	{
		if(count == 0) 
			return 0;
		int item = front.number;
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count--;
		
		return item;
	}
	public int peek()	{
		if(front == null) 
			return 0;
		else 
			return front.number;
	}
}

public class FibQueue {
	public void fibo(int n) {
		int fib[] = new int[n];
		int a, b;
		
		FibonacciQueue q1 = new FibonacciQueue();
		
		fib[0] = 0;
		fib[1] = 1;
		
		q1.enQueue(fib[0]);
		q1.enQueue(fib[1]);
		
		for(int i = 2; i < n; i++)	{
			a = q1.deQueue();
			b = q1.peek();
			fib[i] = a + b;
			q1.enQueue(fib[i]);
		}
		for(int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0부터 n까지의 피보나치 수열을 구합니다 n값 입력 : ");
		int n = scan.nextInt();
		FibQueue q1 = new FibQueue();
		q1.fibo(n);
	}
}
