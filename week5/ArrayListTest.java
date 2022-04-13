package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <String> list1 = new ArrayList<String>();
		int n,count = 0;
		
		for(int i = 0; i < 10; i++)	{
			System.out.print("이름을 입력해주세요(10명) : ");
			list1.add(scan.nextLine());
		}
		System.out.println("현재의 배열 : " + list1);
		System.out.print("몇 번 원소를 출력할까요?? : ");
		n = scan.nextInt();
		System.out.println(n + "번째 원소 입니다 : " + list1.get(n));
		
		System.out.print("몇 번 원소를 삭제할까요?? : ");
		n = scan.nextInt();
		
		list1.remove(n);
		System.out.println("변경된 현재의 배열 :" + list1);
		
		System.out.println("원소의 개수는 : " + list1.size());
		
		System.out.println("원소의 개수 -3번째의 원소는 : " + list1.get(list1.size()-3));
		
		System.out.println("모든 원소를 출력합니다 : " + list1);
		
		System.out.print("원소에 Kim이 있는지 확인합니다. 결과 : " + list1.contains("Kim"));
	}
}
