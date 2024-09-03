package cote_practice8;

// 거의 무한대 급의 숫자를 제외하고는 성공함.
// int 범위 넘는것에 대해 long으로 처리하였으나, 허용법위 밖임.

// BigInteger사용

import java.util.ArrayList;

public class N개의최소공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4,7,8 };
		ArrayList<Integer> arrX = new ArrayList<>();
		ArrayList<Integer> arrY = new ArrayList<>();
		ArrayList<Integer> save = new ArrayList<>();

		for (int data : arr) {
			arrX.add(data);
		}
		arrX.sort(null);
		boolean run = true;
		int success = 0;
		if (arrX.get(0) == 1) {
			arrX.remove(0);
		}
		if (arr.length != 1) {
			for (int i = 2; i <= arrX.get(arrX.size()-1); i++) { // 큰수로 나눠떨어지는지 확인.

				for (int data : arrX) { //나눠떨어지는
//				System.out.println(data);
					if (data != 1) {
						if (data % i == 0) {
							success++;
							arrY.add(data / i);
						} else {
							arrY.add(data);
						}
					}
				}

				if (success < 2) {  // 나만 나눠 떨어진건지 확인
					success = 0;
					arrY.removeAll(arrY);
				} else { // 2개 이상이 나눠떨어진 경우
					save.add(i); // 나눠떨어진수 저장.
//				System.out.println("hi");
					i--;
					success = 0;
					arrX.removeAll(arrX); // 기존 배열 초기화
					for (int data : arrY) { // 신규 배열을 기존 배열에 저장.
						if (data != 1)
							arrX.add(data);
					}
					arrY.removeAll(arrY);
					arrX.sort(null);
//				System.out.println(arrX);
				}
			}
		}
		long result = 1L;
		System.out.println(save);
		for (int data : save) {
			result *= data;
		}
		for (int data : arrX) {
			result *= data;
		}
		System.out.println(result);

	}

}
