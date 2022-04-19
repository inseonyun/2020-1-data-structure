package week11;

class Guest <E>{
	Object name;
	Guest link;
}

class ListQueue<E> {
	Guest<E> front;
	Guest<E> rear;
	int count; //원소(손님) 수
	
	public ListQueue()	{
		front = null;
		rear = null;
		count = 0;
	}
	public boolean isEmpty()	{
		return (count == 0);	//원소(손님) 수가 0이면 true
	}
	public void enQueue(E x) {
		Guest<E> newNode = new Guest<E>();
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
	public E deQueue()	{
		if(count == 0) {
			System.out.print("손님이 없습니다.");
			return null;
		}
		E item = (E)front.name;
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count--;
		
		return item;
	}
	public void delete()	{
		if(count == 0)	{
			System.out.println("삭제할 손님이 없습니다.");
		}
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count --;
	}
	public E peek()	{
		if(front == null) {
			System.out.print("선두 원소가 없습니다.");
			return null;
		}else return (E)front.name;
	}
	public void printQueue()	{
		Guest tmp = front;
		System.out.print("현재의 큐 : ");
		while(tmp != null) {
			System.out.print(tmp.name + " ");
			tmp = tmp.link;
		}
		System.out.println();
	}
	public void queueSize()	{
		System.out.println("현재 원소 개수 : " + count);
	}
}
class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}
}
public class ListQueueGenericMain {
	public static void main(String[] args) {
		
		ListQueue<String> listq1 = new ListQueue<String>();
		listq1.enQueue("Lee");
		listq1.enQueue("Kim");
		listq1.enQueue("Park");
		System.out.println("삭제된 원소는 : " + listq1.deQueue());
		System.out.println("삭제된 원소는 : " + listq1.deQueue());
		System.out.println("삭제된 원소는 : " + listq1.deQueue());
		
		ListQueue<Integer> listq2 = new ListQueue<Integer>();
		listq2.enQueue(10);
		listq2.enQueue(20);
		listq2.enQueue(30);
		System.out.println("삭제된 원소는 : " + listq2.deQueue());
		System.out.println("삭제된 원소는 : " + listq2.deQueue());
		System.out.println("삭제된 원소는 : " + listq2.deQueue());
		
		Student st1 = new Student(1, "Kim");
		ListQueue<Student> listq3 = new ListQueue<Student>();
		listq3.enQueue(st1);
		Student tmpst1 = listq3.deQueue();
		System.out.println(tmpst1.id + " " + tmpst1.name);
		
	}
}
