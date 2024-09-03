package cote_practice9;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "a  a a dDE  !a a a a";
		String answer = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[0]= (char) (ch[0]+('A'-'a'));
			}
			if(i!=0) {
				if(ch[i-1] == ' ') {
					if(ch[i] >= 'a' && ch[i] <= 'z') {
						ch[i]= (char) (ch[i]+('A'-'a'));
					}
				} else {
					if(ch[i] >= 'A' && ch[i] <= 'Z') {
						ch[i]= (char) (ch[i]-('A'-'a'));
					}
				}
				
			}
			System.out.println(ch[i]);
			answer += ch[i];
		}
		System.out.println(answer);
	}
}
