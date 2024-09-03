package cote_practice;

import java.util.Scanner;

public class P14_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		int[] sort = new int[arrSize];
		int nature = 0;
		int cnt = 0;
		int gap = 0;
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (nature < arr[i]) {
				gap = arr[i]-nature;
				for (int j = 0; j < gap; j++) {
					nature++;
					
					str = str + "+";
					sort[cnt]=nature;
					cnt++;
				}
		
			}
			if(nature>=arr[i]) {
				//System.out.println(sort[cnt]);
				if(sort[cnt-1] == arr[i]) {
					sort[cnt]=0;
					cnt--;
					str = str+"-";
					
				}else
				{
					System.out.println("그만");
					return;
				}
			}
			
			
		}
		System.out.println(str);
		
	}

}
