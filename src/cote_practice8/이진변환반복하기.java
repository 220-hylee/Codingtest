package cote_practice8;

public class 이진변환반복하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "110010101001";
		int[] answer = {};
		int zeroCnt = 0;
		int oneCnt = 0;
		int count=0;
		int n=1;
		while (!s.equals("1")) {
			count++;
			oneCnt=0;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zeroCnt++;
					s = s.substring(0, i) + s.substring(i + 1, s.length());
					i--;

				} else {
					oneCnt++;
				}
			}
			
			s = "";
			n=oneCnt;
			
			System.out.println("n : " + n);
			while (n != 1) {
				s += (n % 2) + "";
				n /= 2;
				
			}
			s += 1 + "";
			
			System.out.println(s);
		}
		System.out.println("횟수 : " + count);
		System.out.println(" 0 갯수 : " +zeroCnt);
		answer = new int [2];
		answer[0]=count;
		answer[1]=zeroCnt;
	}

}
