package week5;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {

	public static void binSrch(int k) {
		System.out.println("---------------------------");
		int Arr[] = {1, 5, 30, 22, 99, 4, 15};
		Arrays.sort(Arr); 
		System.out.println("여기는 binary search입니다. 찾으시는 숫자는 : " + k + ", 그 숫자는 여기에 있습니다 : " + Arrays.binarySearch(Arr, k));
	}

	public static void compTwoarray(int arr1[],int arr2[]) {
		System.out.println("---------------------------");
		System.out.print("여기는 compare 입니다.");
		
		System.out.println("compare한 두 배열의 결과 : " + Arrays.compare(arr1, arr2));
	}
	
	public static void equalsArray(int earr1[], int earr2[]) {
		System.out.println("---------------------------");
		System.out.print("여기는 equals입니다. ");
		
		System.out.println("\n두 배열을 출력합니다.");
		System.out.println("earr1의 배열입니다" + Arrays.toString(earr1));
		System.out.println("earr2의 배열입니다" + Arrays.toString(earr2));
		System.out.print("결과 : ");
		
		if(Arrays.equals(earr1, earr2))
			System.out.println("두 배열은 같습니다.");
		else System.out.println("두 배열은 같지 않습니다.");
	}
	
	public static void sort(int Sarr[]) {
		System.out.println("---------------------------");
		System.out.print("여기는 sort입니다. ");
		System.out.print("원래의 배열입니다 : " + Arrays.toString(Sarr));
		Arrays.sort(Sarr);
		System.out.println(", 정렬된 배열입니다 : " + Arrays.toString(Sarr));
	}

	static void sortMatrix(int Marr[][]) {
		int temp[] = new int[Marr.length * Marr[0].length];
		int k = 0;
		System.out.println("---------------------------");
		System.out.println("원래의 2차원 배열입니다.");
		printMat(Marr);
		for (int i = 0; i < Marr.length; i++)
			for (int j = 0; j < Marr[i].length; j++)
				temp[k++] = Marr[i][j];
		System.out.println("2차원 배열을 1차원 배열로 만들었습니다 : " + Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println("1차원 배열을 정렬한 결과입니다 : " + Arrays.toString(temp));
		k = 0;
		for (int i = 0; i < Marr.length; i++)
			for (int j = 0; j < Marr[i].length; j++)
				Marr[i][j] = temp[k++];
		System.out.println("정렬된 2차원 배열입니다.");
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
		System.out.print("여기는 to_String입니다.");
        System.out.print("배열을 출력합니다 : ");
		
		for(int i = 0; i < arr.length; i++)	{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n해당 배열을 정렬합니다.");
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
		
		//equals로 보낼 배열 만들기
		for(int i = 0; i < earr1.length; i++) {
			earr1 [i] = rand.nextInt(100)+1;
			earr2 [i] = rand.nextInt(100)+1;
		}
		//sort로 보낼 랜덤수 배열과 to_String에 보낼 배열 만들기
		for(int i = 0; i < Sarr.length; i++) {
			Sarr [i] = rand.nextInt(50)+1;
			toStringArr[i] = rand.nextInt(100)+1;
		}
		//sortMatrix로 보낼 랜덤수 배열 만들기
		for(int i = 0; i < Marr.length; i++)	{
			for(int j = 0; j < Marr[i].length; j++)	{
				Marr[i][j] = rand.nextInt(10)+1;
			}
		}
		//to_String으로 보낼 랜덤수 배열 만들기
		
	
		/**
		 Arrays내의 binary search (이진탐색)을 사용하여 키를 찾아라.
		 */
		binSrch(15);

		/**
		 두 개의 배열이 같은지 비교한다.
		 */
		compTwoarray(arr1, arr2);
		/**
		 * 두 배열이 같은지 비교한다. Arrays.equals을 사용한다.
		 */
		equalsArray(earr1, earr2);
		/**
		 * 배열의 원소를 정렬한다.
		 */
		sort(Sarr);

		/**
		 * matrix 내의 값들을 정렬한다.
		 */
		sortMatrix(Marr);
		/**
		 *  배열의 내용을 문자열로 리턴해보라
		 */
		to_String(toStringArr);

	}
}