package sep_4st;

//System.out.println(Integer.toString(a, 11)); 10진수를 원하는 진수로 숫자를 변경하는 방법
public class n진수게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 1;
		int count =0;
		int j=0;
		String res = "";
		String str = "";
		
		while(str.length()<=t*m+1) {
			str+= Integer.toString(j,n);
			j++;
		}
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			if(i%m==(p-1)) {
				count++;
				res += str.charAt(i)+"";
				if(count == t) {
					break;
				}
					
			}
		}
		res = res.toUpperCase();
		System.out.println(res);

		
	}

}
