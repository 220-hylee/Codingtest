package cote_practice2;

import java.util.Arrays;

public class 주사위게임3 {
	/*
	 * 같은 수 찾는 방법에 대해서 첫번째부터 찾고다른경우 남기는 방식을 택했는데 6 2 2 2 일경우 오류가 발생함. 첫번째 수가 다른경우 오류
	 * 발생 이때 어떤방식이 좋은지...
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] same = new int[16];
		int[] def = new int[16];
		int a = 1, b = 1, c = 5, d = 5;
		int answer = 0;//
		int result = 0;
		int i = 0;
		int j = 0;
		int[] arr = new int[4];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		int count = 0;
		int z = 0; // 같은 경우
		int g = 0; // 다른 경우
		int min = 0;
		min = arr[0];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					count++;
					same[z] = arr[i];
					z++;
				}
				if (z > 0) {
					if (same[z - 1] != arr[j]) {
						def[g] = arr[j];
						g++;
					}
				}
				if (min > arr[j])
					min = arr[j];

			}
		}
		System.out.println(count);
		System.out.println(same[0]);
		System.out.println(def[0]);
		if (count == 12) {
			result = same[0] * 1111;
		} else if (count == 6) {
			result = (same[0] * 10 + def[0]) * (same[0] * 10 + def[0]);
		} else if (count == 4) {
			// System.out.println(same[0]+" "+same[2]);
			if (same[0] == same[1]) {
				if (same[0] < same[2]) {
					result = (same[0] + same[2]) * ((same[0] - same[2]) * -1);
				} else
					result = (same[0] + same[2]) * ((same[0] - same[2]));
			} else
			{
				if (same[0] < same[1]) {
					result = (same[0] + same[1]) * ((same[0] - same[1]) * -1);
				} else
					result = (same[0] + same[1]) * ((same[0] - same[1]));
			} 
		} else if (count == 2) {
			result = def[0] * def[1];
		} else
			result = min;
		System.out.println(result);
		// return answer;
	}

}
