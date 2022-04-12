package week4;

import java.util.Random;
import java.util.Scanner;

public class Max {
	public static int Maximum(int fdata[], int n)	{
		int fmax = fdata[0];
		
		for(int i = 0; i < n; i++)	{
			if(fdata[i] > fmax)
				fmax = fdata[i];
		}
		return fmax;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�� ���� ���� �迭�� �����ұ��? : ");
		int n = scan.nextInt();
		
		int data[] = new int [n];
		int max;
		
		for(int i = 0; i < n; i++)	{
			data[i] = rand.nextInt(1000)%50;
		}
		
		System.out.print("�迭�� �ִ� ���� : ");
		for(int i : data)	{
			System.out.print(i + " ");
		}
		max = Maximum(data, n);
		
		System.out.println("\n�ִ밪�� : " + max);
	}
}
