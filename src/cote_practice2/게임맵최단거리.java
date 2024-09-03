package cote_practice2;
//시간초과가납니다.
// 재귀함수로는시간초과의 문제를 해결할 방법이 없는지?
// 이문제에서는 dfs방법론으로는 해결하기가 쉽지 않아 보임.
// bfs로 큐로 풀어보기


public class 게임맵최단거리 {
	static int sum = 1;
	static int min = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		int[][] visit = new int[maps.length][maps[0].length];
		int i = 0;
		int j = 0;
		dfs(maps, i, j);
		if (min == 10000)
			min = -1;
		System.out.println(min);
	}

	private static void dfs(int[][] maps, int i, int j) {
		// TODO Auto-generated method stub

		// System.out.println("sum : "+sum);
		if (i == maps.length - 1 && j == maps[0].length - 1) {
			min=Math.min(min, sum);
			System.out.println("끝~");
		} else {

			if (j < maps[0].length - 1 && maps[i][j + 1] != 0) { // 우측으로 갈 수 있을때

				maps[i][j + 1] = 0;  // 우측을 벽으로 만들고, (이동을 했을때,이동한 루트를 벽으로 만들어서 돌아오지 못하도록 함.)
				// System.out.println("i : " + i + " j : " + j);
				// System.out.println(sum);
				sum++; // 한칸 이동하고,
				dfs(maps, i, j + 1); // 이동한 칸으로 다시 재귀함수 호출

				maps[i][j + 1] = 1; // 재귀함수에서 복귀하면 다시 맵을 원상복구 시킴.
			} else if (i < maps.length - 1 && maps[i + 1][j] != 0) {

				System.out.println("i : " + i + " j : " + j);
				sum++;
				maps[i + 1][j] = 0;
				dfs(maps, i + 1, j);
				maps[i + 1][j] = 1;
			} else if (i > 0 && maps[i - 1][j] != 0) {

				sum++;
				maps[i - 1][j] = 0;
				System.out.println("i : " + i + " j : " + j);
				dfs(maps, i - 1, j);
				maps[i - 1][j] = 1;
			} else if (j > 0 && maps[i][j - 1] != 0) {

				sum++;
				maps[i][j - 1] = 0;
				System.out.println("i : " + i + " j : " + j);
				dfs(maps, i, j - 1);
				maps[i][j - 1] = 1;
			}

		}
	}

}
