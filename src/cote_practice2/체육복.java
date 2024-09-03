package cote_practice2;

public class 체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = { 1,2,4,5 };
		int[] reserve = { 2,3,4 };
		int[] num = new int[n];
		int cnt = n;
		int temp = 0;
		for (int i = 0; i < reserve.length; i++) {
			for (int j = i; j < reserve.length; j++) {
				if (reserve[i] > reserve[j]) {
					temp = reserve[i];
					reserve[i] = reserve[j];
					reserve[j] = temp;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			num[i - 1] = i;

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (num[i] == lost[j]) {
					num[i] = 0;
				}
			}
			System.out.print(num[i] + " ");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (num[i] == 0) {
					if (i + 1 == reserve[j]) {
						num[i] = i + 1;
						reserve[j] = 0;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (num[i] == 0) {
					if (i <= reserve[j] && i + 2 >= reserve[j] && reserve[j]!=0) {
					
						num[i] = i + 1;
						reserve[j] = 0;
						System.out.println();
						System.out.print("i : " + i + " num[i] : " + num[i] + " ");
					}
				}
			}
		}

		System.out.println();
		for (int i = 0; i < n; i++) {

			System.out.print(num[i] + " ");
			if (num[i] == 0)
				cnt--;
		}

		System.out.println(cnt);
	}

}
