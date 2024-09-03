package cote_practice2;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="TRYO HELLOO WORLD";
		String str = "";
		char ch = ' ';
		int swit=0;
		int swit2=1;
		for(int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			if(ch == ' ' && i % 2==0) {
				swit=1;
				swit2=0;
			}else if(ch ==' ' && i%2==1){
				swit=0;
				swit2=1;
			}
			if(ch>='a' && ch <='z' && i % 2 ==swit) {
				ch= (char) (ch- ('a'-'A'));
				str=str+ch;
			} else if(ch>='A' && ch <= 'Z' && i%2==swit2){
				ch= (char) (ch+ ('a'-'A'));
				str=str+ch;
			} else {
				str=str+ch;
			}
			
		}
		System.out.println(str);
		
	}

}
