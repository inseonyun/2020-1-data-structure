package week5;

class Node{
	String name;
	Node link;
	
	public Node(String name)	{
		this.name = name;
	}
}
class CLinkedList	{
	Node head;
	
	public void addFirst(String name)	{
		Node newNode = new Node(name);
		if(head == null)	{
			head = newNode;
		} else {
			Node p = head;
			do	{
				p = p.link;
			}while(p.link != head);
			newNode.link = p.link;
			p.link = newNode;
			head = newNode;
		}
	}
	public void addLast(String name)	{
		Node newNode = new Node(name);
		if(head == null)	{
			head = newNode;
			newNode.link = head;
		} else {
			Node p = head;
			do {
				p = p.link;
			} while(p.link != head);
			p.link = newNode;
			newNode.link = head;
		}
	}
	public void deleteLast1(int n) {
		int num = 0;
		Node q = null;
		Node p = head.link;
		Node p1 = head;
		
		while(p.link != null) {
			if(num == n)	{
				q.link = p1.link;
				p1.link = null;
				break;
			}
			else {
				q = p1;
				p = p.link;
				p1 = p1.link;
				num++;
			}
		}
	}
	public void print()	{
		Node p = head;
		int count = 0;
		do {
			count++;
			System.out.print(" " + p.name);
			p = p.link;
		} while(p != head);
		System.out.println("\n원소 개수 : " + count);
	}
}
public class LinkedListBasic {
	public static void main(String[] args) {
		CLinkedList list2 = new CLinkedList();
		
		list2.addLast("apple");
		list2.addLast("strawberry");
		list2.addLast("orange");
		list2.addLast("banana");
		list2.addLast("melon");
		list2.print();
		list2.deleteLast1(2);
		list2.print();
		list2.addFirst("pineapple");
		list2.print();
	}
}
