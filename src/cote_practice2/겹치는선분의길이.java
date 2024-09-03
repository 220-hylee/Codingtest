package cote_practice2;

public class 겹치는선분의길이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =0;
		int[][] lines = //{ { 0, 1 }, { 2, 5 }, { 3, 9 } };
//		{{-1,1},{1,3},{3,9}};
		{{0,5},{3,9},{1,10}};
		
		int[] arr = new int [200];
		for(int i=0; i<lines.length; i++) {
			for(int j=lines[i][0]; j<lines[i][1]; j++) {
				arr[j] +=1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>1)
				answer++;
		}
		System.out.println(answer);
//		return answer;

	}

}
