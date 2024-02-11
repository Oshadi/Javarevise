package GoldmanSachs;

import java.util.Stack;

/*Leet code
 * 20. Valid Parentheses
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 * 
 * 
 * */
public class Day_3_Prob_4_Goldman {
	public boolean isValid(String s) {
        Stack <Character> paranthesis = new Stack <> ();       
        if(s.length()<=1){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals ("(")||String.valueOf(s.charAt(i)).equals ("{")||String.valueOf(s.charAt(i)).equals ("[")){
                paranthesis.push(s.charAt(i));
            } else if(String.valueOf(s.charAt(i)).equals (")")||String.valueOf(s.charAt(i)).equals ("}")||String.valueOf(s.charAt(i)).equals ("]")) {               
                if(paranthesis.empty()){
                    return false;
                }else{
                    String top = String.valueOf(paranthesis.peek());                   
                    if(top.equals("(") && String.valueOf(s.charAt(i)).equals (")")){
                        paranthesis.pop();                        
                    }else if(top.equals("{") && String.valueOf(s.charAt(i)).equals ("}")){
                        paranthesis.pop();
                    }else if(top.equals("[") && String.valueOf(s.charAt(i)).equals ("]")){
                        paranthesis.pop();
                    }else{
                        return false;
                    }
                }
            }                  
    }
    if(paranthesis.empty()){
            return true;
        }else{
            return false;
        }
    }

	public static void main(String[] args) {


	}

}
