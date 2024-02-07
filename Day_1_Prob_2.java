package GoldmanSachs;

/*
 * Problem Statement: Given a string, reverse it.
 *Example:
 *Input: "hello"
 *Output: "olleh"
*/
public class Day_1_Prob_2 {

	public static String reverseStr(String str) {
		char [] charArr= str.toCharArray();
		int left= 0;
		int right = charArr.length-1;
		
			while(left<right) {
				char temp = charArr[left];
				charArr[left]= charArr[right];
				charArr[right]=temp;
				left++;
				right--;			
			}
			return new String(charArr);
	}
	public static void main(String[] args) {
		System.out.println(reverseStr("asdba"));

	}

}
