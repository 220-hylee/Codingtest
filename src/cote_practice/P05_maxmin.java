package cote_practice;

import java.util.Scanner;

public class P05_maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int inputNum1 = 0;
		int inputNum2 = 0;
		int calMin = 1; // 최소공배수
		int calMax = 1;// 최대공약수
		int max = 0; // 두수중 큰수
		System.out.print("두 수를 입력하세요 >>");
		inputNum1 = sc.nextInt();
		inputNum2 = sc.nextInt();
		max = inputNum2;
		if (inputNum1 > inputNum2)
			max = inputNum1;

		for (int i = 1; i <= max; i++) {
			if (inputNum1 % i == 0 && inputNum2 % i == 0) {
				calMin = calMin * i;
				inputNum1 = inputNum1 / i;
				inputNum2 = inputNum2 / i;
			}

		}
		calMax = calMin * inputNum1*inputNum2;
		System.out.println("최대공약수 : "+calMin);
		System.out.println("최소공배수 : "+calMax);

	}

}
