package cote_practice;

import java.util.Scanner;

public class P01_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		int temp = 1;
		int cal = 0;
		//System.out.println(num);
		if (1 > num || num > 100) {
			return;
		}
		int inputNum = sc.nextInt();
		for (i = 1; i < num; i++) {
			temp *= 10;
			//System.out.println(temp);
		}
		
		if (inputNum >= (temp*10)) {
			return;
		}
		
		for (i = 0; i < num; i++) {
			cal = inputNum / temp;
			//System.out.println("cal : " + cal);
			sum = sum + cal;
			inputNum = inputNum % temp;
			temp /= 10;
		}
		System.out.println("sum :" + sum);
//		String num2 = sc.next();
//		char[] cNum = num2.toCharArray();
//		if (num != cNum.length) {
//			return;
//		}
//		for (i = 0; i < cNum.length; i++) {
//			sum = sum + cNum[i]-48;
//			System.out.println(sum);
//		}
//		System.out.println("total : " + sum);
	}

}
