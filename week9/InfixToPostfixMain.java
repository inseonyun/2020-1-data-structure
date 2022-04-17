package week9;

import java.util.Stack;

class InfixToPostfix {
	static int Priority(char ch) {
		switch (ch) {
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '/':
			return 2;
		case '^':
			return 3;
		}

		return -1;
	}

	public static String cal(String e) {
		String result = new String("");
		Stack<Character> stack1 = new Stack<Character>();
		for (int i = 0; i < e.length(); i++) {
			char c = e.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				result += c;
			} else if (c == '(') {
				stack1.push(c);
			} else if (c == ')') {
				while (!stack1.isEmpty() && stack1.peek() != '(') {
					result += stack1.pop();
				}
				if (!stack1.isEmpty() && stack1.peek() != '(') {
					return "Error";
				} else {
					stack1.pop();
				}
			} else {
				while (!stack1.isEmpty() && Priority(c) <= Priority(stack1.peek())) {
					result += stack1.pop();
				}
				stack1.push(c);
			}
		}
		while (!stack1.isEmpty()) {
			result += stack1.pop();
		}

		return result;
	}
}

public class InfixToPostfixMain {
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("중위표기식 : " + exp + ", 후위표기식 : " + InfixToPostfix.cal(exp));

	}
}
