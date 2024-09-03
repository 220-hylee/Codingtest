package cote_practice2;

import java.util.ArrayList;

public class 가장많이받은선물 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> front = new ArrayList<>();
		ArrayList<String> back = new ArrayList<>();
		// ArrayList<Integer> score = new ArrayList<>();
		String[] friends = { "m", "r", "f", "n" };
		// String[] gifts = { "a b", "b a", "c a", "a c", "a c", "c a" };
		String[] gifts = { "m f", "m f", "r m", "r m", "r m", "f m", "f r", "n m" };
		int[] nextMonth = new int[friends.length];
		int space = 0;
		int[][] score = new int[friends.length][friends.length];
		int[] totalScore = new int[friends.length];

		for (int i = 0; i < friends.length; i++) {
			for (int j = 0; j < friends.length; j++) {
				if (i != j) {
					for (String search : gifts) {
						space = search.indexOf(" ");
						if (friends[i].equals(search.substring(0, space))) {
							if (search.substring(space + 1).equals(friends[j])) {
								score[i][j] += 1;

							}
						}

					}
				}
				totalScore[i] += score[i][j];
				System.out.print(" " + score[i][j]);
			}
			System.out.println("  = " + totalScore[i]);
		}
		int max = 0;
		int[] giftSco = new int[friends.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (i != j) {
					giftSco[i] = giftSco[i] + score[i][j];
					giftSco[i] = giftSco[i] - score[j][i];
				}
			}
		}
		int round = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (i != j) {
					// if(score[i][j] !=0 || score[j][i] !=0){
					if (score[i][j] > score[j][i]) {
						nextMonth[i] += 1;
						// } else if (score[j][i] > score[i][j]) {
						// nextMonth[j] += 1;
					}
					// }
				}

			}
			System.out.print("**" + nextMonth[i]);

		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (i != j) {
					if (score[i][j] == score[j][i]) {
						if (giftSco[i] > giftSco[j])
							nextMonth[i]++;
						else if (giftSco[j] > giftSco[i])
							nextMonth[j]++;
					}
				}
				// System.out.println("**"+nextMonth[i]+" "+i+ " "+j);

			}

			System.out.println("*" + giftSco[i]);

		}
		// nextMonth[maxPointer]++;
		for (int i = 0; i < nextMonth.length; i++) {

			if (max < nextMonth[i])
				max = nextMonth[i];

		}

		int answer = max;
	
		System.out.println(answer);
	}

}
