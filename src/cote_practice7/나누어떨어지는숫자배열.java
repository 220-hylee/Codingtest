package cote_practice7;

import java.util.ArrayList;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int divisor = 5;
		int[] answer = {};
		ArrayList<Integer> ali = new ArrayList<>();
		int count = 0;
		for(int data : arr) {
			ali.add(data);
			if(data % divisor==0) {
				count++;
			}
		}
		ali.sort(null);

		answer = new int[count];
		 if(count==0) {
			 answer = new int[1];
	            answer[0]= -1;
//				return answer;
		}
		count =0;
		for(int data : ali) {
			if(data % divisor ==0) {
				answer[count] = data;
				count++;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i] + " , ");
		}
		
		
		
	}
	
}
