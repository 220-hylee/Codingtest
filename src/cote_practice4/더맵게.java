package cote_practice4;
// 시간초과가 뜨는데, 혹시 개선 방법은?
// sort가 너무 메모리를 소모하는 것 같은데, 뭔가 좋은 방법은??
import java.util.ArrayList;
import java.util.PriorityQueue;

public class 더맵게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1,2,3,9,10,12};
		int K=7;
		int cal =0;
		int count=0;
		int temp =0;
		PriorityQueue<Integer> priQue = new PriorityQueue<>();
		for(int data : scoville)
			priQue.add(data);
		
		//System.out.println(priQue);
		
		while(true) {
			if(priQue.size()==1 && priQue.peek()<K) {
				count=-1;
				//return -1;
			}
			System.out.println(priQue);
			if(priQue.peek()<K) {
				temp = priQue.poll();
				cal = temp +(priQue.poll()*2);
				
				priQue.offer(cal);
			} else
				break;
			count++;
			
		}
		System.out.println(count);
		
		
		/*
		ArrayList <Integer> arr = new ArrayList<>();
		
		
		for(int data : scoville)
			arr.add(data);
		arr.sort(null);
	
		while(true) {
			if(arr.size()==1 && arr.get(0)<K) {
				count=-1;
				break;
			}
				
			if(arr.get(0)<K) {
				cal = arr.get(0)+(arr.get(1)*2);
				arr.set(0, cal);
				arr.remove(1);
				arr.
				sort(null);
			} else
				break;
			
			count++;
			
		}
		System.out.println(count);
		*/
	}

}
