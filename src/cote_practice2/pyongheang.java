package cote_practice2;

public class pyongheang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dots = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } };
		// [[3, 5], [4, 1], [2, 4], [5, 10]]

		int answer = 0;
		int i = 0;
		int j = 0;
		int add_x = 0;
		int add_y = 0;
		float[] g = new float[6];
		int zero = 0;
		int cnt = 0;
		int result = 0;

		for (i = 0; i < dots.length; i++) {
			for (j = i + 1; j < dots.length; j++) {
//				if (dots[i][0] > dots[j][0])
//					add_x = dots[i][0] - dots[j][0];
//				else if (dots[j][0] > dots[i][0])
				add_x = dots[j][0] - dots[i][0];

//				if (dots[i][1] > dots[j][1])
//					add_y = dots[i][1] - dots[j][1];
//				else if (dots[j][1] > dots[i][1])
				add_y = dots[j][1] - dots[i][1];

				g[cnt] = (float) add_y / (float) add_x;
				System.out.println(g[cnt]);
				cnt++;
			}
		}
		for (i = 0; i < g.length; i++) {
			for (j = i+1; j < g.length; j++) {
	                if (g[i] == g[j])
						result++;
			}
		}
		if(result >0)
			answer = 1;
		else
			answer =0;
		
//return answer;

	}

}
