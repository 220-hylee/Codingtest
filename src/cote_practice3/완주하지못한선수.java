package cote_practice3;
// 시간초과 해결 어떻게 하는게 좋은지?
// hashmap으로 다시 구현해볼것.
// hash를 사용하는 이유는, 탐색 속도를 빠르게 하기 위해서, 보안 무결성을 증명하기 위해서.

import java.util.ArrayList;
import java.util.List;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion={"josipa", "filipa", "marina", "nikola"};
		List<String> arr = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		for(String data : participant) {
			arr.add(data);
		}
		for(String data : completion) {
			arr2.add(data);
		}
		arr.sort(null);
		arr2.sort(null);
		String answer = null;
		for(int i=0; i<arr.size(); i++) {
			if(i==arr.size()-1) {
				answer=arr.get(i);
				break;
			}
			if(!arr.get(i).equals(arr2.get(i))) {
				answer=arr.get(i);
				break;
			}
		}
		System.out.println(answer);
		
		
	
	}

}
