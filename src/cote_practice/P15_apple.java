package cote_practice;

public class P15_apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int k = 3; // 최대점수
		int temp = 0;
		int m = 4; // 한상자에 담긴 사과 수
		int[] score = { 1, 2, 3, 1, 2, 3, 1 };
		int result = 0;
		int[] departSco = new int[k+1];

		for (int i = 0; i < score.length; i++) {
			temp = score[i] % k;
			departSco[temp] += 1;
		}
		departSco[departSco.length]= departSco[0];
		temp =0;
		if(score.length<m*2) {
			for (int i = departSco.length; i > 0; i--) {
				result+= (departSco[i]*i);
				temp += departSco[i];
			//	if(temp  %)
			}
		}
		

	}
}
