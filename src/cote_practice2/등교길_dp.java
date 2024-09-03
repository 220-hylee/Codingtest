package cote_practice2;

public class 등교길_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 100;
		int n = 100;
		int[][] puddles = { { 2, 2 }, { 1, 4 } ,{4,2},{4,4}};
		int[][] path = new int[n][m];
		int x = 0;
		int y = 0;
		for (int i = 0; i < puddles.length; i++) {

			path[puddles[i][1] - 1][puddles[i][0] - 1] = -1;

		}
		path[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (path[i][j] != -1) {
					if (i == 0 && j !=0) {
						if(path[i][j-1] == 1)
							path[i][j]=path[i][j-1];
					}
					if (j == 0 && i !=0) {
						if(path[i-1][j] == 1)
							path[i][j]=1;
					}
					if (j != 0 && i != 0) {
						if (path[i][j - 1] >= 1) {
							path[i][j]=path[i][j-1]%1000000007;
							if (path[i - 1][j] >= 1) {
								path[i][j] = (path[i - 1][j] + path[i][j - 1])%1000000007;
							}
						} else if(path[i-1][j]>=1) {
							path[i][j]=path[i-1][j]%1000000007;
						}
					}
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(path[i][j]+ "  ");
			}
			System.out.println();
		}
		int mod =0;
		mod= path[n-1][m-1]%1000000007;
		System.out.println(mod);

	}

}
