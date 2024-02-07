package GoldmanSachs;
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 * 
 * 
 * */
import java.util.Arrays;

public class Day_1_Prob_5 {
	
	public static boolean isAnagram(String s, String t) {
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr,tArr);
    }

	public static void main(String[] args) {
		System.out.println(isAnagram("asdsf","dsasf"));

	}

}
