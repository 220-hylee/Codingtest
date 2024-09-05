package sep_1st;

import java.util.ArrayList;

// 일반적인 반복문으로 구현하려고 했으나, 시간복잡도에서 오류가 발생함.

// 잘 고민해보니, 이 문제는 stack 구조를 활용하면 문제를 해결 할 수 있을 것 같음.


public class 짝지어제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		ArrayList<Character> arr = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			arr.add(s.charAt(i));
			
		}
		for(int i=1; i<arr.size(); i++) {
			System.out.println(arr);
			if(arr.get(i) == arr.get(i-1)) {
				System.out.println(arr);
				arr.remove(i);
				arr.remove(i-1);
				System.out.println(arr);
				if(i>=2)
					i=i-2;
				else
					i--;
			}
		}
		if(arr.isEmpty()) {
//			answer =1;
		}
		
	}

}
