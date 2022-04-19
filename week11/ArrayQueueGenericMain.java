package week11;

class ArrayQueue<E>{
	Object [] q;
	int front, rear, size;
	
	public ArrayQueue()	{
		q = new Object[2];
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
	public void add(E name) {
		if ((rear + 1)%q.length == front) {
			resize(2*q.length);
		}
		rear = (rear + 1)%q.length;
		q[rear] = name;
		size++;
	}
	public E remove() {
		if(isEmpty()) {
			System.out.print("손님이 없습니다,");
			return null;
		}
		front = (front + 1) %q.length;
		Object item = q[front];
		q[front] = null;
		size --;
		if(size > 0 && size == q.length/4) {
			resize(q.length/2);
		}
		return (E)item;
	}
	private void resize(int re) {
		Object tmp[] = new Object[re];
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
	public E peek()	{
		if(isEmpty())	{
			return null;
		} else return (E)q[front+1];
	}
	public void queueSize()	{
		System.out.println("현재 손님의 수 : " + size);
	}
}

public class ArrayQueueGenericMain {
	public static void main(String[] args) {
		ArrayQueue<String> aq1 = new ArrayQueue<String>();
		aq1.add("Lee");
		aq1.add("Kim");
		aq1.add("Park");
		System.out.println("삭제된 원소 : "+aq1.remove());
		System.out.println("peek : " + aq1.peek());
		System.out.println("삭제된 원소 : "+aq1.remove());
		System.out.println("삭제된 원소 : "+aq1.remove());
		
		ArrayQueue<Student> aq2 = new ArrayQueue<Student>();
		Student st4 = new Student(2, "Lee"); //같은 패키지 안에 리스트큐제너릭 자바 파일에 스튜던트 클래스가 있어 배열큐제너릭자바에는 추가해주지 않았습니다.
		aq2.add(st4);
		Student tmpSt3 = aq2.remove();
		System.out.println(tmpSt3.id + " " + tmpSt3.name);
	}
}
