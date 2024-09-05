package sep_1st;

public class 멀리뛰기 {
	public static int res =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int count =0;
		permutation(n,count);
		System.out.println(res);
	}

	private static void permutation(int n, int count) {
		// TODO Auto-generated method stub
		System.out.println(count);
		if(count > n) {
			return;
		}
		if(count ==n) {
			res++;
			return;
		}
		if(count < n) {
			permutation(n, count+1);
			permutation(n, count+2);
		}
		
	}

}
