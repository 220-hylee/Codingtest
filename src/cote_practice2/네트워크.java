package cote_practice2;

// 깊이/ 너비 우선탐색(DFS/ BFS)가 무엇인지?

//dfs의 경우에는 한방향을 우선으로 끝까지 가보자
// 끝까지 가서 갈곳이 없을때 한 지점을 되돌아 와서 다음길을 찾는다.
// 왼쪽이던 오른쪽이던 한군데 정해서 내려가는 방법
// 구현은 재귀함수로 구현한다.
// 스택구조임.
// 재귀로 구현하는게 코드상 복잡도가 낮음.

// bfs깊이를 내려가기 전에 같은 레벨의 모든 값을 경유한다.
// 옆으로 먼저 훑는다.
// 옆으로 끝까지 훑으면 다시 처음으로 돌아와서 한 노드 내려감.
// 자료구조상큐를 써야함.



//행렬의 대칭의 방법으로 해결하려고 접근했으나,
// 잘못된 접근인지?
public class 네트워크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 }};
//		int[][] computers = { { 1, 0, 0, 0, 0, 0, 1 }, { 0, 1, 1, 0, 1, 0, 0 }, { 0, 1, 1, 1, 0, 0, 0 },
//				{ 0, 0, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1, 1 } };
//		int count = 0;
//		int two=0;
//		int three=0;
//		for (int i = 0; i < computers.length; i++) {
//			for (int j = 0; j < computers.length; j++) {
//				// System.out.print(computers[i][j]);
//				if (i != j) {
//					if (computers[i][j] == 1 && computers[j][i] == 1) {
//						System.out.println(i + " " + j);
//						System.out.println(computers[i][j] + " " + computers[j][i]);
//						count++;
//					}
//				}
//			
//			}
//			System.out.println();
//		}
//		count = count / 2;
//		System.out.println(count);
		int[] visited = new int [n];
		int result = 0;
		for(int i=0; i<n; i++) {
			if(visited[i] == 0) {
				System.out.println("i : " + i);
				dfs(i, computers, visited);
				result++;
			}
			
		}
		System.out.println();
		System.out.println(result);
		
		
		
		
		
	}

	public static void dfs(int i, int[][] computers, int[] visited) {
		// TODO Auto-generated method stub
		visited[i] =1;
		for(int j=0; j<computers.length; j++) {
			//System.out.print(j);
			if(visited[j] ==0 && computers[i][j] ==1) {
				System.out.println("j : " +j);
				//System.out.println(computers[i][j]);
				dfs(j,computers, visited);
				System.out.println();
			} else {
				System.out.println();
//				System.out.println("dfs ( i ) : "+i);
//				System.out.println("j (x) : "+ j);
			}
		}
	}

}
