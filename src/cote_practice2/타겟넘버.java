package cote_practice2;

public class 타겟넘버 {
	static int answer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 4, 1, 2, 1 };
		int target = 4;
		int depth = 0;
		int sum = 0;

		dfs(numbers, depth, target, sum);

		System.out.println(answer);

	}

	private static void dfs(int[] numbers, int depth, int target, int sum) {
		// TODO Auto-generated method stub
		//System.out.println("sum : " + sum);
		if (depth == numbers.length) {
			System.out.println("last : " + sum);
			if (target == sum) {
				answer++;
				System.out.println("a : "+ answer);
			}
		} else {
			//System.out.println(answer);
			
			dfs(numbers, depth + 1, target, sum + numbers[depth]);
			dfs(numbers, depth + 1, target, sum - numbers[depth]);
		}

	}

}
