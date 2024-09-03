package cote_practice2;
// 어떤기준에서 처음에 3개를 들고간다고 결정해야 할지.
// 문제 접근법이 어떤게 효과적인지.

// 디그리 알고리즘(탐욕적 알고리즘)
// 아끼다 똥되니까 당장 선택할 수 있는 선택을 선택하도록.
// 현 상황에서 가장 좋은 선택을 함.




public class 택배배달과수거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int n = 5;
		int[] deliveries = { 1, 0, 3, 1, 2 };
		int[] pickups = { 0, 3, 0, 4, 0};
		int gotruck = 0;
		int backtruck=0;
		int total =0;
		int temp =0;
		int temp2=0;
		for(int i=deliveries.length-1; i>=0; i--) {
			temp2 = deliveries[i]+temp2;
			if(temp2== cap) {
				gotruck=temp2;
				break;
			} else if(temp2>cap) {
				gotruck=temp2-deliveries[i];
				break;
			}
		}
		System.out.println(gotruck);
		while (true) {
			temp = gotruck;
			
			if (deliveries[n-1] != 0) {
				for (int i = 0; i < temp; i++) {
					
					gotruck--;
					deliveries[n-1]--;
					System.out.println("deliveries : "+n+" "+deliveries[n-1]);
					System.out.println("go : "+gotruck);
					if(gotruck ==0 || deliveries[n-1] ==0) {
						break;
					}
				}
				
			} 
			if(pickups[n-1] != 0) {
				
				for (int i = 0; i < cap - gotruck; i++) {
					System.out.println("pickups : "+n+" "+pickups[n-1]);
					pickups[n-1]--;
					backtruck++;
					System.out.println("back"+backtruck);
					if(backtruck==cap)
						break;
				}
			} 
			System.out.println("n : " +n);
			
			if(backtruck==cap)
			{
				gotruck =cap;
				backtruck =0;
				total = total +(n*2);
				System.out.println("total : "+total);
			} 
			n--;;
			if(n==0)
				break;
		}
		//System.out.println(total);
	}

}
