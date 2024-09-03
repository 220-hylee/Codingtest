package cote_practice2;

import java.math.BigInteger;
import java.util.ArrayList;


// 런타임 오류가 나는 이유. -> 확인
// 시간초과가 나는 이유.

public class k진수에서소수개수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 524287;
		int k = 2;

		BigInteger mod = new BigInteger("0");
		BigInteger res = new BigInteger(Integer.toString(n));
		BigInteger kk = new BigInteger(Integer.toString(k));
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		int answer = 0;
		String num = "";
		ArrayList<BigInteger> arr = new ArrayList<>();
		ArrayList<BigInteger> arr2 = new ArrayList<>();

		while (mod.compareTo(res) == -1) {
			mod = res.remainder(kk);

			res = res.divide(kk);
			System.out.println("res : " + res + "  mod : " + mod);
			arr.add(mod);
		}
		arr.add(res);
		System.out.println(arr);

		for (int i = arr.size() - 1; i >= 0; i--) {

			if (arr.get(i).compareTo(zero) != 0) {
				num = num + arr.get(i);
				// System.out.println(Integer.parseInt(num));
			} else if (arr.get(i).compareTo(zero) == 0 && num != "") {

				if (Integer.parseInt(num) == 1) {
					num = "";
				} else {
					arr2.add(new BigInteger(num));
					num = "";
				}
			}
			if (i == 0 && num != "") {
				if (Long.parseLong(num) == 1) {
					num = "";
				} else {
					arr2.add(new BigInteger(num));
					num = "";
				}
			}
		}
		int cnt = 0;
		int cnt2 = 0;

		for (BigInteger data : arr2) {
			System.out.println(data.longValue());
			if (data.longValue() < 100000) {
				for (int j = 2; j < data.divide(two).intValue(); j++) {
					BigInteger jj = new BigInteger(Integer.toString(j));
					if (data.remainder(jj).intValue()==0) {
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				cnt2++;
			}

		}
		

	}

}
