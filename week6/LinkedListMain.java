package week6;


class Node	{
	String name;
	Node link;
	
	public Node(String n)	{
		name = n;
	}
}

class LinkedList1	{
	Node head;
	Node tail;
	
	public void addFirst(String n)	{
		Node newNode = new Node(n);
		newNode.name = n;
		newNode.link = null;
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.link = head;
			head = newNode;
		}
	}
	public void addLast(String n)	{
		Node newNode = new Node(n);
		newNode.name = n;
		newNode.link = null;
		
		if(head == null)	{
			head = newNode;
			tail = newNode;
		} else {
			tail.link = newNode;
			tail = newNode;
		}
	}
	public void deleteFirst() {
		String d = " ";
		
		d = head.name;
		head = head.link;
		if(head == null)	{
			tail = null;
		}
	}
	public void deleteLast()	{
		String d = " ";
		Node p,q;
		
		p = head;
		q = null;
		
		while(p.link != null) {
			q = p;
			p = p.link;
		}
		d = p.name;
		tail = q;
		tail.link = null;
		
	}
	public void getNumberOfNode()	{
		Node p = head;
		int count = 0;
		
		while(p != null) {
			count++;
			p = p.link;
		}
		System.out.println("Node의 개수는 : " + count + "개 입니다.");
	}
	public void replaceNode(String x, String y) {
		Node p;
		
		p = head;
		while(p != null)	{
			if(p.name.equals(x))	{
				p.name = y;
			}
			p = p.link;
		}
	}
	public void deleteNode(int key) {
		
	}
	public void printMiddle()	{
		Node p,q;
		
		p = head;
		q = head;
		while(p != null) {
			p = p.link;
			if(p != null)	{
				p = p.link;
				q = q.link;
			}
		}
		System.out.println("중간에 있는 Node는 : " + q.name);
	}
	public void reverse()	{
		Node p,q,r;
		
		p = head;
		q = null;
		r = null;
		tail = p;
		
		while(p != null)	{
			r = q;
			q = p;
			p = p.link;
			q.link = r;
		}
		head = q;
	}
	public void printNthFromLast(int n)	{
		Node p,q;
		int count = 0;
		
		p = head;
		q = head;
		while(count < n) {
			count++;
			p = p.link;
		}
		
		while(p.link != null) {
			p = p.link;
			q = q.link;
		}
		System.out.println("뒤에서 " + n + "번째에 있는 Node는 : " + q.name);
	}
	public void shift()	{
		Node p, q;
		
		p = head;
		q = null;
		
		while(p.link != null) {
			q = p;
			p = p.link;
		}
		p.link = head;
		q.link = null;
		head = p;
	}
	public void printNode()	{
		Node p = head;
		
		while(p != null)	{
			System.out.print(p.name + " ");
			p = p.link;
		}
		System.out.println();
	}
}

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList1 list1 = new LinkedList1();
		
		list1.addLast("점심");
		list1.addLast("저녁");
		list1.addFirst("아침");
		list1.printNode();
		list1.deleteFirst();
		list1.printNode();
		list1.deleteLast();
		list1.printNode();
		list1.getNumberOfNode();
		list1.addFirst("아침");
		list1.addLast("새벽");
		list1.addLast("저녁");
		list1.replaceNode("새벽", "저녁");
		list1.printNode();
		list1.deleteLast();
		list1.printNode();
		list1.printMiddle();
		list1.reverse();
		list1.printNode();
		list1.printNthFromLast(1);
		list1.shift();
		list1.printNode();
		
	}
}
