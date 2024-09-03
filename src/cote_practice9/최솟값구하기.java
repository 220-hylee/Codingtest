package cote_practice9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최솟값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {1,4,2};
		int []B = {5,4,4};
		
		int res =0;
		ArrayList<Integer> arrA = new ArrayList<>();
		ArrayList<Integer> arrB = new ArrayList<>();
		
		//PriorityQueue<Integer> pqB = new PriorityQueue<>(Collections.reverseOrder());
		
		
		
		for(int data : A) {
			arrA.add(data);
		}
		for(int data : B) {
			arrB.add(data);
		}
		arrA.sort(null);
		arrB.sort(null);
		//System.out.println(arrA);
		//System.out.println(pqB);
		for(int i=0; i<arrA.size(); i++) {
			res = (arrA.get(i)* arrB.get(arrA.size()-i-1))+res;
		}
		
		//System.out.println(res);
	}

}
