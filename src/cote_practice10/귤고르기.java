package cote_practice10;

import java.util.ArrayList;
import java.util.HashMap;

public class 귤고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int[] tangerine = { 1, 1, 1, 1, 2, 2, 2, 3 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		int count = 0;
		int sum = 0;

		for (int data : tangerine) {
			hm.put(data, 0);
		}
		
		for (int data : tangerine) {
			hm.put(data, hm.get(data) + 1);
		}
	System.out.println(hm);
		for (int data : hm.keySet()) {
			System.out.println(data);
			arr.add(hm.get(data));
		}		
		System.out.println(arr);
		arr.sort(null);
		while(true) {
			sum+=arr.get(arr.size()-count-1);
			if(sum>k) {
				count++;
				break;
			} else {
				count++;	
			}
		}
		System.out.println(count);


	}

}
