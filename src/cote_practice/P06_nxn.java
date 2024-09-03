package cote_practice;

import java.util.Scanner;

// 나선형
public class P06_nxn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int input = sc.nextInt();
		arr = new int[input][input];
		int i = 0, j = 0, down = 0, left = -1, up = -1, right = 0;
		int count = 0;
	

		while (true) {
			// 우로 가기
			up++;
			left++;
			right = left;
			while (arr[up][right] == 0) {
				count++;
				arr[up][right] = count;
				// System.out.print(" " + arr[up][right]);
				right++;
				if (right > input - 1)
					break;
			}

			// 아래로가기
			right--;
			up++;

			if (arr[up][right] != 0) {
				break;
			} else {
				down = up;
				while (arr[down][right] == 0) {
					count++;
					arr[down][right] = count;
					// System.out.print(" " + arr[down][right]);
					down++;
					if (down > input - 1)
						break;
				}
			}

			// 왼쪽으로가기
			down--;
			right--;

			left = right;
			while (arr[down][left] == 0) {
				count++;
				arr[down][left] = count;
				// System.out.print(" " + arr[down][left]);
				left--;
				if (left < 0)
					break;
			}

			// 위로가기
			down--;
			left++;

			up = down;
			while (arr[up][left] == 0) {
				count++;
				arr[up][left] = count;
				// System.out.print(" " + arr[up][left]);
				up--;
				if (up < 0)
					break;
			}

		}
		System.out.println();
		for (i = 0; i < input; i++) {
			for (j = 0; j < input; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
