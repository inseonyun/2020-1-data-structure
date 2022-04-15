package week7;

class Station	{
	String name;
	int dist;
	Station clink;
	
	public Station(String name, int x) {
		this.name = name;
		dist = x;
	}
}
class CLinkedL	{
	Station head;
	
	public void addFirst(String name)	{
		Station newStation = new Station(name,5);
		if(head == null)	{
			head = newStation;
		} else {
			Station p = head;
			do	{
				p = p.clink;
			}while(p.clink != head);
			newStation.clink = p.clink;
			p.clink = newStation;
			head = newStation;
		}
	}
	
	public void addLast(String name, int x) {
		Station newStation = new Station(name, x);
		
		if(head == null) {
			head = newStation;
			newStation.clink = head;
		} else {
			Station p = head;
			do {
				p = p.clink;
			}while(p.clink != head);
			p.clink = newStation;
			newStation.clink = head;
		}
	}
	public void addNode(String name1, String name2, int x)	{
		Station newStation = new Station(name2, x);
		
		if(head == null)	{
			head = newStation;
		} else {
			Station p = head;
			Station q = null;
			do {
				if(p.name.equals(name1)) {
					q = p.clink;
					p.clink = newStation;
					newStation.clink = q;
					break;
				}
				p = p.clink;
			}while(p.clink != head);
			
			
		}
		
	}
	public String deleteLast()	{
		Station q = null;
		Station p = head;
		
		if(p == null)	{
			return "������ ���� ����";
		} 
		do {
			q = p;
			p = p.clink;
		}while(p.clink != head);
		q.clink = p.clink;
		
		return p.name;
	}
	public String deleteNode(String name)	{
		Station p = head;
		Station q = null;
		do {
			if(p.name.equals(name)) {
				break;
			}
			else {
				q = p;
				p = p.clink;
			}
		}while(p.clink != head);
		q.clink = p.clink;
		
		return p.name;
	}
	public void totalDist()	{
		Station p = head;
		int total = 0;
		
		do {
			total += p.dist;
			p = p.clink;
		}while(p != head);
		System.out.println("2ȣ���� �ѹ����� �� �Ÿ��� : " + total);
	}
	public void numberOfStation(String n1, String n2)	{
		Station p,q;
		p = head;
		q = head;
		int count1 = 0, count2 = 0, rst = 0;
		
		while(p != null)	{
			count1++;
			if(p.name.equals(n1))	{
				break;
			}
			p = p.clink;
		}
		while(q != null)	{
			count2++;
			if(q.name.equals(n2))	{
				break;
			}
			q = q.clink;
		}
		rst = Math.abs(count1-count2)-1;//�� ���� ���� ��� �ؼ� ���� ���� ���� ��� ������ ��������. �̸� ���밪���� ������ ��, �迭�� Ư���� ����� -1�� ���ָ� ���ϴ� ���� ���´�.
		System.out.println(n1 + "������ " + n2 + "�������� �߰� �� ������ : " + rst);
		
	}
	public void print()	{
		Station p = head;
		int count = 0;
		
		do {
			count++;
			System.out.print(" " + count + " " + p.name);
			p = p.clink;
		}while(p != head);
		System.out.println("\n2ȣ�� ���� ������ : " + count);
	}
}

public class CLinkedList {
	public static void main(String[] args) {
			CLinkedL c1 = new CLinkedL();
			
			c1.addLast("���", 5);
			c1.addLast("��õ", 4);
			c1.addLast("���տ��", 5);
			c1.addLast("�Ｚ", 5);
			c1.addLast("����", 3);
			c1.addLast("����", 5);
			c1.addLast("����", 2);
			c1.addLast("����", 5);
			c1.addLast("����", 7);
			c1.addLast("���", 5);
			c1.addLast("���", 3);
			c1.addLast("������", 5);
			c1.addLast("������Ա�", 3);
			c1.addLast("��õ", 5);
			c1.addLast("�Ÿ�", 7);
			c1.addLast("�Ŵ��", 5);
			c1.addLast("���ε����д���", 5);
			c1.addLast("�븲", 3);
			c1.addLast("�ŵ���", 5);
			c1.addLast("����", 5);
			c1.addLast("��������û", 3);
			c1.addLast("���", 5);
			c1.addLast("����", 3);
			c1.addLast("ȫ���Ա�", 3);
			c1.addLast("����", 5);
			c1.addLast("�̴�", 6);
			c1.addLast("������", 5);
			c1.addLast("��û", 5);
			c1.addLast("�������Ա�", 5);
			c1.addLast("�սʸ�", 4);
			c1.addLast("����", 5);
			c1.addLast("����", 5);
			
			c1.print();
			System.out.println();
			System.out.println();
			
			c1.addNode("�������Ա�", "������ 4��", 3);
			c1.print();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println();
			c1.totalDist();
			System.out.println("������ ������ �� : " + c1.deleteLast());
			c1.print();
			c1.totalDist();
			c1.numberOfStation("���ε����д���", "����");
			
		
			
			c1.addFirst("��Ǻ���");
			c1.print();
			
			System.out.println("������ ���� : " + c1.deleteNode("���ε����д���"));
			c1.print();
	}
}
