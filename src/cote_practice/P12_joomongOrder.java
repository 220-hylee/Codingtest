package cote_practice;

import java.util.Arrays;
import java.util.Scanner;

public class P12_joomongOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("재료 갯수 : ");
		int inputNum = sc.nextInt();
		System.out.print("합성 타겟 : ");
		int inputTarget = sc.nextInt();
		int[] meterial = new int[inputNum];
		int temp = 0;
		int startpointer =0;
		int endpointer = meterial.length-1;
		int sum =0;
		int count =0;
		System.out.print("재료 종류 : ");
		for (int i = 0; i < meterial.length; i++) {
			meterial[i] = sc.nextInt();
//			for (int j = 0; j < i; j++) {
//
//				if (meterial[i] < meterial[j]) {
//					temp = meterial[i];
//					meterial[i] = meterial[j];
//					meterial[j] = temp;
//				}
//			}

		}
		Arrays.sort(meterial); // 오름차순 자동정렬
		
		for(int i=0; i<meterial.length; i++) {
			System.out.println(meterial[i]);
		}
		while(true) {
			if(startpointer>endpointer)
				break;     
			sum = meterial[startpointer]+ meterial[endpointer];
			if(sum == inputTarget) {
				count ++;
				sum =0;
				endpointer--;
				startpointer++;
			} else if(sum > inputTarget) {
				endpointer--;
			} else if(sum < inputTarget) {
				startpointer++;
			}
			sum =0;
			
		}
		System.out.println("가짓수 : " +count);

	}

}
