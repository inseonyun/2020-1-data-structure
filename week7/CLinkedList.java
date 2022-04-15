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
			return "삭제할 역이 없음";
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
		System.out.println("2호선을 한바퀴돌 때 거리는 : " + total);
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
		rst = Math.abs(count1-count2)-1;//두 개의 역을 어떻게 해서 빼도 값은 같고 양수 음수로 나눠진다. 이를 절대값으로 구해준 뒤, 배열의 특성을 고려해 -1을 해주면 원하는 값이 나온다.
		System.out.println(n1 + "역에서 " + n2 + "역까지의 중간 역 개수는 : " + rst);
		
	}
	public void print()	{
		Station p = head;
		int count = 0;
		
		do {
			count++;
			System.out.print(" " + count + " " + p.name);
			p = p.clink;
		}while(p != head);
		System.out.println("\n2호선 역의 개수는 : " + count);
	}
}

public class CLinkedList {
	public static void main(String[] args) {
			CLinkedL c1 = new CLinkedL();
			
			c1.addLast("잠실", 5);
			c1.addLast("신천", 4);
			c1.addLast("종합운동장", 5);
			c1.addLast("삼성", 5);
			c1.addLast("선릉", 3);
			c1.addLast("역삼", 5);
			c1.addLast("강남", 2);
			c1.addLast("교대", 5);
			c1.addLast("서초", 7);
			c1.addLast("방배", 5);
			c1.addLast("사당", 3);
			c1.addLast("낙성대", 5);
			c1.addLast("서울대입구", 3);
			c1.addLast("봉천", 5);
			c1.addLast("신림", 7);
			c1.addLast("신대방", 5);
			c1.addLast("구로디지털단지", 5);
			c1.addLast("대림", 3);
			c1.addLast("신도림", 5);
			c1.addLast("문래", 5);
			c1.addLast("영등포구청", 3);
			c1.addLast("당산", 5);
			c1.addLast("합정", 3);
			c1.addLast("홍대입구", 3);
			c1.addLast("신촌", 5);
			c1.addLast("이대", 6);
			c1.addLast("충정로", 5);
			c1.addLast("시청", 5);
			c1.addLast("을지로입구", 5);
			c1.addLast("왕십리", 4);
			c1.addLast("성수", 5);
			c1.addLast("강변", 5);
			
			c1.print();
			System.out.println();
			System.out.println();
			
			c1.addNode("을지로입구", "을지로 4가", 3);
			c1.print();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println();
			c1.totalDist();
			System.out.println("삭제된 마지막 역 : " + c1.deleteLast());
			c1.print();
			c1.totalDist();
			c1.numberOfStation("구로디지털단지", "선릉");
			
		
			
			c1.addFirst("잠실본동");
			c1.print();
			
			System.out.println("삭제된 역은 : " + c1.deleteNode("구로디지털단지"));
			c1.print();
	}
}
