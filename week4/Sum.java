package week4;

import java.util.Random;
import java.util.Scanner;

public class Sum {
	public static int sum_arr(int b[], int n)	{
		int sum = 0;
		
		for(int i = 0; i < n; i++)	{
			sum += b[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�迭�� �� ���� ���� ���� �����ұ��? : ");
		int n = scan.nextInt();
		
		int a [] = new int[n];
		int rst;
		
		for(int i = 0; i < a.length; i++)	{
			a[i] = rand.nextInt(100)+1;
		}
		
		rst = sum_arr(a, a.length);
		
		System.out.print("�迭 a : ");
		for(int i : a)	{
			System.out.print(i + " ");
		}
		System.out.println("\n�迭�� ���� : " + rst);
		
	}
}
