package cote_practice2;

public class Hindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] citations = {3,0,6,1,5};
		int n=citations.length;
		int cnt =0;
		int answer =0;
		while(n>=0) {
			
			for(int i=0; i<citations.length; i++) {
				if(n<= citations[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
			if(n<=cnt) {
				answer=n;
				break;
			} else {
				cnt=0;
				n--;
			}
		}
		System.out.println(answer);
	}

}
