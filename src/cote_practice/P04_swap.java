package cote_practice;

public class P04_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=31;
		double b=23;
		System.out.println("before swap");
		System.out.println("a : "+a+"   b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap");
		System.out.println("a : "+a+"   b : "+b);
		
		System.out.println("before swap");
		System.out.println("a : "+a+"   b : "+b);
		a=a/b;
		b=a*b;
		a=b/a;
		System.out.println("after swap");
		System.out.println("a : "+a+"   b : "+b);
	}

}
