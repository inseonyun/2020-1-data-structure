package week7;

import java.util.LinkedList;

public class LinkedListUtil {
	public static void main(String[] args) {
		LinkedList<Integer> score = new LinkedList<Integer>();
		
		int sum = 0;
		int count = 0;
		int average = 0;
		
		score.add(80);
		score.addLast(95);
		score.add(72);
		score.addLast(83);
		score.addLast(57);
		
		for(Integer s1 : score) {
			System.out.print(s1 + " ");
			count++;
			sum += s1;
		}
		System.out.println();
		average = sum/count;
		System.out.println("원소들의 평균 값 : " + average);
	}
}
