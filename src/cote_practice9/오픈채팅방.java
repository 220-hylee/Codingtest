package cote_practice9;


import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String, String> hm = new HashMap<>();
	
		for(int i=0; i<record.length; i++) {
			String[] str =record[i].split(" ", 0);
			
			if(str[0].equals("Enter") || str[0].equals("Change")) {
				hm.put(str[1], str[2]);
			}
			
		}
	
		ArrayList<String> answer = new ArrayList<>();
		
		for(int i=0; i<record.length; i++) {
			String[] str =record[i].split(" ", 0);
			if(str[0].equals("Enter")) {
				answer.add(hm.get(str[1]) + "님이 들어왔습니다.");
			} else if(str[0].equals("Leave")) {
				answer.add(hm.get(str[1]) + "님이 나갔습니다.");
			}
			
		}
		String[] str = new String[answer.size()-1];
		for(int i=0; i<str.length ; i++) {
			str[i]=answer.get(i);
		}
		
	}

}
