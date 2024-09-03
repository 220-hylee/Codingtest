package cote_practice9;

public class 입국심사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] times = {2,5};
		int cnt =0;
		int res =0;
		long answer =0;
		while(true) {
			cnt++;
			for(int i=0; i<times.length; i++) {
				if(cnt % times[i] == 0) {
					res ++;
				}
			}
			System.out.println(cnt + " : " + res);
			if(res >= n) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
