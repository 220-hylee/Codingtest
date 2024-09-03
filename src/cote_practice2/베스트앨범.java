package cote_practice2;
// 각각각을 어떻게 연결시켜서 관리하는게 좋은지?

// key value구조
// hashmap으로 다시풀기

// 자료구조 완벽하게 구현하기.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Music implements Comparable<Music> {
	private int i;
	private String genres;
	private int plays;

	public Music(int i, String genres, int plays) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.genres = genres;
		this.plays = plays;
	}

	public int getPlays() {
		return plays;
	}

	public int getI() {
		return i;
	}

	public String getGenres() {
		return genres;
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		if (o.genres == genres)
			return o.getPlays() - getPlays();
		else
			return 0;

	}

	public String toString() {
		return i + genres + plays;
	}

}

public class 베스트앨범 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<>();
		String[] genres = { "classic", "pop", "classic", "classic", "pop"};
		String[] temp = new String[genres.length+1];
		HashMap<String, Integer> save = new HashMap<>();
		int[] plays = { 500, 600, 150, 800, 2500};
		HashMap<String, ArrayList<Music>> arr = new HashMap<String, ArrayList<Music>>();

		int cnt = 0;
		int count = 0;
		int sumcnt = 0;
		String str;
		for (int i = 0; i < genres.length; i++) {
			if (save.get(genres[i]) == null) {
				save.put(genres[i], plays[i]);
				temp[cnt] = genres[i];
				count++;
				cnt++;
			} else
				save.put(genres[i], save.get(genres[i]) + plays[i]);
		}
		System.out.println(save);
		
		
		for(String name : save.keySet()) {
			int value = save.get(name);
			System.out.println(name + " : "+ value);
			ArrayList<Music> music = new ArrayList<Music>();
			for(int i=0; i<genres.length; i++) {
				if(genres[i].equals(name))
					music.add(new Music(i, genres[i], plays[i]));
			}
			arr.put(name, music);
		}
		System.out.println(arr);
		
		
		if (genres.length != 1) {
			for (int i = 0; temp[i] != null; i++) {
				for (int j = i + 1; temp[j] != null; j++) {
					System.out.println(i + " " + j);
					if (save.get(temp[i]) < save.get(temp[j])) {
						str = temp[i];
						temp[i] = temp[j];
						temp[j] = str;
					}

				}

				System.out.println(temp[i] + " ");

			}
		} else {
			temp[0]=genres[0];
		}

		cnt = 0;
		System.out.println(count + "!!");
		int[] val = new int[count];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < genres.length; j++) {
				if (temp[i].equals(genres[j])) {
					val[i] += 1;
				}
			}

			if (val[i] == 1) {
				sumcnt += 1;
			} else if (val[i] > 1) {
				sumcnt += 2;
			}
		}
		System.out.println("!!!!"+sumcnt);
		int test = 0;
		int[] answer = new int[sumcnt];
		for (int i = 0;i<count; i++) {
			test = i;
			for (int j = 0; j < genres.length; j++) {
				if (temp[i].equals(genres[j])) {
					list.add(new Music(j, temp[i], plays[j]));
//					if(cnt<sumcnt)
//						answer[cnt]= j;
//					cnt++;
				}
			}

			
		}
		int samecnt = 0;
		Collections.sort(list);
		System.out.println(test);
		count = 0;
		for (int i = 0; i < genres.length; i++) {
			
			if (cnt == test + 1) {
				break;
			}
			if(count==sumcnt)
				break;
			if (temp[cnt].equals(list.get(i).getGenres())) {
				samecnt++;
				if(samecnt!=3) {
					answer[count] = list.get(i).getI();
					System.out.print(answer[count] + " ");
					count++;
				}

			} else {
				cnt++;
				samecnt=0;
				i--;
			}
			

		}

	}

}
