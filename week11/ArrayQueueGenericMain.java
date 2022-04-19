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
		return (size == 0);	//���� ����, size�� 0�̸� true
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
			System.out.print("�մ��� �����ϴ�,");
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
			System.out.println("������ �մ��� �������� �ʽ��ϴ�.");
		}
		front = (front + 1) % q.length;
		q[front] = null;
		size--;
		if(size > 0 && size == q.length/4)	{
			resize(q.length/2);
		}
	}
	public void printQueue()	{
		System.out.print("���� ť : ");
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
		System.out.println("���� �մ��� �� : " + size);
	}
}

public class ArrayQueueGenericMain {
	public static void main(String[] args) {
		ArrayQueue<String> aq1 = new ArrayQueue<String>();
		aq1.add("Lee");
		aq1.add("Kim");
		aq1.add("Park");
		System.out.println("������ ���� : "+aq1.remove());
		System.out.println("peek : " + aq1.peek());
		System.out.println("������ ���� : "+aq1.remove());
		System.out.println("������ ���� : "+aq1.remove());
		
		ArrayQueue<Student> aq2 = new ArrayQueue<Student>();
		Student st4 = new Student(2, "Lee"); //���� ��Ű�� �ȿ� ����Ʈť���ʸ� �ڹ� ���Ͽ� ��Ʃ��Ʈ Ŭ������ �־� �迭ť���ʸ��ڹٿ��� �߰������� �ʾҽ��ϴ�.
		aq2.add(st4);
		Student tmpSt3 = aq2.remove();
		System.out.println(tmpSt3.id + " " + tmpSt3.name);
	}
}
