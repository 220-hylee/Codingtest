package cote_practice2;

public class 달리기경주 {
// 시간초과가 뜨는데 어떻게 속도를 단축시킬 수 있는지?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players = {"mumu","soe","poe","kai","mine"};
		String[] callings = {"kai","kai","mine","mine"};
		
		String temp;
		
		for(int i=0; i<callings.length; i++) {
			
			for(int j=0; j<players.length; j++) {
				if(callings[i].equals(players[j])) {
					temp = players[j];
					players[j]=players[j-1];
					players[j-1]=temp;
					break;
				}
			}
		}
//		for(int i=0; i<players.length; i++) {
//			System.out.println(players[i]);
//		}
	}

}
