package cote_practice;

import java.util.Scanner;

public class P13_DNApassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int strSize = sc.nextInt();
		int conStrSize = sc.nextInt();
		sc.nextLine();
		int[] compare = new int[4];
		String dna = sc.nextLine();
		char[] chDna = new char[dna.length()];
		int[] arr = new int[4];
		boolean run = true;
		int sum = 0;
		int comsum = 0;
		int z = 0;
		int count = 0;
		System.out.println("시작");
		for (int i = 0; i < dna.length(); i++) {
			chDna[i] = dna.charAt(i);
			switch (chDna[i]) {
			case 'A':
				compare[0]++;
				break;
			case 'C':
				compare[1]++;
				break;
			case 'G':
				compare[2]++;
				break;
			case 'T':
				compare[3]++;
				break;
			}
			
		}
//		for (int i = 0; i < 4; i++)
//			System.out.println(compare[i]);
		// sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
//			System.out.print(arr[i]);
			if (arr[i] > compare[i]) {
				run = false;
			}
			sum += arr[i];
		}
		
		for (int i = 0; i < compare.length; i++)
			compare[i] = 0;
//		System.out.println(run);
		while (run) {
//			System.out.println(comsum);
			comsum =0;
			for (int i = z; i < sum + z; i++) {
				switch (chDna[i]) {
				case 'A':
					compare[0]++;
					break;
				case 'C':
					compare[1]++;
					break;
				case 'G':
					compare[2]++;
					break;
				case 'T':
					compare[3]++;
					break;
				}

			}
			
			for( int i=0; i<arr.length; i++) {
				if(compare[i]>=arr[i] && arr[i] != 0)
					comsum++;
			}
			if(comsum == sum)
				count++;
			
			for (int i = 0; i < compare.length; i++)
				compare[i] = 0;
			
			if (sum + z == strSize) {
				run = false;
			} else {
				z++;
				
			}
				

		}
		System.out.println(count);

	}

}
