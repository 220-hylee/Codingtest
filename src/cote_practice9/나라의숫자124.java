package cote_practice9;

// 3진수로 푸는게 아닌가?

import java.util.ArrayList;

public class 나라의숫자124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 27;
		int mok = 0;
		int mod = 0;
		
		String str = "";
		String result = "";
		ArrayList<Integer> arr = new ArrayList<>();
		boolean run = true;
		
		while(true) {
			mod = n%3;
			mok = n/3;
			n=n/3;
			arr.add(mod);
			if(mok<3) {
				arr.add(mok);
				break;
			}
		}
		//System.out.println(arr);
		
		for(int i=arr.size()-1; i>=0; i--) {
			int temp = arr.get(i);
			arr.remove(i);
			if(temp == -1) {
				temp = 2;
			}
			switch(temp) {
			case 0:
				arr.add(4);
				arr.set(i-1, arr.get(i)-1);
				break;
			case 1:
				arr.add(1);
				break;
			case 2:
				arr.add(2);
				break;
			}
			System.out.println(arr);
			//arr.add(temp);
		}
		
		
	}
	

}
