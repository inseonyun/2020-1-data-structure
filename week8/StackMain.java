package week8;

interface Stack2	{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}
class ArrStack implements Stack2 {
	private int top;
	private int stackSize = 5;
	private char itemArray[];
	
	public ArrStack()	{
		top = -1;
		itemArray = new char[stackSize];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull()	{
		return (top == stackSize-1);
	}
	public void resize(int newStackSize)	{
		char tmpItemArray[] = new char[newStackSize];
		
		for(int i = 0; i < top; i++)	{
			tmpItemArray[i] = itemArray[i];
		}
		itemArray = tmpItemArray;
	}
	public void push(char item) {
		if(isFull())	{
			System.out.println("Stack Overflow");
			resize(stackSize*2);
		}else {
			top++;
			itemArray[top] = item;
		}
	}
	public char pop() {
		char tmpitem;
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			resize(stackSize/2);
			return 0;
		}else {
			tmpitem = itemArray[top];
			top--;
			return tmpitem;		
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			resize(stackSize/2);
		}
		top--;
	}
	public char peek() {
		char item;
		if(isEmpty())	{
			System.out.println("Stack Underflow");
			return 0;
		}
		item = itemArray[top];
		
		return item;
	}
}
class StackNode	{
	char data;
	StackNode link;
}
class LStack implements Stack2	{
	private StackNode top;
	
	public LStack()	{
		top = null;
	}
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if(isEmpty())	{
			System.out.println("Stack Underflow");
			return 0;
		} else {
			char tmpitem = top.data;
			top = top.link;
			return tmpitem;
		}
	}
	public void delete() {
		if(isEmpty())	{
			System.out.println("Stack Underflow");
		} else {
			top = top.link;
		}
	}
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return '0';
		} else {
			return top.data;
		}
	}
}
public class StackMain {
	public static void main(String[] args) {
		ArrStack arr1 = new ArrStack();
		LStack arr2 = new LStack();
		
		arr1.push('a');
		arr1.push('+');
		arr1.push('b');
		arr1.push('-');
		arr1.push('c');
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println("-------------------------");
		
		arr2.push('a');
		arr2.push('+');
		arr2.push('b');
		arr2.push('-');
		arr2.push('c');
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		
		
	}
}
