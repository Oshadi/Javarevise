package GoldmanSachs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Leet Code
 * 
 * 107. Binary Tree Level Order Traversal II

 * Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 * 
 * 
 * 
 * */
  

public class Day_5_Prob_6 {
	//Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 

	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> al=new ArrayList<List<Integer>>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        if(root==null){
	            
	            return al;
	        }
	        queue.add(root);
	        System.out.print(root.val);
	         while(!queue.isEmpty()){
	           int levels = queue.size();
	           List<Integer> subLvls = new ArrayList<>();
	            for(int i=0; i<levels; i++){
	                if(queue.peek().left!=null){
	                    queue.add(queue.peek().left);
	                }
	                if(queue.peek().right!=null){
	                    queue.add(queue.peek().right);
	                }
	                subLvls.add(queue.remove().val);
	            }
	            al.add(subLvls);
	         }
	         Collections.reverse(al);
	         return al;
	    }
}
