package cote_practice9;

import java.util.LinkedList;
import java.util.Queue;

public class 스킬트리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		Queue<Integer> q = new LinkedList<>();
		
		Queue<Character> ski = new LinkedList<Character>();
		Queue<Character> save = new LinkedList<>();
		
		int result = 0;
		for(int i=0; i<skill.length(); i++) {
			ski.add(skill.charAt(i));
			save.add(skill.charAt(i));
		}
		//System.out.println(ski);
		
		for(String data : skill_trees) {
			for(int i=0; i<data.length(); i++) {
				char ch = data.charAt(i);
				if(ski.isEmpty()) {
					break;
				}
				if(ch == ski.peek()) {
					q.add(i);
					ski.poll();
					i=-1;
				}
				if(i==data.length()-1) {
					q.add(10000);
					ski.poll();
					i=-1;
				}
				
			}
			ski.removeAll(ski);
			ski.addAll(save);
//			System.out.println(q);
			
			for(int i=0; i<skill.length(); i++) {
				int temp = q.poll();
//				System.out.println(q.peek());
				if(q.isEmpty()) {
//					System.out.println("hi");
					result++;
					break;
				}
				if(temp>q.peek()) {
					break;
				}
				
			}
			
			q.removeAll(q);
			
		}
		System.out.println(result);
		

		
	}

}
