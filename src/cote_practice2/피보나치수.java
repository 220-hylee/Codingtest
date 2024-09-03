package cote_practice2;

import java.math.BigInteger;

public class 피보나치수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		BigInteger modd = new BigInteger("1234567");
		int answer = 0;
		for (int j = 0; j < n-1; j++) {
			sum = num1.add(num2);
			num1 = num2;
			num2 = sum;
			System.out.println(num2);
		}
		answer = num2.remainder(modd).intValue();
		
		System.out.println(answer);
		

	}

}
