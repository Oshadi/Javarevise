package GoldmanSachs;

import java.util.Arrays;

/*
 * 4. Median of Two Sorted Arrays
 * 
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 * 
 * 
 * */
public class Day_6_Prob_2 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ar = new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0; i<nums1.length; i++){
            ar[j++]=nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            ar[j++]=nums2[i];
        }
        Arrays.sort(ar);
            if(ar.length %2 ==1){
                return (double) ar[ar.length/2];
            }
            else{
                int a = ar[ar.length/2-1];
                int b = ar[ar.length/2];
                return ((double) a + (double) b) /2.0;
            }

    }
}
