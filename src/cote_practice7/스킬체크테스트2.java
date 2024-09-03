package cote_practice7;

import java.util.ArrayList;

public class 스킬체크테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zbcdefg";
		ArrayList<Character> arr = new ArrayList<>();
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			arr.add(s.charAt(i));
		}
		arr.sort(null);
		for(int i=arr.size()-1; i>=0; i--) {
			answer+=arr.get(i);
		}
		System.out.println(answer);
		
	}

}
