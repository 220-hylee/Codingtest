package cote_practice;

import java.util.Scanner;

public class P02_ave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// int input[] = null;

		int i = 0;
		int sum = 0;
		double ave = 0;
		double temp = 0;
		int max = 0;
		// System.out.println(count);
		int[] input = new int[count];
		for (i = 0; i < count; i++) {
			input[i] = sc.nextInt();
			if (max < input[i])
				max = input[i];

		}
		// System.out.println(max);
		i = 0;
		for (i = 0; i < count; i++) {

			temp = (double) input[i] / max * 100;
			// System.out.println(input[i]);
			sum += temp;

		}
		ave = (double) sum / count;
		System.out.println(ave);
	}

}
