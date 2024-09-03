package cote_practice3;

import java.util.ArrayList;



public class 같은숫자는싫어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,3,3,0,1,1};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1])
				list.add(arr[i]);
		}
//		for(int i=0; i<list.size()-1; i++) {
//			if(list.get(i)==list.get(i+1)) {
//		
//				list.remove(i);
//				i--;
//				
//			}
//		}
		System.out.println(list);
		int[] answer = new int[list.size()];
		int cnt =0;
		for(int data : list) {
			answer[cnt]=data;
			cnt++;
		}
		
		
	}

}
