package cote_practice3;

// 경우의 수를 어떻게 가져가야 할지.

import java.util.ArrayList;
import java.util.HashMap;



class Cloth{
	private String list;
	private String item;
	private int i;
	Cloth(String list, String item){
		this.list=list;
		this.item=item;
//		this.i = i;
		
	}
	public String getList() {
		return list;
	}
	public String getItem() {
		return item;
	}
	public String toString() {
		return item;
	}
	
}
public class 의상 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = //{{"a", "headgear"}, {"b", "headgear"}, {"c", "eyewear"}, {"d", "eyewear"}, {"e", "face"}, {"f", "face"}};
			//{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
			{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		HashMap<String, String> list = new HashMap<>();
		HashMap<String, ArrayList<Cloth>> hash = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			list.put(clothes[i][1], clothes[i][0]);
		}
		//System.out.println(list);
		for(String name : list.keySet()) {
			ArrayList arr = new ArrayList<>();
			for(int i=0; i<clothes.length; i++) {
				if(clothes[i][1].equals(name))
					arr.add(new Cloth(name,clothes[i][0]));
			}
			
			hash.put(name, arr);
		}
		System.out.println(hash);
		int val = 0;
		
		int[] value = new int[hash.size()];
		int cnt =0;
		int sum =1;
		for(String key : hash.keySet()) {
			value[cnt]=hash.get(key).size()+1;
			val+=value[cnt];
			sum=sum*value[cnt];
			cnt++;
			
		}
		if(cnt==1) {
			sum=val;
		}
		sum-=1;
		System.out.println(sum);
		

	}

}
