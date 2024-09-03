package cote_practice9;

public class 숫자의표현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int start =1;
		int end =2;
		int sum =0;
		int res =0;
		while(true) {
			if(end > n || start ==n)
				break;
			for(int i=start; i<end; i++) {
				sum+=i;
			}
			if(sum== n) {
				res ++;
			} 
			if(sum >= n) {
				start++;
			} else if(sum < n) {
				end++;
			}
			
			sum=0;
			
		}
		res ++;
		System.out.println(res);
	}

}
