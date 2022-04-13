package week5;

public class MoveZero {
	static void pushZeroToEnd(int arr[], int n)	{
		int index = 0;
		
		for(int i = 0; i < n; i++)	{
			if(arr[i] != 0)	{
				arr[index] = arr[i];
				index++;
			}
		}
		while(index < n)	{
			arr[index] = 0;
			index++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = arr.length;
		pushZeroToEnd(arr,n);
		System.out.println("Array after pushing zeros to the back : ");
		for(int rst : arr)
			System.out.print(rst + ", ");
	}
}
