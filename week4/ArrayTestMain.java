package week4;

class ArrayTest	{
	
	static void printArray(int arr[])	{
		System.out.print("배열을 출력합니다 : ");
		for(int i : arr)	{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void shiftArray(int arr[])	{
		int tmp [] = new int[arr.length];	
		tmp[0] = arr.length;
		for(int i = 1; i < arr.length; i ++) {
			tmp[i] = arr[i-1];
		}
	}
	static void shiftArray(int arr[], int n)	{
		int tmp[] = new int[n];
		for(int i = 0, j = arr.length-n; i < n; i++, j++) {
			tmp[i] = arr[j];		
		}
		for(int i = arr.length-n-1; i >= 0; i--)	{
			arr[i+n] = arr[i];
		}
		for(int i = 0; i < n; i++)	{
			arr[i] = tmp[i];
		}
	}
	static void reverseArray(int arr[])	{
		int reArr [] = new int [arr.length];
		
		for(int i = 0, j=reArr.length-1; i < reArr.length; i++, j--) {
			reArr[i] = arr[j];
		}
	}
	static void insertArray(int arr[], int n, int k)	{
		int rst[] = new int[arr.length+1];
		if(n == 0)	{
			rst[0] = k;
			for(int i = 1; i < rst.length; i++)	{
				rst[i] = arr[i-1];
			}
		} else {
			for(int i = 0; i < n; i++)	{
				rst[i] = arr[i];
			}
			rst[n] = k;
			for(int i = n+1; i < rst.length; i++)	{
				rst[i] = arr[i-1];
			}
		}
	}
	static void delArray(int arr[], int n) {
		int rst[] = new int[arr.length];
		
		if(n == 0)	{
			for(int i = 0; i < rst.length-1; i++)	{
				rst[i] = arr[i+1];
			}
			rst[arr.length-1] = 0;
		} else {
			for(int i = 0; i < n; i++)	{
				rst[i] = arr[i];
			}
			for(int i = n; i < rst.length-1; i++)	{
				rst[i] = arr[i+1];
			}
			rst[arr.length-1] = 0;
		}
	}
}
public class ArrayTestMain {
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5};
		
		ArrayTest.shiftArray(arr);
		ArrayTest.printArray(arr);
		ArrayTest.reverseArray(arr);
		ArrayTest.insertArray(arr,2,5);
		ArrayTest.delArray(arr, 2);
	}
}
