package cote_practice2;

public class 다음큰숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int e = 2;
		int result = n;
		int[] mod = new int[50];
		int cnt = 0;
		int onecnt = 0;
		int onecnt2 = 0;
		while (true) {
			mod[cnt] = result % 2;
			if (mod[cnt] == 1)
				onecnt++;
			result = result / 2;
		//	System.out.println("mod :" + mod[cnt] + "  - result : " + result);
			if (result == 1) {
				mod[cnt + 1] = result;
				break;
			}
			cnt++;
		}
		cnt = 0;
		result = n+1;
		//System.out.println(onecnt);
		while (true) {
			

			mod[cnt] = result % 2;
			if (mod[cnt] == 1)
				onecnt2++;
			result = result / 2;
			//System.out.println("mod :" + mod[cnt] + "  - result : " + result);
			if (result == 1) {
				mod[cnt + 1] = result;
				if (onecnt == onecnt2) {
					//System.out.println(onecnt2);
					break;
				}
				cnt = 0;
				onecnt2=0;
				n++;
				result = n;
			} else
				cnt++;
		}
		//System.out.println();
		int temp =1;
		int sum =0;
		for(int i=cnt+1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				temp = temp * 2;
			}
			sum = (temp * mod[i])+sum;
			temp =1;
		}
		System.out.println(sum);
	}

}
