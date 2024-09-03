package cote_practice8;

// 재귀함수로 짰더니 효율성 테스트에서 시간초과가 나옴.

// remove가 문제인듯.
// remove로 삭제하지 말고 수치를 계산하는 방법으로 접근하는게 효율성 테스트를 넘길 수 있을 것 같음.

import java.util.ArrayList;

public class 구명보트 {
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = {30,30,60};
		int limit = 160;
		int answer = 0;

		int start = 0;
		int end = people.length - 1;

		ArrayList<Integer> arr = new ArrayList<>();
		for (int data : people)
			arr.add(data);

		arr.sort(null);
		permutation(arr, start, end, limit);
		System.out.println(count);
		System.out.println(arr.size());
		answer = arr.size()-count;
		System.out.println(answer);
	}

	public static void permutation(ArrayList<Integer> arr, int start, int end, int limit) {
		int data1 = 0;
		int data2 = 0;
		
		if(start==end) {
			return;
		}
		data1 = arr.get(start);
		data2 = arr.get(end);
		if ((data1 + data2) > limit) {
			permutation(arr, start, end - 1, limit);
		} else {
			count++;
//			arr.remove(end);
//			arr.remove(start);
			if(start==(end-1)) {
				return;
			}
			else {
				permutation(arr, start+1, end-1, limit);
			}

		}

	}

}
