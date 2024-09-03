package cote_practice6;

// 알파벳의 정중앙에서 크고 작음을 파악하는게 좋을 것 같음.

// a를 만날때마다, 그 상황에서 뒤로가거나 앞으로가는 선택을 둘다 돌리고, 유리한걸 저장.
// 위아래 따로, 좌우 따로 관리

public class 조이스틱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JAN";
		String str = "";
		int[] ch = new int[name.length()];
		int sum = 0;
		int cnt=0;
		int max=0;
		int point=0;
		int pointend=0;
		int routeA =0;
		int routeB=0;
		for (int i = 0; i < name.length(); i++) {
			if(cnt>max) {
				max=cnt;
				point=i-cnt;
				pointend=i;
			}
			if(name.charAt(i)=='A') {
				cnt++;
			} else {
				cnt=0;
			}
			
			str += "A";
		}
		System.out.println(pointend);
		int i = 0;
		int count = 0;
		while (count < name.length()) {

			ch[i] = name.charAt(i) - str.charAt(i);

			if (ch[i] > 13)
				ch[i] = (str.charAt(i) + 26) - name.charAt(i);
			System.out.println(ch[i]);
			sum += ch[i];
			count++;
			i++;
		}
		System.out.println(sum);
		count=0;
		i=0;
		routeA=name.length()-1 + sum;
		
		routeB=((point-1)*2)+name.length()-pointend+sum;

		System.out.println(routeA);
		System.out.println(routeB);

	}
	

}
