package cote_practice5;

import java.util.Collections;
import java.util.PriorityQueue;

// 전체 경우의 수를 구하는 방법 선택
// 입장 최소 요건에 대한 경우의 수를 나열
// 각 경우의 수 별로 최대 몇개의 던전을 돌 수 있는지를 계산.
// 막 엄청 효율적인 코드는 아닌 것 같음.
// 가장 높은 효율을 찾기 위해서 priorityqueue를 사용.


public class 피로도 {
	
	static int count=0;
	static PriorityQueue<Integer> arr= new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args) {
		
		int k=80;
		int[][] dungeons= {{80,20},{50,40},{30,10}};
		
		boolean[] visited = new boolean[dungeons.length];
		int[] out = new int[dungeons.length];
		//int k=80;
		permutation(dungeons, 0, dungeons.length, dungeons.length, visited, out, k);
		//arr.sort(1);
		int max=0;
		for(int data : arr) {
			if(data >max) {
				max=data;
			}
		}
		System.out.println(max);
	}
	
	private static void permutation(int[][] dungeons, int depth, int n, int r, boolean[] visited, int[] out, int k) {
		// TODO Auto-generated method stub
		
	
		if(depth==r) {
		
			count=0;
			for(int i=0; i<out.length; i++) {
				if(out[i]!=0) {
					count++;
				}
			}
			arr.add(count);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				//System.out.println(k);
				visited[i]=true;
				if(k >= dungeons[i][0]) {
					out[depth]=dungeons[i][0];
				} else {
					out[depth]=0;
				}
				k-=dungeons[i][1];
				permutation(dungeons, depth+1, n,r,visited, out, k);
				visited[i]=false;
				k+=dungeons[i][1];
				//System.out.println(k);
			}
			
		}
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		boolean[] visited=new boolean[4];
		int[] out=new int[4];
		permutation(arr, 0, 4, 4, visited, out);
	}
	public static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
		if(depth == r) {
	    	System.out.println(Arrays.toString(out));
	        return;
	    }
	    
	    for(int i = 0; i < n; i++) {
	    	if(!visited[i]) {
	        	visited[i] = true;
	            out[depth] = arr[i];
	            permutation(arr, depth + 1, n, r, visited, out);
	            visited[i] = false;
	        }
	    }
	}
	*/

	

}
