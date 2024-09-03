package cote_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13_DNApassword_1 {

	static int myArr[];
	static int checkArr[];
	static int checkSecret = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int Result = 0;
		myArr = new int[4];
		checkArr = new int[4];
		char A[] = new char[5];
		checkSecret = 0;

		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());

		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;

			}
		}
		for (int i = 0; i < p; i++) { // 부분문자열 처음 받을때 셋팅
			add(A[i]);
		}
		if (checkSecret == 4)
			Result++;

		// 슬라이딩 윈도우
		for (int i = p; i < s; i++) {
			int j = i - p;
			add(A[i]);
			remove(A[j]);
			if (checkSecret == 4)
				Result++;
		}
		System.out.println(Result);
	}

	private static void remove(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;

		}
	}

	private static void add(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				checkSecret++;
			break;

		}
	}

}
