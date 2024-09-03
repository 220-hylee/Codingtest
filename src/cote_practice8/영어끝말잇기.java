package cote_practice8;

import java.util.ArrayList;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		String[] words = {"tank", "kick", "kick", "know"};
		int[] answer = new int[2];
		int stop = 0;
		ArrayList<String> saveWords = new ArrayList<>();
		saveWords.add(words[0]);
//		System.out.println(words[0].charAt(words[0].length()-1));
		for(int i=1; i<words.length; i++) {
			if(words[i].length()<2 || words[i].length()>50) {
				stop=i;
				break;
			}
			if(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)) {
				saveWords.add(words[i]);
				for(int j=0; j<saveWords.size(); j++) {
					if(saveWords.get(j).equals(words[i])) {
						stop =i;
						break;
				}
			}
			}else {
				stop=i;
				break;
			}
			
			
			if(stop !=0) {
				break;
			}
		}
		if(stop != 0) {
			stop++;
			System.out.println("stop : "+ stop);
			if(stop % n ==0) {
				answer[0]=n;
				answer[1]=stop/n;
			}else {
				answer[0]=stop%n;
				answer[1]=stop/n+1;
			}
		}	
		else {
			answer[0]=0;
			answer[1]=0;
			
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	
	}

}
