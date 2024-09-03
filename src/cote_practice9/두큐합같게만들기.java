package cote_practice9;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queue1= {1,1,1,1};
		int[] queue2= {1,1,7,1};
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		long qSum1 = 0;
		long qSum2 = 0;
		int temp = 0;
		int result = 0;
		for(int i=0; i<queue1.length; i++) {
			q1.add(queue1[i]);
			qSum1 += queue1[i];
			q2.add(queue2[i]);
			qSum2 += queue2[i];
			
		}
		if((qSum1+qSum2) % 2 !=0){
//            return -1;
        }
		for(int i=0; i<=queue1.length*2+1; i++) {
			if(qSum1>qSum2) {
                result++;
				temp = q1.poll();
				q2.add(temp);
				qSum1 -= temp;
				qSum2 += temp;
			} else if(qSum1<qSum2) {
                result++;
				temp = q2.poll();
				q1.add(temp);
				qSum1 += temp;
				qSum2 -= temp;
			}
			if(qSum1 == qSum2) {
				break;
			}
		}
//        answer = result;
        if(qSum1 != qSum2) {
//			answer = -1;
		}
		System.out.println(result);
	}
}

