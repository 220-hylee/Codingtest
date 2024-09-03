package cote_practice8;

// 원 수열의 구현을 나머지로 구현
// 경우의 수를 번지로 구현

import java.util.ArrayList;
import java.util.HashSet;

public class 연속부분수열합의갯수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = { 7, 9, 1, 1, 4 };

		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int data : elements) {
			arr.add(data);
		}
		for(int data : elements) {
			arr.add(data);
		}
		
		int cnt = 0;
		int cnt2 = 1;
		int total = 0;
		int end =0;
		for (int z = 0; z < arr.size(); z++) {
			for (int i = 0; i < arr.size(); i++) {
				for (int j = i; j < cnt + cnt2; j++) {
					if(j>arr.size()-1) {
						total=0;
						break;
					}
					total += arr.get(j);
				}
				if((cnt+cnt2) == elements.length && i ==0)
				{
					hs.add(total);
					end=1;
					break;
				}
				hs.add(total);
//				System.out.println(total);
				total = 0;
				cnt++;

			}
			if(end==1) {
				break;
			}
			cnt=0;
			cnt2++;
		}
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
