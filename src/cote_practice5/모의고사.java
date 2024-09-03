package cote_practice5;

import java.util.ArrayList;

public class 모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		int[] answers = { 5,5,5,5,1};
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int i = 0;
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		for (int data : answers) {
			if (one[i%one.length] == data) {
				score1++;
			}
			if (two[i%two.length] == data) {
				score2++;
			}
			if (three[i%three.length] == data) {
				score3++;
			}
			i++;
		}
		
		if(score1!=0 && score1>=score2 && score1>= score3) {
			arr.add(1);
		}
		if(score2!=0 && score2>= score1 && score2>=score3) {
			arr.add(2);
		} 
		if(score3!=0 && score3>= score1 && score3>=score2) {
			arr.add(3);
		}
		int[] answer = new int[arr.size()];
		
		for(int j=0; j<answer.length; j++) {
			answer[j]=arr.get(j);	
			System.out.println(answer[j]);
		}
	}

}
