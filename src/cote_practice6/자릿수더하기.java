package cote_practice6;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=987;
		String str = n+"";
		int res = 0;
		for(int i=0; i<str.length(); i++) {
			res=res + str.charAt(i)-48;
		}
	}

}
