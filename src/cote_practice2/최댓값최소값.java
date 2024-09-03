package cote_practice2;

public class 최댓값최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1 22 33 4";
		String save;
		int count = 0;
		int findIndex = s.indexOf(" ");
		int tempindex = 0;
		while (findIndex >= 0) {

			count++;
			findIndex = s.indexOf(" ", findIndex + 1);
		}
		int[] value = new int[count + 1];
		findIndex = s.indexOf(" ");
		count = 0;
		tempindex = findIndex;
		value[count] = Integer.parseInt(s.substring(0, findIndex));
		while (findIndex >= 0 && count < s.length() - 1) {

			count++;
			tempindex = findIndex;
			findIndex = s.indexOf(" ", findIndex + 1);
			// System.out.println(findIndex);
			if (findIndex != -1)
				value[count] = Integer.parseInt(s.substring(tempindex + 1, findIndex));
			else
				value[count] = Integer.parseInt(s.substring(tempindex + 1, s.length()));
		}
		int max = value[0];
		int min = value[0];

		for (int i = 0; i < value.length; i++) {

			if(max<value[i]) {
				max= value[i];
			}
			if(min> value[i]) {
				min = value[i];
			}
			
		}
		String answer = min + " "+max;
		

	}

}
