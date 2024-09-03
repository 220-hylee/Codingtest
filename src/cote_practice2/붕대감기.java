package cote_practice2;

public class 붕대감기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[] bandage = { 5, 1, 5 };
		int health = 30;
		int max =30;
		int[][] attack = { { 2, 20 }, { 9, 15 }, { 10, 5 }, { 11, 5 } };
		// [5, 1, 5] 30 [[2, 10], [9, 15], [10, 5], [11, 5]] 5
		int sec = 1;
		int sec2 = 1;
		int alpa = 0;
		int point = 0;
		while (sec < 51) {
			sec++;
			sec2++;
			for (int i = 0; i < attack.length; i++) {
				if (attack[i][0] == sec) {
					health -= attack[i][1];
					sec2 = 0;
					point = 1;
				}
				if (attack[attack.length - 1][0] == sec) {
					answer = health;
				}
			}
			// if(sec == attack[])
			if (point == 0 && health < max) {
				if (sec2 != 0 && sec2 % bandage[0] == 0)
					alpa = bandage[2];
				health = health + 1 + alpa;
			}
			if(health >30)
				health =30;
			point=0;
			alpa = 0;
			System.out.println("sec : " + sec + " - sec2 : " + sec2 + " - health : " + health);

		}
		System.out.println(answer);

	}

}
