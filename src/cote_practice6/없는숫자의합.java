package cote_practice6;

public class 없는숫자의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,3,4,6,7,8,0};
		int sum =0;
		for(int data: number) {
			sum+=data;
		}
		sum=45-sum;
		System.out.println(sum);
		
		
	}

}
