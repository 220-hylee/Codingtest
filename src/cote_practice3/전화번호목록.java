package cote_practice3;
//런타임 에러가 나오고, 뭔가 방법론이 틀린것 같음.

//문자를 -> 숫자로 변환 -> 소팅 -> 숫자를 문자로 변환 ->가장 짧은 자릿수 이하 절삭. -> 같으면 삭
//투포인터? char로 변환해서 일일이 서치?

//직접 해시를 만들어 볼것

//withstart와 같은 접두어를 찾는 함수가 있음.
// 함수를 사용해도 문제는 효율성 테스트에서 문제가 발생했음.
// 속도 단축을 위해서 , 배열을 sorting할 필요가 있었고,
// string 특성상, sorting하면 인접한 배열은 비슷한 접두어를 갖게 된다.
// 이를 활용하여 두번 반복해야 풀 수 있는 문제를 한번의 반복문으로 해결하였다.

import java.util.ArrayList;

public class 전화번호목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
		String[] phone_book = { "119", "97674223", "1195524421" };
		ArrayList<String> arr = new ArrayList<>();
		for (String data : phone_book) {
			arr.add(data);
		}
		arr.sort(null);

		for (int i = 0; i < phone_book.length-1; i++) {

			if (arr.get(i + 1).startsWith(arr.get(i))) {
				answer = false;
				break;
			}

		}
//		
//		arr.sort(null);
//		newPhone[0]=arr.get(0).toString().substring(0, len);	
//		for(int i=1; i<phone_book.length; i++) {
//			newPhone[i]=arr.get(i).toString().substring(0, len);	
//			if(newPhone[0].equals(newPhone[i])) {
//				answer = false;
//				break;
//			}
//		}
//			
		System.out.println(answer);
	}

}
