package week9;

import java.util.Stack;

class MyNode	{
	int i;
	String name;
	
	public MyNode(int in,String n)	{
		this.name = n;
		this.i = in;
	}
	public void print()	{
		System.out.println("i = " + this.i + ", name = " + this.name);
	}
}

public class MyGeneric {
	public static void main(String[] args) {
		Stack<MyNode> s = new Stack<>();
		
		MyNode node1 = new MyNode(1,"Kim");
		s.push(node1);
		MyNode node2 = new MyNode(2,"Lee");
		s.push(node2);
		MyNode node3 = new MyNode(3,"choi");
		s.push(node3);
		
		s.pop().print();
		s.pop().print();
		s.pop().print();
		
	}
}
