package cote_practice3;
//큐를 직접 코딩으로 만드는 방법 말고 다른방법이 있는지,

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

//		Queue<Integer> startQueue = new LinkedList<>();
		Queue<Integer> bridQueue = new LinkedList<>();
		Queue<Integer> endQueue = new LinkedList<>();
		int pointer = 0;
		int sum = 0;
		int time = 0;
		while (endQueue.size() < truck_weights.length) {
			
			
			System.out.println(bridQueue);
			if (bridge_length == bridQueue.size()) {
				sum-=bridQueue.peek();
				if(bridQueue.peek()==0)
					bridQueue.poll();
				else
					endQueue.offer(bridQueue.poll());
			
			}
			if (pointer < truck_weights.length) {
				if (weight >= sum+truck_weights[pointer]) {
					bridQueue.offer(truck_weights[pointer]);
					sum += truck_weights[pointer];
					pointer++;
				} else {
					bridQueue.offer(0);
				}
			} else {
				bridQueue.offer(0);
			}
		
			time++;
		}
		System.out.println(time);

//		ArrayList<Integer> endArr = new ArrayList<>();
//		ArrayList<Integer> briArr = new ArrayList<>();
//		int sum = 0;
//		int i = 0;
//		int time = 0;
//		while (truct_weights.length != endArr.size()) {
//			time++;
//			if (briArr.size() == bridge_length) {
//				if (briArr.get(0) !=0) {
//					endArr.add(briArr.get(0));
//					sum -= briArr.get(0);
//					briArr.remove(0);
//				} else {
//					briArr.remove(0);
//				}
//
//			}
//			if (briArr.size() < bridge_length) {
//				if (truct_weights.length > i && weight >= truct_weights[i] + sum) {
//					briArr.add(truct_weights[i]);
//					sum += truct_weights[i];
//					i++;
//				} else
//					briArr.add(0);
//			}
//		}

	}

}
