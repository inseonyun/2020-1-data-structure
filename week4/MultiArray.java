package week4;

public class MultiArray {
	public static void main(String[] args) {
		int arr [][] = new int [4][5];
		int num = 1;
		
		for(int i = 0; i < 3; i++)	{
			for(int j=0; j < 4; j++)	{
				arr[i][j] = num;
				arr[i][4] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][4] += arr[i][j];
				num++;
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
