package week9;

import java.util.Stack;

public class StackGeneric {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		
		if(stack1.empty())
			System.out.println("Stack1이 현재 비어있습니다.");
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		System.out.println("Stack1의 size는 : " + stack1.size());
		System.out.println("Stack1을 pop합니다 : " + stack1.pop());
		System.out.println("Stack1을 peek합니다 : " + stack1.peek());
		
		stack1.push(40);
		System.out.println("Stack1을 peek합니다 : " + stack1.peek());
		stack1.push(stack1.pop());
		System.out.println("Stack1을 peek합니다 : " + stack1.peek());
	}
}
