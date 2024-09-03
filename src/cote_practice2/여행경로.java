package cote_practice2;
// 다시풀어보기
public class 여행경로 {
	static int count = 0;
	static int count2 = 0;
	static String[][] result;
	static int rCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tickets = { { "ICN", "BOO" }, { "ICN", "COO" }, { "COO", "DOO" }, { "DOO", "COO" }, { "BOO", "DOO" },
				{ "DOO", "BOO" }, { "BOO", "ICN" }, { "COO", "BOO" } };
		result = new String[100][tickets.length + 1];
		String[][] results = new String[tickets.length][tickets[0].length];
		String[][] temp = new String[tickets.length][tickets[0].length];
		for (int i = 0; i < tickets.length; i++) {
			for (int j = 0; j < tickets[0].length; j++) {
				results[i][j] = tickets[i][j];
			}
		}
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				dfs(tickets, i);
				for (int a = 0; a < tickets.length; a++) {
					for (int b = 0; b < tickets[0].length; b++) {

						tickets[a][b] = results[a][b];

					}
				}
				// System.out.println();
			}
		}
		int mincount = 0;
		for (int i = 1; i < rCount; i++) {

			if (result[mincount][result[0].length - 1] != null && result[i][result[0].length - 1] != null) {
				if (result[mincount][1] != null && result[i][1] != null) {
					if (result[mincount][1].charAt(0) < result[i][1].charAt(0)) {

						rCount = mincount;
					} else {

						rCount = i;
						mincount = i;
					}
				}

			}

		}
		for (int i = 0; i < result[0].length; i++) {

			System.out.println(result[2][i]);
		}

	}

	private static void dfs(String[][] tickets, int i) {
		// TODO Auto-generated method stub
		String str;

		result[rCount][0] = "ICN";
		count++;

		str = tickets[i][1];

		if (count2 == result[rCount].length - 2) {
			result[rCount][count2 + 1] = str;
		}

		for (int j = 0; j < tickets.length; j++) {
			if (str.equals(tickets[j][0])) {

				if (!tickets[j][1].isEmpty()) {
					count2++;
					result[rCount][count2] = str;
					tickets[i][0] = "";
					tickets[i][1] = "";
					dfs(tickets, j);
				} else {
					count2++;

				}
				if (count == tickets.length) {
					count2 = 0;
					rCount++;
					
				}
				count--;
			}
		}

		tickets[i][0] = "";
		tickets[i][1] = "";
	}

}
