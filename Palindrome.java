package HackerRank;

import java.util.Scanner;

public class Palindrome {

	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        sc.close();
	        /* Enter your code here. Print output to STDOUT. */
	        StringBuilder str = new StringBuilder();
	        char [] ch = A.toCharArray();
	        for(int i = 0;i<ch.length; i++){
	            str.append(ch[ch.length-i-1]);
	        }
	        if(str.toString().equals(A)){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	        
	    }

}
