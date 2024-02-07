package GoldmanSachs;
/*
 *Problem Statement: Given an array of integers, find the maximum element.
 *Example:
 *Input: [3, 7, 2, 8, 1]
 *Output: 8
*/
public class Day_1_Prob_1 {	
	public static int findMax(int []arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] myArr= {1,5,8,13,25};
		System.out.println(findMax(myArr));;

	}

}
