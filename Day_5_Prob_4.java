package GoldmanSachs;
/*Leet code
 * 
 * 102. Binary Tree Level Order Traversal
 * 
 * 
 * 
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day_5_Prob_4 {
	
	 // Definition for a binary tree node.
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
	 
	class Solution {
	    
	    
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> al=new ArrayList<List<Integer>>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        if(root==null){
	            return al;
	        }
	        queue.add(root);
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
	         return al;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
