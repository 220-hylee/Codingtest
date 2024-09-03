package cote_practice2;
//혹시 더 연산속도를 빠르게 할 수 있는 방법이 있는가?

public class 올바른괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(())))((()";
		char[] str = s.toCharArray();
	
		int left =0;
		int right =0;
		boolean answer =true;
		
		if(str[0] == ')' || str[str.length-1] == '(') {
//			return false;
		}
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			switch(str[i]) {
			case '(':
				left++;
				break;
			case ')':
				right++;
				break;
			}
			if(left<right)
				break;
		}
		if(left == right) {
			answer = true;
		}
		else
			answer = false;
		System.out.println(left + " " + right + " "+answer);
	}

}
