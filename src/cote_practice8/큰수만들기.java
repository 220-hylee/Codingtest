package cote_practice8;

// dfs 로 풀었으나, 완전탐색은 시간초과가 발생함.
// 전체탐색을 통해 만들수 있는 모든 수를 만들어냄.  --> 문제는 백만자리 이하인 숫자라고 하는데, 백만자리를 소화하지 못하는 것 같음.

// 만든 수를 PQ에 정렬함.
// 가장 앞에있는 수를 빼냄.

// => 이문제는 스텍을 활용해서 풀어야함.
// 탐욕법문제를 완전탐색으로 푸는건 비효율임
// 앞의 숫자부터 해결해 나가는 로직으로 구현


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 큰수만들기 {
	public static PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
	public static ArrayList<Character> arr = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		String number = "4177252841";
		for(int i=0; i<number.length(); i++) {
			arr.add(number.charAt(i));
		}

		boolean[] visited = new boolean[number.length()];
		int[] out = new int[arr.size()-k];
		permutation(arr, 0, arr.size(), arr.size()-k, visited, out, 0);
		System.out.println("pq:"+pq.poll());
	}
	public static void permutation(ArrayList<Character> arr, int depth, int n, int r, boolean[] visited, int[] out, int a) {
		if(depth == r) {
	    	String str ="";
	    	for(int data : out) {
	    		str += data + "";
	    	}
	    	pq.add(str);
	        return;
	    }
	    for(int i = a; i < n; i++) {
	    	if(!visited[i]) {
	        	visited[i] = true;
	            out[depth] = arr.get(i)-48;
	            permutation(arr, depth+1, n, r, visited, out, i);
	            visited[i] = false;
	        }
	    }
	}
}

