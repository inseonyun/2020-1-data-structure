package week12_lab;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

class MyNode {
	int id;
	String name;
	int score;

	public MyNode(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
}

public class AverageDeque {
	public static void main(String args[]) {
		Deque<MyNode> deque1 = new LinkedList<MyNode>();
		MyNode node1 = new MyNode(1, "Kim", 88);
		MyNode node2 = new MyNode(2, "Lee", 90);
		MyNode node3 = new MyNode(3, "Park", 80);
		MyNode node4 = new MyNode(4, "Yoo", 60);
		MyNode node5 = new MyNode(5, "Jang", 92);
		MyNode node6 = new MyNode(6, "Cho", 95);
		MyNode node7 = new MyNode(7, "Lim", 70);
		MyNode node8 = new MyNode(8, "Koo", 65);
		MyNode node9 = new MyNode(9, "Son", 55);
		MyNode node10 = new MyNode(10, "Yun", 100);
		
		deque1.addFirst(node1);
		deque1.addLast(node2);
		deque1.addLast(node3);
		deque1.addLast(node4);
		deque1.addLast(node5);
		deque1.addLast(node6);
		deque1.addLast(node7);
		deque1.addLast(node8);
		deque1.addLast(node9);
		deque1.addLast(node10);
		
		int rst = 0;
		Iterator<MyNode> iterator = deque1.iterator();
		while(iterator.hasNext()) {
			MyNode tmpNode = iterator.next();
			rst += tmpNode.score;
			System.out.println("ID : " + tmpNode.id + ", Name : " + tmpNode.name + ", Score : " + tmpNode.score);
		}
		System.out.println("전체 학생들의 평균 : " + rst/10);
		Iterator<MyNode> iterator1 = deque1.descendingIterator();
		System.out.println("------------역순으로 출력합니다.--------------------");
		while(iterator1.hasNext()) {
			MyNode tmpNode1 = iterator1.next();
			System.out.println("ID : " + tmpNode1.id + ", Name : " + tmpNode1.name + ", Score : " + tmpNode1.score);
		}
	}
}
