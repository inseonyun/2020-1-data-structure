package week10;

class Guest {
	String name;
	Guest link;
}

class ListQueue {
	Guest front;
	Guest rear;
	int count; //원소(손님) 수
	
	public ListQueue()	{
		front = null;
		rear = null;
		count = 0;
	}
	public boolean isEmpty()	{
		return (count == 0);	//원소(손님) 수가 0이면 true
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
			return "손님이 없습니다.";
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
			System.out.println("삭제할 손님이 없습니다.");
		}
		front = front.link;
		if(front == null) {
			rear = null;
		}
		count --;
	}
	public String peek()	{
		if(front == null) {
			return "선두 원소가 없습니다.";
		}else return front.name;
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
		
		listq1.printQueue();									//현재 큐의 상태 출력
		listq1.queueSize();										//큐의 크기 size 출력
		System.out.println("첫번째 원소 peek : " + listq1.peek());	//선두 원소 확인
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		listq1.printQueue();									//kim이 삭제된 후의 상태
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		System.out.println("삭제된 원소는 : " + listq1.deQueue());	//선두 원소 삭제 후 삭제한 원소 출력
		listq1.printQueue();
		System.out.println("첫번째 원소 peek : " + listq1.peek());
		listq1.queueSize();
		
	}
}
