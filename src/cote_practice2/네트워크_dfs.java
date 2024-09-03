package cote_practice2;

public class 네트워크_dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[][] computers = { { 1,1,1,0,0,0,0},{1,1,0,1,1,0,0},{1,0,1,0,0,1,0},{0,1,0,1,0,0,0},{0,1,0,0,1,0,0},{0,0,1,0,0,1,1},{0,0,0,0,0,1,1} };

		int[] visit = new int[n];
		int z = 0;
		for (int i = 0; i < n; i++) {

			if (visit[i] == 0) {
				dfs(computers, visit, i);
				z++;
			}

		}
		System.out.println(z);

	}

	private static void dfs(int[][] computers, int[] visit, int i) {
		// TODO Auto-generated method stub
		visit[i] = 1;
		for (int j = 0; j < computers.length; j++) {
			System.out.println("i : "+i+"  j : "+j);
			if (visit[j] == 0 && computers[i][j] == 1) {
			    System.out.println("1");
				dfs(computers, visit, j);

			}
		}
	}

}
