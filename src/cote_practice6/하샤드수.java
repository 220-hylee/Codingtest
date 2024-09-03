package cote_practice6;

public class 하샤드수 {
	// 자릿수의 합이 x에 나누어 떨어지면 하샤드수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=13;
		String str = x+"";
		
		int res = 0;
		boolean answer= false;
		for(int i=0; i<str.length(); i++) {
			res =res+str.charAt(i)-48;
		}
		if(x%res ==0) {
			answer=true;
		}
		System.out.println(answer);
		
	}

}
