package cote_practice2;

public class 카펫 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 28;
		int yellow = 36;
		int width =0;
		int height=0;
		int searchBrown =yellow;
		int count =1;
		int total =0;
		while(true) {
			if(yellow % count ==0)
            {
                searchBrown = yellow / count;
			    width = searchBrown +2;
			    height = count;
			    total = (width*2)+(height*2);
			    System.out.println("count : "+count);
			    System.out.println("둘레 : "+total);
			   
			    if(total == brown)
			    	break;
            }
			total=0;
			count++;
			
			
		}
		System.out.println(total);
		int temp =0;
		if(width < height+2) {
			temp = width;
			width = height+2;
			height = temp-2;
		}
		int[] answer = {width, height+2};
		
		
		
	}

}
