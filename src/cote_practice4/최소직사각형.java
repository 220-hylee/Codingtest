package cote_practice4;

import java.util.ArrayList;

public class 최소직사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=0;
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		ArrayList<Integer> min = new ArrayList<>();
		ArrayList<Integer> max = new ArrayList<>();
		
		for(int i=0; i<sizes.length; i++) {
			 if(sizes[i][0]>sizes[i][1]) {
				 max.add(sizes[i][0]);
				 min.add(sizes[i][1]);
			 } else {
				 min.add(sizes[i][0]);
				 max.add(sizes[i][1]);
			 }
			
		}
		min.sort(null);
		max.sort(null);
		answer=min.get(min.size()-1) * max.get(max.size()-1);
		System.out.println(answer);
	}

}
