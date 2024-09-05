package sep_1st;

public class 행렬의곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
		int[][] arr2 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };
//		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
//		int[][] arr2 = { { 3, 3, 3 }, { 3, 3, 3 } };

		int[][] result = new int[arr1.length][arr2[0].length];

		int temp = 0;
		for (int z = 0; z < arr1.length; z++) {
			for (int i = 0; i < arr2[0].length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					temp = arr1[z][j] * arr2[j][i] + temp;
					System.out.println(temp);
				}
				result[z][i] = temp;
				temp = 0;
			}
		}
		for(int i=0; i<result[0].length; i++) {
			for(int j=0; j<result.length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
