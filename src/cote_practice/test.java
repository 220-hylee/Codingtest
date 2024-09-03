package cote_practice;

public class test {
	class Solution {
		public int solution(int[][] dots) {
			int answer = 0;
			int i = 0;
			int j = 0;
			int add_x = 0;
			int add_y = 0;
			double[] g = new double[12];
			int cnt = 0;
			int result = 0;

			for (i = 0; i < dots.length; i++) {
				for (j = 0 + 1; j < dots.length; j++) {
					add_y = dots[i][1] - dots[i + j][1];
					add_x = dots[0][i] - dots[0][i + j];
					g[cnt] = add_y / add_x;
				}
			}
			for (i = 0; i < g.length; i++)

			{
				for (j = i + 1; j < g.length; j++) {
					if (g[i] == g[j])
						result++;
				}
			}
			answer = result;
			return answer;
		}
	}
}
