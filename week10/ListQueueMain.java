package week10;

class Guest {
	String name;
	Guest link;
}

class ListQueue {
	Guest front;
	Guest rear;
	int count; //����(�մ�) ��
	
	public ListQueue()	{
		front = null;
		rear = null;
		count = 0;
	}
	public boolean isEmpty()	{
		return (count == 0);	//����(�մ�) ���� 0�̸� true
	}
	public void enQueue(String x) {
		Guest newNode = new Guest();
		newNode.name = x;
		newNode.link = null;
		if(count == 0) {
			front = rear = newNode;
		}else {
			rear.link = newNode;
			rear = newNode;
		}
		count++;
	}
	public String deQueue()	{
		if(count == 0) {
			return "�մ��� �����ϴ�.";
		}
		String item = front.name;
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count--;
		
		return item;
	}
	public void delete()	{
		if(count == 0)	{
			System.out.println("������ �մ��� �����ϴ�.");
		}
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count --;
	}
	public String peek()	{
		if(front == null) {
			return "���� ���Ұ� �����ϴ�.";
		}else return front.name;
	}
	public void printQueue()	{
		Guest tmp = front;
		System.out.print("������ ť : ");
		while(tmp != null) {
			System.out.print(tmp.name + " ");
			tmp = tmp.link;
		}
		System.out.println();
	}
	public void queueSize()	{
		System.out.println("���� ���� ���� : " + count);
	}
}

public class ListQueueMain {
	public static void main(String[] args) {
		ListQueue listq1 = new ListQueue();
		
		listq1.enQueue("Kim");
		listq1.enQueue("Lee");
		listq1.enQueue("Park");
		listq1.enQueue("foa");
		listq1.enQueue("fiva");
		listq1.enQueue("sia");
		listq1.enQueue("sea");
		listq1.enQueue("eia");
		listq1.enQueue("nia");
		listq1.enQueue("tea");
		
		listq1.printQueue();									//���� ť�� ���� ���
		listq1.queueSize();										//ť�� ũ�� size ���
		System.out.println("ù��° ���� peek : " + listq1.peek());	//���� ���� Ȯ��
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		listq1.printQueue();									//kim�� ������ ���� ����
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		System.out.println("������ ���Ҵ� : " + listq1.deQueue());	//���� ���� ���� �� ������ ���� ���
		listq1.printQueue();
		System.out.println("ù��° ���� peek : " + listq1.peek());
		listq1.queueSize();
		
	}
}
