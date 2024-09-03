package cote_practice2;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123a";
		char ch = ' ';
		boolean answer = true;
		if (s.length() >= 4 && s.length() <= 6) {
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);
				if (ch >= '0' && ch <= '9') {
					answer = true;
				} else {
					answer = false;
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
