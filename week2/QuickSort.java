
import java.util.Random;
import java.util.Date;

public class QuickSort {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int r=10;
		int [] mynumber;
		mynumber= new int[r];

		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for(int i = 0, n = mynumber.length; i<n; i++) {
				mynumber[i] = rand.nextInt(n-1)+1;
				System.out.print(mynumber[i] + " ");
			}
			quick_sort(mynumber, 0, mynumber.length-1);
			output(mynumber);
			System.out.println("\n"+new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : " + diff);
		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
		
	}
	
	public static void quick_sort(int[] arr, int start, int end) {
		int left = start;
		int right = end;
		int pivot = arr[(left+right)/2];
		
		do {
			while(arr[left]<pivot) 
				left++;
			while(arr[right]>pivot)
				right--;
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}while(left <= right);
		
		if(start < right) 
			quick_sort(arr, start, right);
		if(end > left)
			quick_sort(arr, left, end);
	}
	public static void output(int[] arr) {
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
