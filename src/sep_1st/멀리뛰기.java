package sep_1st;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//q로도 불가.
//무조건 점화식으로 풀어야함. 피보나치수;
public class 멀리뛰기 {
	public static int res = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		int count = 0;
		Queue<Long> q = new LinkedList<>();
		ArrayList<Long> arr = new ArrayList<>();
		long temp = 0;
		q.add(0L);
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp == n) {
				arr.add(temp);
			} else if (temp < n) {
				q.add(temp + 1);
				q.add(temp + 2);
			}
			if (q.isEmpty())
				break;
		}
		System.out.println(arr.size()%1234567);

//		permutation(n,count);
//		System.out.println(res);
	}

//	private static void permutation(int n, int count) {
//		// TODO Auto-generated method stub
//		System.out.println(count);
//		if(count > n) {
//			return;
//		}
//		if(count ==n) {
//			res++;
//			return;
//		}
//		if(count < n) {
//			permutation(n, count+1);
//			permutation(n, count+2);
//		}
//		
//	}

}
