package cote_practice6;

//방법론을 어떻게 가져갈지..
// 이차원 배열 그 자체로 전체 탐색을 하는 방법.
// k,v 구조로 변경해서 변경한 이후에 전체탐색하는 방법.
// ArrayList<ArrayList>로 구

import java.util.ArrayList;
import java.util.HashMap;

public class 전력망을둘로나누기 {
	static int count = 0;
	static HashMap<Integer, Integer> save = new HashMap<>(); // 각 노드를 지웠을때, 연결되는 노드들이 어떤게 있는지를 알기위한 해쉬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] wires = { {2, 4}, {1, 4}, {3, 1}, {8, 6}, {5, 6}, {7, 6}, {6, 1}, {4, 9}, {9, 10}, {10, 11}, {11, 12}, {6, 13}, {6, 14} };
		int n = 14;
		int answer=n;
		
		HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> temp = new HashMap<>();
		
		boolean[] visited = new boolean[n];
		int max = 0;
		int res = 0;
		int result=0;
		for (int i = 0; i < n; i++) {
			hash.put(i + 1, new ArrayList<Integer>());
		}
		/*
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < wires.length; j++) {
				if (i == wires[j][0])
					hash.get(i).add(wires[j][1]);
				if (i == wires[j][1])
					hash.get(i).add(wires[j][0]);
			}
		} // 각 노드별로 연결되있는 노드 종류를 해쉬로 맵핑
		*/
		for(int[] w : wires) {
			hash.get(w[0]).add(w[1]);
			hash.get(w[1]).add(w[0]);
		}
		
		System.out.println(hash);
		for (int i = 0; i < n; i++) {
			temp.put(i + 1, hash.get(i + 1)); // key를 하나씩 지우기 위해서 기존 정보 저장
			hash.remove(i + 1); // 기존 정보 삭제
			
			permutation(1, visited, hash, n);
			hash.put(i + 1, temp.get(i + 1)); // 삭제했던 내용 복귀
			
			temp.remove(i + 1); //템프 정보 삭제
			save.remove(i+1); //노드 정보중 자기 자신 삭제
			System.out.println("save : " + save);
			count = 0;
			result = save.size();
			if(result==0) {
				result= 1;
			}
			res=result;
			if(n-result>result) { // math에 절대값 함수가 있음.
				res = n-result;
			}
			if(answer>res) {
				answer=res;
			}
			System.out.println("answer : " +answer);
			save=new HashMap<>(); //save초기화
		}
		answer=(n-answer)-answer;
		if(answer<0)
			answer*=-1;
		System.out.println(answer);
	}

	public static void permutation(int depth, boolean[] visited, HashMap<Integer, ArrayList<Integer>> hash, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		if(depth==n)
			return;
		if (!visited[depth] && hash.get(depth) != null) {
			arr.addAll(hash.get(depth));			
			//System.out.println(arr);
			visited[depth] = true;
			count++;
			for(int i=0; i<arr.size(); i++) {	
				save.put(arr.get(i), null);
				permutation(arr.get(i), visited, hash, n);
			}
			visited[depth] = false;
		}
	}
}
