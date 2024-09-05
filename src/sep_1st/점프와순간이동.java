package sep_1st;

public class 점프와순간이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int bettery = 0;
		
		while(n!=0) {
			if(n % 2 == 0 ) {
				n/=2;
				continue;
			} else {
				n--;
				bettery++;
			}
		}
		
		System.out.println(bettery);
	}

}
