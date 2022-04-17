package week9;

import java.util.Stack;

public class MyStringCheck {
	
	public static void stringCheck(String exp)	{
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		Stack<Character> stack3 = new Stack<Character>();
		
		for(int i = 0; i < exp.length(); i++)	{
			char c = exp.charAt(i);
			if(c == 'a') {
				stack1.push(c);
			}else if(c == 'b'){
				stack2.push(c);
			}else {
				stack3.push(c);
			}
		}
		while(!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty())	{
			stack1.pop();
			stack2.pop();
			stack3.pop();
		}
		 if(!stack1.isEmpty() && !stack2.isEmpty()) {
			System.out.println("a와 b의 개수가 같고, c보다 많습니다.");
		} else if(!stack2.isEmpty() && !stack3.isEmpty()) {
			System.out.println("b와 c의 개수가 같고, a보다 많습니다.");
		} else if(!stack1.isEmpty() && !stack3.isEmpty()) {
			System.out.println("a와 c의 개수가 같고, b보다 많습니다.");
		} else if(!stack1.isEmpty())	{
			System.out.println("a의 개수가 많습니다");
		} else if(!stack2.isEmpty()) {
			System.out.println("b의 개수가 많습니다.");
		} else if(!stack3.isEmpty()) {
			System.out.println("C의 개수가 많습니다.");
		} else {
			System.out.println("a, b, c의 개수가 같습니다.");
		}
	}
	public static void main(String[] args) {
		String exp = "aaabbbccc";
		stringCheck(exp);
	}
}
