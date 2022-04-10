import java.util.Random;
import java.util.Date;

public class BubbleSort {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = 10;
		int [] arr;
		arr = new int[r];
		
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for(int i=0; i<arr.length; i++) {
				arr[i] = rand.nextInt(r-1)+1;
				System.out.print(arr[i]+" ");
			}
			bubble_sort(arr);
			System.out.println();
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println("\n"+new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : " + diff);
		} catch(Exception e) {
			System.out.println("An exception occurs");
		}
		
	}
	public static void bubble_sort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
	}
}