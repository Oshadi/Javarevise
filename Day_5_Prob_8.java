package GoldmanSachs;
/*Leet Code
 * 
 * 844. Backspace String Compare
 * 
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 * 
 * 
 * 
 * 
 * */
public class Day_5_Prob_8 {
	
	    public boolean backspaceCompare(String s, String t) {
	        char []mys=s.toCharArray();
	        char []myt=t.toCharArray();
	        
	        String ss = word(mys);
	        String ts = word(myt);
	        return ss.equals(ts);
	       
	    }
	    public String word(char [] mys){
	        StringBuilder sb =new StringBuilder();
	        for (int i=0; i<mys.length; i++){
	            if(mys[i]!='#'){
	                sb.append(mys[i]);
	                
	            }else{  
	                if(sb.length()>=1)     {
	                    sb.deleteCharAt(sb.length() - 1);    
	                }        
	                          
	            }
	        }
	        return sb.toString();
	    }
	
}
