package week7;

class Node	{
	String name;
	Node link;
	
	public Node(String n)	{
		name = n;
	}
}

class DLinkedList	{
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
	public void addNode(String name1, String name2) {
		Node newNode = new Node(name2);
		
		if(head == null) {
			head = newNode;
		} else	{
			Node p = head;
			Node q = null;
			do {
				if(p.name.equals(name1)) {
					q = p.link;
					p.link = newNode;
					newNode.link = q;
					break;
				}
				p = p.link;
			}while(p.link != head);
			
		}
	}
	public int findData(String name)	{
		Node p = head;
		int count = 0;
		
		do {
			if(p.name.equals(name))	{
				break;
			}
			count++;
			p = p.link;
		}while(p != null);
		
		return count;
	}

	public void deleteNode(String name) {
		Node q,p = head;
		q = null;
		
		while(p.link != null){ 
			if(p.name.equals(name))
				break; 
			q = p; 
			p = p.link;
		}
		q.link=p.link; 
		
		
	}

	public void printNode()	{
		Node p = head;
		
		while(p != null)	{
			System.out.print(p.name + " ");
			p = p.link;
		}
		System.out.println();
	}
	public void print()	{
		Node p,q,r,p1,rst;
		
		p = head;
		p1 = head;
		q = null;
		r = null;
		tail = p1;
		
		while(p != null)	{
			System.out.print(p.name + " ");
			p = p.link;
		}	
		while(p1 != null)	{
			r = q;
			q = p1;
			p1 = p1.link;
			q.link = r;
		}
		head = q;
		rst = head;
		System.out.println();
		while(rst != null)	{
			System.out.print(rst.name + " ");
			rst = rst.link;
		}	
	}
}
public class DLinkedListMain {
	public static void main(String[] args) {
		DLinkedList d1 = new DLinkedList();
		
		d1.addLast("Kim");
		d1.addLast("Ko");
		d1.addLast("Lee");
		d1.addLast("Park");
		d1.addFirst("Oh");
		
		d1.printNode();
		
		System.out.println("Ko는 몇 번째 index에 있는가? : "+ d1.findData("Ko"));
		
		d1.addNode("Kim", "Son");
		d1.printNode();
		
		d1.deleteNode("Lee");
		d1.printNode();
		
		
		d1.print();
	}
}
