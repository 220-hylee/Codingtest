package cote_practice;

public class P07_9x9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=1;
		
		
		for(x=2; x<=9; x++) {
			System.out.printf("%2d X %2d = %2d   ",x,y,x*y);
			if(x==9 && y<9) {
				y++;
				x=1;
				System.out.println();
			}
		}
	}

}
