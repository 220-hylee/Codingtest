package cote_practice9;

public class 콜라문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=1; 
		int n=20;
		
		int div =0;
		int mod =0;
		int res =0;
		
		while(n>=a) {
			
			div = n/a;
			mod= n%a;
			res += div;
			n=(div*b)+mod;
			
		}
		System.out.println(res);
		
		
	}

}
