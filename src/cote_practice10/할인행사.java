package cote_practice10;

import java.util.ArrayList;

public class 할인행사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =0;
		String[] want = { "banana", "apple", "rice", "pork", "pot" };
		int[] number = { 3, 2, 2, 2, 1 };
		String[] discount = { "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
				"pot", "banana", "apple", "banana" };
		ArrayList<String> arr1 = new ArrayList<>();
//		ArrayList<String> disArr = new ArrayList<>();
		ArrayList<String> disArr2 = new ArrayList<>();
		int z = 0;
		int cnt = 0;
		int sum = 0;
		int res =0;
		for (String data : want) {
			for (int i = 0; i < number[z]; i++) {
				arr1.add(data);
				
			}
			z++;
		}
		z = 0;
		sum = arr1.size();
		
		int temp = discount.length - sum; // 디스카운트와 넘버 합의 차
		for(int i=0; i<= temp; i++){
			for(int j=i; j<10+i; j++) {
				disArr2.add(discount[j]);
			}
			arr1.sort(null);
			System.out.println(arr1);
			System.out.println(disArr2);
			disArr2.sort(null);
			System.out.println(arr1);
			System.out.println(disArr2);

			for(z=0; z<arr1.size(); z++) {
				if(arr1.get(z).equals(disArr2.get(z))) {
					cnt++;
				}
			}
			System.out.println();
			if(cnt == arr1.size()) {
//				System.out.println(arr1);
//				System.out.println(disArr2);
				res++;
			}
			cnt=0;
			disArr2.removeAll(disArr2);
		}
		
		System.out.println(res);

	}
}
