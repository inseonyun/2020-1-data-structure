package week4;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    static void search(int [] input, int x){

        for (int i = 0; i <input.length ; i++) {
            if(x==input[i]) {
                System.out.println("Element " + x + " is found at index: " + i);
                return;
            }
        }
        if(x == 0)
        	System.out.println("0�� �Է¹޾ҽ��ϴ�. ���α׷��� �����մϴ�.");
        else System.out.println("Element " + x + " is not found in array");
        
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Random rand = new Random();
    	
    	int n;
    	int x;
    	
    	System.out.print("�� ���� ���� ������??? : ");
    	n = scan.nextInt();
    	
    	int input[] = new int[n];
    	
    	System.out.print("�迭 �ȿ��� : ");
    	for(int i = 0; i < n; i++)	{
    		input[i] = rand.nextInt(100)+1;
    		System.out.print(input[i] + " ");
    	}
    	System.out.print("�� ������ �ֽ��ϴ�.\n");
    	
    	do{
    		System.out.print("ã�� ���� ���ڸ� �Է����ּ��� (���α׷� ���� : 0 �Է�): ");
    		x = scan.nextInt();
    		search(input, x);
    	}while(x != 0);
    
    }
}