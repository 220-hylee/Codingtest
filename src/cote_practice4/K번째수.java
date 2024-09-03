package cote_practice4;

import java.util.ArrayList;


public class K번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		ArrayList<Integer> list = new ArrayList<>();
		int[] answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
				list.add(array[j]);
			}
			list.sort(null);
			answer[i]=list.get(commands[i][2]-1);
			System.out.println(answer[i]);
			list.removeAll(list);
		}
		
		
		
	}

}
