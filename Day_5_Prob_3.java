package GoldmanSachs;

import java.util.ArrayList;
import java.util.List;
/* Leet Code
 * 145. Binary Tree Postorder Traversal
 * 
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 * 
 * 
 * */
public class Day_5_Prob_3 {
	
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
	    List<Integer> il = new ArrayList<Integer>();
	    public List<Integer> postorderTraversal(TreeNode root) {
	        postOrderRec(root);
	        return il;
	    }
	    public void postOrderRec(TreeNode root){
	        if(root==null)return;
	        postOrderRec(root.left);
	        postOrderRec(root.right);
	        il.add(root.val);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
