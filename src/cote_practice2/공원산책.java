package cote_practice2;

public class 공원산책 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] park = { "OSO", "OOO", "OXO", "OOO" };
		String[] routes = { "E 2", "S 3", "W 1" };
		char[][] parkDetail = new char[park.length][park[0].length()];

		int x = 0, y = 0;
		char way = ' ';
		int distance = 0;
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[0].length(); j++) {
				parkDetail[i][j] = park[i].charAt(j);
				if (parkDetail[i][j] == 'S') {
					x = j;
					y = i;

				}
				System.out.print(parkDetail[i][j] + " ");
			}
			System.out.println();
		}
		int rollback = 0;
		int tx = 0, ty = 0;
		for (int i = 0; i < routes.length; i++) {
			way = routes[i].charAt(0);
			distance = routes[i].charAt(2) - 48;
			tx = x;
			ty = y;
			for (int j = 0; j < distance; j++) {
				System.out.println(x + " " + y);
				switch (way) {
				case 'E':
					x++;
					break;
				case 'W':
					x--;
					break;
				case 'S':
					y++;
					break;
				case 'N':
					y--;
					break;
				}
				// System.out.println(parkDetail[0][2]);
				if (x >= parkDetail[0].length) {

					rollback = 1;
					break;
				}
				if (y >= parkDetail.length) {

					rollback = 1;
					break;
				}
				if (x < 0) {

					rollback = 1;
					break;
				}
				if (y < 0) {

					rollback = 1;
					break;
				}
				// System.out.println(parkDetail[y][x]);
				if (parkDetail[y][x] == 'X' || parkDetail[y][x] == 0) {
					rollback = 1;
				}
				System.out.println(x + " " + y);
			}
			if (rollback == 1) {
				x = tx;
				y = ty;
				rollback = 0;
			}
		}

	}

}
