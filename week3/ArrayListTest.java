package week3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		int n = 4;
		int myScore[] = {88, 95, 10, 20, 15, 22, 35};
		Arrays.sort(myScore);
		
		for(int i = 0; i < myScore.length; i++)	{
			System.out.print(" " + myScore[i]);
		}
		System.out.println();
		
		int key = 88;
		System.out.println(Arrays.binarySearch(myScore, key));
		
		/*
		ArrayList<Integer> studentScore = new ArrayList<Integer>(n);
		studentScore.add(90);
		studentScore.add(88);
		studentScore.add(75);
		studentScore.add(85);
		System.out.println(studentScore);
		
		studentScore.remove(3);
		System.out.println(studentScore);
		
		System.out.println(studentScore.get(2));
		
		for(int i = 0; i < studentScore.size(); i++)	{
			System.out.println(studentScore.get(i));
		}
		*/
	}
}
