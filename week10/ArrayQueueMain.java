package week10;

class ArrayQueue{
	String [] q;
	int front, rear, size;
	
	public ArrayQueue()	{
		q = new String[2];
		front = 0;
		rear = 0;
		size = 0;
	}
	public int queuesize()	{
		return size;
	}
	public boolean isEmpty()	{
		return (size == 0);	//원소 갯수, size가 0이면 true
	}
	public void add(String name) {
		if ((rear + 1)%q.length == front) {
			resize(2*q.length);
		}
		rear = (rear + 1)%q.length;
		q[rear] = name;
		size++;
	}
	public String remove() {
		if(isEmpty()) {
			return "손님이 없습니다,";
		}
		front = (front + 1) %q.length;
		String item = q[front];
		q[front] = null;
		size --;
		if(size > 0 && size == q.length/4) {
			resize(q.length/2);
		}
		return item;
	}
	private void resize(int re) {
		String tmp[] = new String[re];
		for(int i = 1, j = front+1; i <= size; i++, j++) {
			tmp[i] = q[j%q.length];
		}
		front = 0;
		rear = size;
		q = tmp;
	}
	public void delete()	{
		if(isEmpty())	{
			System.out.println("삭제할 손님이 존재하지 않습니다.");
		}
		front = (front + 1) % q.length;
		q[front] = null;
		size--;
		if(size > 0 && size == q.length/4)	{
			resize(q.length/2);
		}
	}
	public void printQueue()	{
		System.out.print("현재 큐 : ");
		for(int i = 1; i < q.length; i++) {
			if(q[i] != null)
				System.out.print(q[i] + " ");
		}
		System.out.println();
	}
	public String peek()	{
		if(isEmpty())	{
			return "손님이 없습니다.";
		} else return q[front+1];
	}
	public void queueSize()	{
		System.out.println("현재 손님의 수 : " + size);
	}
}

public class ArrayQueueMain {
	public static void main(String[] args) {
		ArrayQueue aq1 = new ArrayQueue();
		
		aq1.add("Lee");
		aq1.add("Kim");
		aq1.add("Park");
		aq1.add("fo");
		aq1.add("fiva");
		aq1.add("sia");
		aq1.add("sea");
		aq1.add("eia");
		aq1.add("nia");
		aq1.add("tea");
		aq1.printQueue();
		aq1.queueSize();
		System.out.println("첫번째 손님 : " + aq1.peek());
		System.out.println("삭제된 손님 : " + aq1.remove());	//remove는 삭제한 손님을 반환해줌
		aq1.printQueue();	//삭제된 큐의 상태
		aq1.queueSize(); //삭제된 큐의 사이즈 상태
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.delete(); //큐가 비워질 때까지 계속 지움
		aq1.printQueue(); // 큐의 상태 확인
		aq1.queueSize(); //큐의 size 상태 확인
		
	}
}
