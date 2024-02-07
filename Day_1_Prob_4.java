package GoldmanSachs;

import java.util.Arrays;

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 * */
public class Day_1_Prob_4 {
	public static char[] reverseString(char[] s) {
        int first=0;
        int last =s.length-1;

        while(first<last){
            char temp = s[first];
            s[first]=s[last];
            s[last]=temp;
            first++;
            last --;
        }
        return s;
    }
	public static void main(String[] args) {
		char [] s = {'H','a','n','n','a','h'};
		System.out.println(Arrays.toString(reverseString(s)));

	}

}
