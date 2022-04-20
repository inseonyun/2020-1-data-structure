package week12_lab;

class Node {
	int data;
	Node next;	//right link
	Node prev;	//left link
}

class DeQue {
	Node head;
	Node tail;
	int count;
	
	public DeQue()	{
		head = null;
		tail = null;
		count = 0;
	}
	public boolean isEmpty()	{
		return (count == 0);
	}
	public void insertFirst(int data)	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = null;
		newNode.next = null;
		if(head != null) {
			head.prev = newNode;
			newNode.next = head;
		}
		head = newNode;
		if(tail == null)	{
			tail = newNode;
		}
		count++;
		
	}
	public Node deleteFirst()	{
		if(head == null) {
			System.out.println("원소 없음");
			return null;
		}
		Node tmpNode = head;
		head = head.next;
		if(head != null)	{
			head.prev = null;
		}
		count--;
		if(head == null) {
			tail = null;
		}
		return tmpNode;
	}
	public void insertLast(int data)	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = null;
		newNode.next = null;
		if(tail != null) {
			tail.next = newNode;
		}
		tail = newNode;
		if(head == null) {
			head = newNode;
		}
		count++;
	}
	public Node deleteLast()	{
		if(tail == null) {
			System.out.println("원소 없음");
			return null;
		}
		Node tmpNode = tail;
		tail = tail.prev;
		if(tail != null) {
			tail.next = null;
		}
		count--;
		if(tail == null) {
			head = null;
		}
		
		return tmpNode;
	}
	public void print()	{
		Node tmp = head;
		if(tmp != null) {
			while(tmp != tail) {
				System.out.print(" " + tmp.data);
				tmp = tmp.next;
			}
			System.out.println(" " + tmp.data);
		} else {
			System.out.println("원소없음");
		}
	}
}

class Stack	{
	DeQue dq1 = new DeQue();
	int count = -1;
	
	public void push(int x)	{
		dq1.insertFirst(x);
		count++;
	}
	public int pop()	{
		if(isEmpty()) {
			System.out.println("원소 없음");
			
			return 0;
		} else {
			Node x = dq1.deleteFirst();
			count--;
			return x.data;
		}
	}
	public int peek()	{
		if(isEmpty()) {
			System.out.println("선두 원소가 없습니다.");
			return 0;
		} else {
			return dq1.head.data;
		}
	}
	public int top()	{
		if(count == -1)	{
			System.out.println("선두 원소가 없습니다. ");
			return -1;
		} else {
			System.out.println("(0부터) 현재 Top운 " + count + "번째를 가르키고 있습니다.");
			return dq1.head.data;
		}
		
	}
	public boolean isEmpty()	{
		return (dq1.count == 0);
	}
	public void print()	{
		dq1.print();
	}
}

class Queue	{
	DeQue dq1 = new DeQue();

	public void enqueue(int x)	{
		dq1.insertLast(x);
	}
	public int dequeue()	{
		if(isEmpty())	{
			System.out.println("삭제할 원소 없음");
			return 0;
		} else {
			Node x = dq1.deleteFirst();
			return x.data;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("peek할 원소 없음");
			return 0;
		} else {
			return dq1.head.data;
		}
	}
	public boolean isEmpty()	{
		return(dq1.count == 0);
	}
	public void print()	{
		dq1.print();
	}
}

public class SimalUsingDeque {
	public static void main(String[] args) {
		/*
		DeQue dq1 = new DeQue();
		
		dq1.insertFirst(12);
		dq1.insertLast(11);
		dq1.print();
		dq1.deleteFirst();
		dq1.print();
		dq1.deleteLast();
		dq1.print();
		dq1.insertFirst(20);
		dq1.print();
		dq1.deleteLast();
		dq1.print();
		*/
		System.out.println("-----------Stack입니다.(시작)-------------");
		Stack stack1 = new Stack();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		
		System.out.print("현재 Stack 상태 :");
		stack1.print();
		System.out.println("top 원소 : " + stack1.top());
		System.out.println("삭제된 원소 : " + stack1.pop());
		System.out.println("peek한 원소 : " + stack1.peek());
		System.out.println("삭제된 원소 : " + stack1.pop());
		System.out.println("삭제된 원소 : " + stack1.pop());
		System.out.println("삭제된 원소 : " + stack1.pop());
		System.out.println("삭제된 원소 : " + stack1.pop());
		System.out.println("-----------Stack입니다.(끝)-------------");
		
		System.out.println("-----------Queue입니다.(시작)-------------");
		Queue q1 = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		
		System.out.print("현재 Queue의 상태 :");
		q1.print();
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("peek한 원소 : "+ q1.peek());
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("삭제된 원소 : " + q1.dequeue());
		System.out.println("-----------Queue입니다.(끝)-------------");
	}
}
