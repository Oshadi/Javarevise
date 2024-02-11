package GoldmanSachs;
/*
 * 912. Sort an Array

Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 * 
 * 
 * 
 * 
 * */
import java.util.PriorityQueue;

public class Day_6_Prob_1 {
	public int[] sortArray(int[] nums) {
        int i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.offer(n);
        }
        while(!pq.isEmpty()){
            nums[i++] =pq.poll();
        }
    return nums;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
