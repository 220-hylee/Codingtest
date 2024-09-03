package cote_practice;

public class P03_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int z = 0;

		for (i = 0; i < 5; i++) {
			for (z = 5; z >	i; z--)
				System.out.print(" ");
			for (j = 0; j < i * 2+1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		z = 0;

		for (i = 0; i < 5; i++) {
			for (z = 5; z > i; z--)
				System.out.print(" ");
			for (j = 0; j < i * 2 + 1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 0; i--) {
			for (z = 5; z >= i; z--)
				System.out.print(" ");
			for (j = 0; j < i * 2 -1 ; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
