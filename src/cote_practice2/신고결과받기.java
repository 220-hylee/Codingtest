package cote_practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 신고결과받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {};
		String[] id_list = { "con", "ryan" };
		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" };
		int k = 1; // k번 이상 신고된 유저는 정지

		Map<String,	List<String>> user = new HashMap<>();
		Set<String>[] list;
		ArrayList<String>[] list1;
		list1 = new ArrayList[id_list.length];
		list = new HashSet[id_list.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = new HashSet<String>();
		//	list1[i]= new ArrayList<String>(list[i]);
		}
		for (String data : id_list)
			user.put(data, null);
		// System.out.println(list[0].add("ss"));
		for (String data : report) {
			int space = 0;
			space = data.indexOf(" ");
			for (int i = 0; i < id_list.length; i++) {
				if (data.substring(space + 1).equals(id_list[i])) {
					// list[0].add(data.substring(space+1));
					list[i].add(data.substring(0, space));
				}
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			//	list[i] = new HashSet<String>();
				list1[i]= new ArrayList<String>(list[i]);
			}
		for (int i = 0; i < id_list.length; i++) {
			user.put(id_list[i], list1[i]);
		}
		
		int[] count = new int[id_list.length];
		System.out.println(user);
		for (int i = 0; i < id_list.length; i++) {

			if (user.get(id_list[i]).size() >= k) {
				for (int j = 0; j < user.get(id_list[i]).size(); j++) {
					// System.out.println();
					for (int z = 0; z < id_list.length; z++) {
						if (user.get(id_list[i]).get(j).equals(id_list[z])) {

							// list[0].add(data.substring(space+1));
							count[z] += 1;
							System.out.println(count[z]);
						}
					}
				}

			}

		}
		answer = count;

		// return answer;
	}
}
