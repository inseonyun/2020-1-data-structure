package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <String> list1 = new ArrayList<String>();
		int n,count = 0;
		
		for(int i = 0; i < 10; i++)	{
			System.out.print("�̸��� �Է����ּ���(10��) : ");
			list1.add(scan.nextLine());
		}
		System.out.println("������ �迭 : " + list1);
		System.out.print("�� �� ���Ҹ� ����ұ��?? : ");
		n = scan.nextInt();
		System.out.println(n + "��° ���� �Դϴ� : " + list1.get(n));
		
		System.out.print("�� �� ���Ҹ� �����ұ��?? : ");
		n = scan.nextInt();
		
		list1.remove(n);
		System.out.println("����� ������ �迭 :" + list1);
		
		System.out.println("������ ������ : " + list1.size());
		
		System.out.println("������ ���� -3��°�� ���Ҵ� : " + list1.get(list1.size()-3));
		
		System.out.println("��� ���Ҹ� ����մϴ� : " + list1);
		
		System.out.print("���ҿ� Kim�� �ִ��� Ȯ���մϴ�. ��� : " + list1.contains("Kim"));
	}
}
