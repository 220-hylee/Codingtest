package sep_3st;

import java.util.LinkedList;
import java.util.Queue;

public class 예신대진표 {
	public static void main(String[] args) {

		int n = 8;
		int a = 4;
		int b = 7;
		int count = 0;
		int res = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			if (i == a || i == b) {
				q.add(0);
			} else {
				q.add(i);
			}
		}

		while (true) {
			System.out.println(q);
			count++;
			
			if (q.isEmpty()) {
				break;
			}
			int tempA = q.poll();
			int tempB = q.poll();
			if (tempA == 0 && tempB == 0) {
				break;
			}
			if (tempA == 0) {
				q.add(tempA);
			} else if (tempB == 0) {
				q.add(tempB);
			} else {
				q.add(tempA);
			}
			if (count == n / 2) {
				res++;
				count = 0;
				n /= 2;
			}
		}
		System.out.println(res);
	}
}
