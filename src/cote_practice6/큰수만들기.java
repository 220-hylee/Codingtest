package cote_practice6;

// dfs 로 풀었으나, 완전탐색은 시간초과가 발생함.
// 다른 방법이 없을까..


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 큰수만들기 {
	public static PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
	public static ArrayList<Character> str = new ArrayList<>();
	public static ArrayList<Character> str2 = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		String number = "4177252841";
		int[] arr = new int[number.length()];
		
		for(int i=0; i<number.length(); i++) {
			arr[i]=i+1;
			str.add(number.charAt(i));
			str2.add(number.charAt(i));
		}

		boolean[] visited = new boolean[number.length()];
		int[] out = new int[k];
		permutation(arr, 0, arr.length, k, visited, out);
		System.out.println("pq:"+pq.poll());
	}

	public static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
		if (depth == r) {
			String res="";
			
			for(int data : out) {
				str.set(data-1, 'A');
			}
			for(char data: str) {
				if(data != 'A')
					res+=data;
			}
			//System.out.println(res);
			pq.add(res);
			str.removeAll(str);
			str.addAll(str2);
			
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				out[depth] = arr[i];
				permutation(arr, depth+1, n, r, visited, out);
				visited[i] = false;
			}
		}
	}
}

//		String number ="1231234";
//		int k=3;
//		String str ="";
//		HashMap<Integer, Integer> map = new HashMap<>();
//		int count =0;
//		for(int i=0; i<10; i++) {
//			map.put(i, 0);
//		}
//		System.out.println(map);
//		for(int i=0; i<number.length(); i++) {
//			int res = map.get((int)number.charAt(i)-48);
//			res++;
//			map.put((int)number.charAt(i)-48, res);
//		}
//		System.out.println(map);
//		for(int i=0; i<number.length()-k; i++) {
//			for(int j=9; j>=0; j--) {
//				int res = map.get(j);
//				if(res!=0) {
//					res--;
//					map.put(j, res);
//					str+=j;
//					break;
//				}
//			}
//		}
//		System.out.println(str);
//	}
//
//}
