package cote_practice9;

// 전체탐색방식, DFS방식으로 구현하였는데,
// 시간초과가 남.
// 재귀문이 문제인것 같은데, 재귀 말고 다른 방법으로 풀 수 있는 방법이 있는지?

import java.util.ArrayList;

public class 단어변환 {

	public static int count = 0;
	public static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog" };
		
		//String[] words = {"cog", "log", "lot", "dog", "dot", "hot" };
		ArrayList<String> arrWords = new ArrayList<>();
		int i = 0;
		for(String data : words) {
			arrWords.add(data);
		}

		permutation(begin, target, arrWords, i);
		System.out.println(arr);
		if(!arr.isEmpty())
			arr.sort(null);
		
		
	}

	private static void permutation(String begin, String target, ArrayList<String> arrWords, int i) {
		// TODO Auto-generated method stub
		
		
		
		if (begin.equals(target)) {
			System.out.println("he");
			arr.add(count);
			return;
		}
		if(i>arrWords.size()-1) {
			return;
		}
		int temp = 0;
		for (int j = 0; j < begin.length(); j++) {
			if (begin.charAt(j) == arrWords.get(i).charAt(j)) {
				temp++;
			}
		}
		
		if (temp >= 2) {
			
			String str = arrWords.get(i);
			System.out.println(count + " : " + str);
			arrWords.remove(i);
			
			count++;
			permutation(str, target, arrWords, 0);
			count--;
//			System.out.println(count + " : " + begin);
			arrWords.add(str);
			
		}
		
		permutation(begin, target, arrWords, i + 1);
		
	}

}
