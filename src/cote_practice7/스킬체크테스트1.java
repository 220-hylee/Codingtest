package cote_practice7;

public class 스킬체크테스트1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0;
		 int b=10000000;
		 
		 long sum =0;
		 if(a>b) {
			 int temp =a;
			 a=b;
			 b=temp;
			 
		 }
//		 else if (a==b) {
//			 return a;
//		 }
		 for(int i=a; i<=b; i++) {
			 sum +=i;
		 }
		 System.out.println(sum);
		 
	}

}
