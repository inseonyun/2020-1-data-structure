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
		
		System.out.println("연결 리스트 : " + obj);
		
		obj.remove("park");
		System.out.println("park를 삭제한 뒤의 연결리스트 : " + obj);
		obj.remove(3);
		System.out.println("3번째 원소를 삭제한 뒤의 연결리스트 : " + obj);
		obj.removeFirst();
		System.out.println("첫번째 원소를 삭제한 뒤의 연결리스트 : " + obj);
		obj.removeLast();
		System.out.println("마지막 원소를 삭제한 뒤의 연결리스트 : " + obj);
		
		boolean status = obj.contains("Yun");
		
		if(status)
			System.out.println("연결리스트에 'Yun'이 있습니다.");
		else System.out.println("연결리스트에 Yun이 없습니다.");
		
		int size = obj.size();
		System.out.println("연결리스트의 원소 개수 : " + size);
		
		Object element = obj.get(2);
		System.out.println("2번째 오브젝트를 받아왔습니다 : " + element);
		obj.set(3, "Jin");
		System.out.println("3번째 원소를 Jin으로 바꿨습니다 : " + obj);
	}
}
