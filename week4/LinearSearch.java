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
        	System.out.println("0을 입력받았습니다. 프로그램을 종료합니다.");
        else System.out.println("Element " + x + " is not found in array");
        
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Random rand = new Random();
    	
    	int n;
    	int x;
    	
    	System.out.print("몇 개의 수를 만들까요??? : ");
    	n = scan.nextInt();
    	
    	int input[] = new int[n];
    	
    	System.out.print("배열 안에는 : ");
    	for(int i = 0; i < n; i++)	{
    		input[i] = rand.nextInt(100)+1;
    		System.out.print(input[i] + " ");
    	}
    	System.out.print("의 수들이 있습니다.\n");
    	
    	do{
    		System.out.print("찾고 싶은 숫자를 입력해주세요 (프로그램 종료 : 0 입력): ");
    		x = scan.nextInt();
    		search(input, x);
    	}while(x != 0);
    
    }
}