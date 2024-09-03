package cote_practice8;

import java.util.ArrayList;

public class nxn배열자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		long left = 2;
		long right = 5;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(Long i= left; i<=right; i++) {
			int x = (int)(i/n);
			int y = (int)(i%n);
			
			int value = Math.max(x, y) +1;
			list.add(value);
			
			
		}
		System.out.println(list);
		int[] answer = new int[(int)right-(int)left+1];
		int cnt =0;
		for(int data : list) {
			answer[cnt]=data;
			cnt++;
		}
		
		
		
		//----------------------------
//		int n=3;
//		
//		long left = 2;
//		long right = 5;
//		int cnt =0;
//		int[][] arr = new int[n][n];
//		
//		int[] answer2 = new int[n*n];
//		int[] answer = new int[(int)right-(int)left+1];
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				arr[i][j]=cnt+1;
//				arr[j][i]=cnt+1;
//			}
//			cnt++;
//			
//		}
//		
//		int z=0;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				answer2[z]=arr[i][j];
//				z++;
//			}	
//		}
//		
//		for(long i=left; i<=right; i++) {
//			answer[(int)i-(int)left]=answer2[(int)i];
//		}
		
		
	}

}
