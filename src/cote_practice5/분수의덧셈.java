package cote_practice5;

public class 분수의덧셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numer1=9;
		int denom1=2;
		int numer2=1;
		int denom2=4;
		
		int denomRes=denom1*denom2;
		int numerRes=(denom2*numer1)+(denom1*numer2);
		
		System.out.println(numerRes + " " + denomRes);
		int min=denomRes;
		if(denomRes>numerRes) {
			min=numerRes;
		}
		for(int i=2; i< min/2; i++) {
			if(denomRes % i ==0 && numerRes % i ==0) {
				denomRes/=i;
				numerRes/=i;
				i=1;
			}
		}
		System.out.println(numerRes + " " + denomRes);
	}

}
