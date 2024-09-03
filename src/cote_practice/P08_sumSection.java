package cote_practice;

import java.util.Scanner;

public class P08_sumSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputSize = sc.nextInt();
		int count = sc.nextInt();
		int start = 0;
		int last = 0;
		int[] arr;
		int i = 0;
		arr = new int[inputSize];
		int[] sum = new int[inputSize + 1];

		for (i = 0; i < inputSize; i++) {
			arr[i] = sc.nextInt();

			sum[i + 1] = arr[i] + sum[i];

			System.out.print(arr[i] + " ");
			// System.out.print(sum[i]+" ");
		}
		System.out.println();
		for (i = 0; i < count; i++) {
			start = sc.nextInt();
			last = sc.nextInt();

			System.out.println(start + " ~ " + last + "까지의 합 : " + (sum[last] - sum[start-1]));
		}
		System.out.println();

	}

}
