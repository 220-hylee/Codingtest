package cote_practice5;

import java.util.ArrayList;

public class 신규아이디추천 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String new_id = "=.=";
		String answer = "";
		int count = 0;
		ArrayList<Character> ch = new ArrayList<>();
//		if(new_id==null)
//			return "a";
		for (int i = 0; i < new_id.length(); i++) {
			ch.add(new_id.charAt(i));
		}

		for (int i = 0; i <= ch.size() - 1; i++) {

			if (ch.get(i) >= 'A' && ch.get(i) <= 'Z') {
				ch.set(i, (char) (ch.get(i) - ('A' - 'a')));
			}
			if (ch.get(0) == '.') {
				ch.remove(i);
				i--;
				if (ch.size() == 0) {
					ch.add('a');
				}
				continue;
			}
			if (!((ch.get(i) >= '0' && ch.get(i) <= '9') || (ch.get(i) >= 'A' && ch.get(i) <= 'Z')
					|| (ch.get(i) >= 'a' && ch.get(i) <= 'z') || ch.get(i) == '-' || ch.get(i) == '_'
					|| ch.get(i) == '.')) {
				ch.remove(i);
				i--;
				if (i > 1) {
					i--;
				}
				if (ch.size() == 0) {
					ch.add('a');
				}
				continue;
			}
			if (ch.get(i) == '.') {
				count++;
				if (count == 2) {
					ch.remove(i);
					count = 0;
				}
			}

			if (ch.size() <= 2) {
				ch.add(ch.get(ch.size() - 1));
				i--;
				continue;
			}
			if (i >= 15) {
				ch.remove(i);
				i -= 2;
				continue;
			}
			if (i == ch.size() - 1) {
				if (ch.get(i) == '.') {
					ch.remove(i);
					i = 0;
				}
			}

		}

		for (char data : ch) {
			answer += data;
		}

		System.out.println(answer);

	}

}
