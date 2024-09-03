package cote_practice3;

import java.util.ArrayList;

// 선생님 방법 한번 여쭤보기.

public class 기능개발 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses = { 99,1,99,1};
		int[] speeds = { 1,1,1,1 };
		int[] result = new int[progresses.length];
		int pointer=0;
		ArrayList<Integer> arr = new ArrayList<>();
		int count=1;
	
		int i=0;
		for(int temp : progresses) {
			result[i]= (int) Math.ceil((double)(100-temp)/speeds[i]);
			System.out.println(result[i]);
			i++;
		}
		i=1;
		while(i<result.length) {
			if(result[pointer] >= result[i]) {
				count++;
			}else {
				arr.add(count);
				count=1;
				pointer=i;
				
			}
			i++;
		}
		arr.add(count);
		System.out.println(arr);
		
        int[] answer = new int[arr.size()];
        for(int j=0; j<arr.size(); j++) {
			answer[j]=arr.get(j);
			System.out.println(answer[j]);
		}
		// 스트림 객체를 활용하면 빠름.
        // Array. 뭐 이런 방법도 있음. 서칭필요
		
		
		/*
		int cnt = 0;
		int result = 0;
		int cnt2 = -1;
		int[] data = new int[progresses.length];
		while (true) {
			if (progresses[cnt] >= 100) {
				data[cnt2]++;
				cnt++;
			} else { 
				for (int i = cnt; i < progresses.length; i++) {

					if (progresses[i] < 100)
						progresses[i] += speeds[i];
					if(progresses[i]>=100){
						progresses[i] = 100;
						if(i==cnt)
							cnt2++;
					}
				}
			}
			if(cnt>=progresses.length)
				break;
		}
		int i=0;
		for(i=0; i<data.length; i++) {
			if(data[i]==0)
				break;
		}
		int[] answer = new int[i];
		for(int j=0; j<answer.length; j++) {
			answer[j]=data[j];
		}
		
		*/
	}

}
