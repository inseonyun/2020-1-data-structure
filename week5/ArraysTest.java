package week5;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {

	public static void binSrch(int k) {
		System.out.println("---------------------------");
		int Arr[] = {1, 5, 30, 22, 99, 4, 15};
		Arrays.sort(Arr); 
		System.out.println("����� binary search�Դϴ�. ã���ô� ���ڴ� : " + k + ", �� ���ڴ� ���⿡ �ֽ��ϴ� : " + Arrays.binarySearch(Arr, k));
	}

	public static void compTwoarray(int arr1[],int arr2[]) {
		System.out.println("---------------------------");
		System.out.print("����� compare �Դϴ�.");
		
		System.out.println("compare�� �� �迭�� ��� : " + Arrays.compare(arr1, arr2));
	}
	
	public static void equalsArray(int earr1[], int earr2[]) {
		System.out.println("---------------------------");
		System.out.print("����� equals�Դϴ�. ");
		
		System.out.println("\n�� �迭�� ����մϴ�.");
		System.out.println("earr1�� �迭�Դϴ�" + Arrays.toString(earr1));
		System.out.println("earr2�� �迭�Դϴ�" + Arrays.toString(earr2));
		System.out.print("��� : ");
		
		if(Arrays.equals(earr1, earr2))
			System.out.println("�� �迭�� �����ϴ�.");
		else System.out.println("�� �迭�� ���� �ʽ��ϴ�.");
	}
	
	public static void sort(int Sarr[]) {
		System.out.println("---------------------------");
		System.out.print("����� sort�Դϴ�. ");
		System.out.print("������ �迭�Դϴ� : " + Arrays.toString(Sarr));
		Arrays.sort(Sarr);
		System.out.println(", ���ĵ� �迭�Դϴ� : " + Arrays.toString(Sarr));
	}

	static void sortMatrix(int Marr[][]) {
		int temp[] = new int[Marr.length * Marr[0].length];
		int k = 0;
		System.out.println("---------------------------");
		System.out.println("������ 2���� �迭�Դϴ�.");
		printMat(Marr);
		for (int i = 0; i < Marr.length; i++)
			for (int j = 0; j < Marr[i].length; j++)
				temp[k++] = Marr[i][j];
		System.out.println("2���� �迭�� 1���� �迭�� ��������ϴ� : " + Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println("1���� �迭�� ������ ����Դϴ� : " + Arrays.toString(temp));
		k = 0;
		for (int i = 0; i < Marr.length; i++)
			for (int j = 0; j < Marr[i].length; j++)
				Marr[i][j] = temp[k++];
		System.out.println("���ĵ� 2���� �迭�Դϴ�.");
		printMat(Marr);
	}

	static void printMat(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	public static void to_String(int arr[]) {
		System.out.println("---------------------------");
		System.out.print("����� to_String�Դϴ�.");
        System.out.print("�迭�� ����մϴ� : ");
		
		for(int i = 0; i < arr.length; i++)	{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n�ش� �迭�� �����մϴ�.");
		sort(arr);

	}
	public static void main(String args[]) {
		Random rand = new Random();
		
		int arr1[] = {1, 5, 10, 15};
		int arr2[] = {1, 5, 10, 15};
		
		int earr1[] = new int[5];
		int earr2[] = new int[5];

		int Sarr[] = new int[10];
		
		int Marr[][] = new int[3][3];
		
		int toStringArr[] = new int[10];
		
		//equals�� ���� �迭 �����
		for(int i = 0; i < earr1.length; i++) {
			earr1 [i] = rand.nextInt(100)+1;
			earr2 [i] = rand.nextInt(100)+1;
		}
		//sort�� ���� ������ �迭�� to_String�� ���� �迭 �����
		for(int i = 0; i < Sarr.length; i++) {
			Sarr [i] = rand.nextInt(50)+1;
			toStringArr[i] = rand.nextInt(100)+1;
		}
		//sortMatrix�� ���� ������ �迭 �����
		for(int i = 0; i < Marr.length; i++)	{
			for(int j = 0; j < Marr[i].length; j++)	{
				Marr[i][j] = rand.nextInt(10)+1;
			}
		}
		//to_String���� ���� ������ �迭 �����
		
	
		/**
		 Arrays���� binary search (����Ž��)�� ����Ͽ� Ű�� ã�ƶ�.
		 */
		binSrch(15);

		/**
		 �� ���� �迭�� ������ ���Ѵ�.
		 */
		compTwoarray(arr1, arr2);
		/**
		 * �� �迭�� ������ ���Ѵ�. Arrays.equals�� ����Ѵ�.
		 */
		equalsArray(earr1, earr2);
		/**
		 * �迭�� ���Ҹ� �����Ѵ�.
		 */
		sort(Sarr);

		/**
		 * matrix ���� ������ �����Ѵ�.
		 */
		sortMatrix(Marr);
		/**
		 *  �迭�� ������ ���ڿ��� �����غ���
		 */
		to_String(toStringArr);

	}
}