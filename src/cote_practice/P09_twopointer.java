package cote_practice;
// "10" 은 어떤 연속된 수의 합인가?(경우의 수 전부 출력) 
// 1 2 3 4

import java.util.Scanner;

public class P09_twopointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startpointer =1;
		int endpointer =1;
		int inputNum =0;
		Scanner sc = new Scanner(System.in);
		inputNum =sc.nextInt();
		int i=0;
		int j=0;
		int z=0;
		int cnt =0;
		int sum =startpointer;
		//int save[][];
		for(i=0; i<inputNum/2+1; i++) {
			if(sum<inputNum) {
				startpointer++;
				sum += startpointer;
			} else if(sum>inputNum) {
				sum -= endpointer;
				endpointer++;
			} else if(sum == inputNum) {
				startpointer++;
				sum += startpointer;
				
				cnt++;
				for(j=endpointer; j< startpointer; j++) {
					System.out.print(j
							+" ");
				}
				
				System.out.println();
			}
		}
		System.out.println("총 가짓수 : "+cnt);
	}

}
