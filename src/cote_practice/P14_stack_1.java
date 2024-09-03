package cote_practice;

import java.util.Scanner;
import java.util.Stack;

public class P14_stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();

		}
		Stack<Integer> stack = new Stack<>(); // stack을 사용하기 위한 클래스.
		int num = 1;
		boolean result =true;
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < A.length; i++) {
			int su = A[i];
			if (su >= num) {
				while (su >= num) { // 현재 수열의 값이 >= 오름차순 자연
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				int n = stack.pop();
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else
				{
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}

}
