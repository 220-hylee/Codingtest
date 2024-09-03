package cote_practice4;
// 내 논리에 뭔가 구멍이 있는것 같다.
// 선생님과 코드 한번 들여다 보기
// compareTo한번 고민해보기.
// 중간 구조가 구멍이 난것 같음.

import java.util.HashMap;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jobs= {{0,3},{4,3},{8,1}};
		PriorityQueue<Integer> job = new PriorityQueue<>();
		PriorityQueue<Integer> hold = new PriorityQueue<>();
	
		int pointer=0;
		int pop_point=0;
		int sum=0;
		int count=0;
		int temp =0;
	
		while(true) {
			//System.out.println(pointer);
			for(int i=0; i<jobs.length; i++) {
				if(pointer==jobs[i][0]) {
					job.add(jobs[i][1]);
					
				}				
			}
			
			
			if(hold.size()==0)
			{
				if (job.size() != 0) {
					pop_point =temp+pop_point+ job.peek();
					hold.add(job.poll());
					temp=0;
				}
			} else {
				if(pop_point==pointer) {
					for(int i=0; i<jobs.length; i++) {
						if(jobs[i][1]==hold.peek()) {
							sum=sum+(pop_point-jobs[i][0]);

						}
					}
					System.out.println(sum);
					
					hold.poll();
					count++;
				}
			}
			if(job.size()==0 && hold.size()==0) {
				temp++;
			}
			if(count==jobs.length) {
				break;
			}
			pointer++;
		}
		System.out.println(sum/3);
		
	}

}
