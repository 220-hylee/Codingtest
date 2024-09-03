package cote_practice2;

import java.util.ArrayList;
import java.util.Collections;

public class 이중우선순위큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = { "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" };
		int space = 1;
		ArrayList<Integer> result = new ArrayList<>();
		String front;
		String back;
		int max = -2147483648;
		int min = 2147483647;
		int backInt = 0;
		int cnt = 0;
		for (String data : operations) {
			front = data.substring(0, space);
			back = data.substring(space + 1);
			backInt = Integer.parseInt(back);
			switch (front) {
			case "I":

				result.add(backInt);
				break;
			case "D":
				if (backInt == 1) {
					System.out.println(result);
					if (result.size()!=0) {
						max = Collections.max(result);
						result.remove(Integer.valueOf(max));
					}
				} else if (backInt == -1) {
					if (result.size() !=0) {
						min = Collections.min(result);
						result.remove(Integer.valueOf(min));
					}
				}
				break;
			}
		}
		if (result.size()==0) {
			max = 0;
			min = 0;
		} else {
			max = Collections.max(result);
			min = Collections.min(result);
		}
		System.out.println(max + " " + min);

	}

}
