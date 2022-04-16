package week8;

interface Stack3<E>	{
	boolean isEmpty();
	void push(E item);
	E pop();
	void delete();
	E peek();
}
class GeArrStack<E> implements Stack3<E> {
	private int top;
	private int stackSize = 5;
	private Object itemArray[];
	
	public GeArrStack()	{
		top = -1;
		itemArray = new Object[stackSize];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull()	{
		return (top == stackSize-1);
	}
	public void resize(int newStackSize)	{
		Object tmpItemArray[] = new Object[newStackSize];
		
		for(int i = 0; i < top; i++)	{
			tmpItemArray[i] = itemArray[i];
		}
		itemArray = tmpItemArray;
	}
	public void push(E item) {
		if(isFull())	{
			System.out.println("Stack Overflow");
			resize(stackSize*2);
		}else {
			top++;
			itemArray[top] = item;
		}
	}
	public E pop() {
		Object tmpitem;
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			resize(stackSize/2);
			return null;
		}else {
			tmpitem = itemArray[top];
			top--;
			return (E)tmpitem;		
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			resize(stackSize/2);
		}
		top--;
	}
	public E peek() {
		Object item;
		if(isEmpty())	{
			System.out.println("Stack Underflow");
			return null;
		}
		item = itemArray[top];
		
		return (E)item;
	}
}
class StackNode1<E>	{
	E data;
	StackNode1 link;
}
class LLinkStack<E> implements Stack3<E>{
	private StackNode1 <E> top;
	
	public LLinkStack()	{
		top = null;
	}
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(E item) {
		StackNode1 <E> newNode = new StackNode1();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public E pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			E tmpItem = top.data;
			top = top.link;
			return tmpItem;
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		top = top.link;
	}
	public E peek() {
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return null;
		} else {
			return top.data;
		}
	}
}

public class StackGeneric {
	public static void main(String[] args) {
		LLinkStack<String> arr1 = new LLinkStack<String>();
		GeArrStack<Integer> arr2 = new GeArrStack<Integer>();
		
		arr1.push("Kim");
		arr1.push("Lee");
		arr1.push("Park");
		arr1.push("Son");
		arr1.push("Yun");
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		System.out.println(arr1.pop());
		
		System.out.println("---------------------------------");
		
		arr2.push(10);
		arr2.push(20);
		arr2.push(30);
		arr2.push(25);
		arr2.push(50);
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		System.out.println(arr2.pop());
		
	}
}
