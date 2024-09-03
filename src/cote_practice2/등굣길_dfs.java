package cote_practice2;
//dfs로는 답이 없는가..
//효율성테스트에서 전체오류가 났음.
import java.util.ArrayList;

public class 등굣길_dfs {
	static int sum = 1;
	static int cnt =0;
	static int min = 100000;
	static int mod = 1000000007;
	static ArrayList<Integer> arr = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 3;
		int[][] puddles = { { 2, 2 }};
		int[][] path = new int[n][m];
		int res = 0;
		int x = 0, y = 0;

		for (int i = 0; i < puddles.length; i++) {
			for (int j = 0; j < puddles[0].length; j++) {
				if (puddles[i][j] != 0) {
					if (y == 0)
						y = puddles[i][j];
					else
						x = puddles[i][j];
				}
				if (x != 0 && y != 0) {
					path[x - 1][y - 1] = 2;
					x = 0;
					y = 0;
				}
			}
		}
//		for (int i = 0; i < path.length; i++) {
//			for (int j = 0; j < path[0].length; j++) {
//				if (path[i][j] == 0) {
//					path[i][j] = 1;
//				}
//				System.out.print(path[i][j]);
//			}
//			System.out.println();
//		}
		x = 0;
		y = 0;
		dfs(path, x, y);
		int answer = arr.size() % mod;
		System.out.println(answer);
		System.out.println(cnt);

	}

	private static void dfs(int[][] path, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("x : " + x + "  y :" + y);
		if (x == path.length - 1 && y == path[0].length - 1) {
			arr.add(sum);
			cnt++;

		} else {
			if (y < path[0].length - 1 && path[x][y + 1] != 2) {
				path[x][y + 1] = 0;
				sum++;
				dfs(path, x, y + 1);
				sum--;
				path[x][y + 1] = 1;
			}
			if (x < path.length - 1 && path[x + 1][y] != 2) {
				path[x + 1][y] = 0;
				sum++;
				dfs(path, x + 1, y);
				sum--;
				path[x + 1][y] = 1;
			}
		}

	}

}
