package cote_practice2;
//로직에 대해서 질문하기

// 전형적인 DP문제라고 함.
// 동적계획법
// 이전의 결과가 다음 결과에 영향을 준다 라는 로직
// 모든 경우의 케이스를 따지기가 힘들때 dp를 사용

// 접근방법을 어떻게 가져가야 하는지?
// 선생님의 문제풀이 흐름에 대해서 질문해볼것.


import java.util.ArrayList;

public class 정수삼각형 {
	public static void main(String[] args) {

		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };

		int[][] result = new int[triangle.length][triangle.length];

		result[0][0] = triangle[0][0];

		for (int i = 1; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				if(j==0) {
					result[i][j] = result[i-1][j]+triangle[i][j];
				} else {
				result[i][j] = Math.max(result[i-1][j-1] + triangle[i][j], result[i-1][j] + triangle[i][j]);
				}
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
		int answer =result[triangle.length-1][0];
		for(int i=0; i<triangle.length-1; i++) {
			answer = Math.max(answer, result[triangle.length-1][i+1]);
		}
		System.out.println("answer : "+answer);

	}
}
