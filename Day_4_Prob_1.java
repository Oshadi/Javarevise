package GoldmanSachs;
/*Leet Code
 * 387. First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 * 
 * 
 * */
import java.util.HashMap;

public class Day_4_Prob_1 {
	public int firstUniqChar(String s) {
        HashMap <Character,Integer> hm = new HashMap <>();
        for(int i=0;i<s.length();i++){
            char cha =s.charAt(i);
            hm.put(cha, hm.getOrDefault(cha,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char cha =s.charAt(i);
            if(hm.get(cha)==1){
                return i;
            }
        }
        return -1;
    }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
