package cote_practice9;

import java.util.LinkedList;
import java.util.Queue;

// 큐로 풀수 있을까?

public class 숫자변환하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=40;
		int n=5;
		int temp = x;
		int cnt =0;
		Queue<Integer> q = new LinkedList<>();
		q.add(temp);
		while(true) {
			System.out.println(q);
			temp = q.poll();
			if(temp == y) {
				break;
			}
			q.add(temp+n);
			q.add(temp*2);
			q.add(temp*3);
			cnt++;
			
		}
		System.out.println(cnt);
		
	}

}
