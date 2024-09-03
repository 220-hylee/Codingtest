package cote_practice3;

import java.util.ArrayList;

public class 프로세스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =0;
		int[] priorities = { 1,1,9,1,1,1 };
		int location = 0;
		ArrayList<Integer> key = new ArrayList<>();
		ArrayList<Integer> value = new ArrayList<>();
		for (int i = 0; i < priorities.length; i++) {
			key.add(i);
			value.add(priorities[i]);
		}
		int count = 1;
		while (true) {
			int temp = 0;
			int tempkey = 0;

			for (int i = 1; i < value.size(); i++) {
				if (value.get(0) < value.get(i)) {
					temp = value.get(0);
					tempkey = key.get(0);
					value.remove(0);
					key.remove(0);
					value.add(temp);
					key.add(tempkey);
					i=0;
				}
			}
			if (key.get(0) == location) {
				answer = count;
				break;
			} else {
				count++;
				key.remove(0);
				value.remove(0);
			}
				
		}
		System.out.println(answer);
		
	}

}
