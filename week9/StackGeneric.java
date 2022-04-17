package week9;

import java.util.Stack;

public class StackGeneric {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		
		if(stack1.empty())
			System.out.println("Stack1�� ���� ����ֽ��ϴ�.");
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		System.out.println("Stack1�� size�� : " + stack1.size());
		System.out.println("Stack1�� pop�մϴ� : " + stack1.pop());
		System.out.println("Stack1�� peek�մϴ� : " + stack1.peek());
		
		stack1.push(40);
		System.out.println("Stack1�� peek�մϴ� : " + stack1.peek());
		stack1.push(stack1.pop());
		System.out.println("Stack1�� peek�մϴ� : " + stack1.peek());
	}
}
