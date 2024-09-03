package cote_practice5;
// 접근 방법을 잘 모르겠음.
// dfs로 접근해봤으나, 답이 아닌것 같음.

import java.util.ArrayList;

import java.util.HashSet;

public class 소수찾기 {
	static ArrayList<String> temp = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=0;
		String numbers="123";
		ArrayList<Integer> num = new ArrayList<>();
		HashSet<Integer> res = new HashSet<>();
		int[] arr= new int[numbers.length()];
		boolean[] visited=new boolean[numbers.length()];
		
		
		for(int i=0; i<numbers.length(); i++) {
			arr[i]=(int)numbers.charAt(i)-48;
		}
		for(int i=0; i<numbers.length(); i++) {
			int[] out=new int[i+1];
			
			permutation(arr, 0, numbers.length(), i+1, visited, out);
			
		}
		int j=0;
		for(int z=0; z<temp.size(); z++) {
			num.add(Integer.parseInt(temp.get(z)));
			int tempNum=Integer.parseInt(temp.get(z));
			for(int i=2; i<tempNum/2+1; i++) {	
				if(num.get(num.size()-1)%i==0) {
					
					num.remove(num.size()-1);
					
					break;
				}
					
			}
			j++;
		}
		for(int tem : num) {
			if(tem !=0 && tem !=1) {
				
				res.add(tem);
			}
		}
		System.out.println(res);
		answer=res.size();
	}
	public static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
		if(depth == r) {
	    	String tmp ="";
			for(int data : out) {
				tmp+=data;
			}
			temp.add(tmp);
	        return;
	    }
		 
	    
	    for(int i = 0; i < n; i++) {
	    	if(!visited[i]) {
	        	visited[i] = true;
	            out[depth]=arr[i];
	            permutation(arr, depth + 1, n, r, visited, out);
	            visited[i] = false;
	        }
	    }
	}

}
