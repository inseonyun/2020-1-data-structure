package week4;

import java.util.Random;

public class Average {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int data [] = new int[100];
		int sum = 0;
		int count = 0;
		double avg;
		
		for(int i = 0; i < 100; i++)	{
			data[i] = rand.nextInt(100)+10;
			sum += data[i];
		}
		avg = (double) sum/100;
		System.out.println("Avg = " + avg);
		
		for(int i = 0; i < 100; i++)	{
			if(data[i] > avg)
				count++;
		}
		System.out.println(avg + "의 값보다 큰 수의 개수는 : " + count);
		
	}
}
