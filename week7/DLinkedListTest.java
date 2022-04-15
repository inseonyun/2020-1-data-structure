package week7;

import java.util.LinkedList;

public class DLinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Kim");
		obj.add("Lee");
		obj.addLast("park");
		obj.addFirst("Yun");
		obj.add(2,"Ryu");
		obj.add("shin");
		obj.add("Jang");
		obj.add("Yang");
		
		System.out.println("���� ����Ʈ : " + obj);
		
		obj.remove("park");
		System.out.println("park�� ������ ���� ���Ḯ��Ʈ : " + obj);
		obj.remove(3);
		System.out.println("3��° ���Ҹ� ������ ���� ���Ḯ��Ʈ : " + obj);
		obj.removeFirst();
		System.out.println("ù��° ���Ҹ� ������ ���� ���Ḯ��Ʈ : " + obj);
		obj.removeLast();
		System.out.println("������ ���Ҹ� ������ ���� ���Ḯ��Ʈ : " + obj);
		
		boolean status = obj.contains("Yun");
		
		if(status)
			System.out.println("���Ḯ��Ʈ�� 'Yun'�� �ֽ��ϴ�.");
		else System.out.println("���Ḯ��Ʈ�� Yun�� �����ϴ�.");
		
		int size = obj.size();
		System.out.println("���Ḯ��Ʈ�� ���� ���� : " + size);
		
		Object element = obj.get(2);
		System.out.println("2��° ������Ʈ�� �޾ƿԽ��ϴ� : " + element);
		obj.set(3, "Jin");
		System.out.println("3��° ���Ҹ� Jin���� �ٲ���ϴ� : " + obj);
	}
}
