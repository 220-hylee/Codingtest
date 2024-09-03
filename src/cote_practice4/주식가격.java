package cote_practice4;

import java.util.Stack;

// 큐랑 스텍에서 어떤 개념인지??
// 큐랑 비슷하게 구현하긴 함.
// 스텍으로 구현해보기.
// 구현은 했는데, 시간복잡도를 넘어갈 방법을 모르겠음.
// 스택으로 구현하니까, 스택을 비웠다가 가득채웠다를 매번 반복하는걸 해결해야 되는데, 방법을 모르겟음.
// [4,3,2,1,0](초기값) 을 미리 깔아놓고,
// 스텍에는 주식값이 떨어지지 않는 한,번지수를 저장한다.


public class 주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] result = new int[prices.length];

		Stack<Integer> sta = new Stack<>();
		int count = 0;
		int cnt=0;
		while (count < prices.length) {
			for (int i = prices.length - 1; i >= count; i--) {
				sta.push(prices[i]);
			}
		
			
			for (int j = count; j < prices.length; j++) {
				int temp = sta.pop();
				cnt++;
				if (temp >= prices[count]) {
					
				} else if(cnt>0) {
					break;
				}
			}
		
			result[count]=cnt-1;
			cnt=0;
			System.out.println(result[count]);
			count++;
		}

//		int count =0;
//		int temp =0;
//		for(int i=0; i<price.length; i++) {
//			
//			for(int j=i+1; j<price.length; j++) {
//				if(price[i] <= price[j]) {
//					count++;
//				} else {
//					count++;
//					break;
//				}
//					
//			}
//			result[i] = count;
//			count=0;
//		}
//		for(int data : result) {
//			System.out.println(data);
//		}

	}

}
