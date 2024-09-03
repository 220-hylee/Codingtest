package cote_practice6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

// 순서를 모르겠음...
// 문제가 이해가 안됨.

public class 모음사전 {
	static HashMap<String,Integer> str = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrStr = new ArrayList<>();
		char[] arr = { 'A', 'E', 'I', 'O', 'U', ' ' };
		// boolean[] visited=new boolean[arr.length];
		char[] out = new char[arr.length-1];
		permutation(arr, 0, 6, 5, out);
		for(String data : str.keySet()) {
			arrStr.add(data);
		}
		arrStr.sort(null);
		int count=0;
		int result = 0;
		String a = "AAA";
		for(String data : arrStr) {
			count++;
			if(data.equals(a)) {
				result = count;
			}
				
		}
		
		System.out.println(arrStr);
		System.out.println(result);
	}

	public static void permutation(char[] arr, int depth, int n, int r, char[] out) {
		if (depth == r) {
			
			String tmp ="";
			for(char data: out) {
				if(data != ' ')
					tmp+=data;
			}
			//System.out.println(tmp);
			str.put(tmp, null);
			return;
		}

		for (int i = 0; i < n; i++) {
			out[depth] = arr[i];
			permutation(arr, depth + 1, n, r, out);

		}
	}
}
