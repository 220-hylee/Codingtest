package cote_practice4;

//방법에 대해 약간 고민이 좀 더 필요할 것 같음.
// 일일이 돌려서 확인해야되나?
// 숫자의 첫번째 수를 비교해서 내림차순으로 정렬
// 만약첫번째 수가 같은 경우, 두번째 수를 비교 .. 이게 맞나?

// 숫자를 숫자로 푸는것이 아닌, 문자열로 푸는 방법
// 3과 30을 비교하면, 3이 우선순위가 높아야 하는데, 문자열로 3과 30을 비교하면, 30이 큼.
// 그래서비교 우위를 갖기 위해서 3을 "3"+"3"+"3"을 해서 333을 만듦. 같은 방법을 30 은 303030을 만듦
// 3을 33으로 만들어도 괜찮을것 같지만, 오류가 있음. 3, 330을 비교하면, 33, 330330인데 이때 330이 비교 우위에 있음.
// 실제로는 3이 330보다 커야함.

import java.util.ArrayList;
import java.util.Comparator;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		int[] numbers = { 1000,0,1};
		String[] num = new String[numbers.length];
		
		ArrayList<String> list = new ArrayList<>();
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			num[i] = "";
			num[i] += numbers[i];
			if(numbers[i]==0) {
				count++;
			}
			//System.out.println(num[i]);
		}
		if(count==numbers.length);
		//	return -1;
		String temp = "";
		String tmp1="";
		String tmp2="";
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
		}
		list.sort(Comparator.reverseOrder());
		//System.out.println(list);
		for(int i=0; i<list.size()-1; i++) {

			if(list.get(i).charAt(0)==list.get(i+1).charAt(0)) {
				tmp1=list.get(i)+list.get(i)+list.get(i)+list.get(i);
				tmp2=list.get(i+1)+list.get(i+1)+list.get(i+1)+list.get(i+1);
			
				if(tmp1.compareTo(tmp2)<0) {
					temp=list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					if(i>1)
						i=i-2;
				}
			}
		}
		System.out.println(list);
		for(String data: list) {
			answer+=data;
		}
		
	}

}
