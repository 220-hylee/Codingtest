package cote_practice8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 괄호회전하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		String s = "()(";
		Queue<Character> totalQ = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			totalQ.add(s.charAt(i));
		}
		int result = 0;
		int cnt = 0;
		int tmp = 0;

		while (cnt < s.length()) {
			Stack<Character> st = new Stack<>();
			System.out.println(totalQ);
			for (char data : totalQ) {
				if (data == '{' || data == '[' || data == '(') {
					st.add(data);
				} else {
					char ch = ' ';
					if (!st.isEmpty()) {
						System.out.println(st);
						ch = st.pop();
						int tmp2 = data - ch;
						System.out.println("tmp2 : " + tmp2);
						if ((tmp2 == 2 || tmp2 == 1)) {
							tmp++;
						} else {
							tmp += 10;
						}
					} else {
						tmp += 10;
					}

				}
				System.out.println("tmp : " + tmp);
			}

			if (tmp == (s.length() / 2) && s.length() % 2 ==0)
				result++;
			if (s.length() == 1) {
				result = 0;
			}
			
			tmp = 0;
			char temp = totalQ.poll();
			totalQ.add(temp);
			cnt++;

		}
		System.out.println(result);

	}

}
