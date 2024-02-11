package GoldmanSachs;
/*Leet Code
 * 
 * 144. Binary Tree Preorder Traversal

 * Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

 * 
 * 
 * 
 * 
 * */
import java.util.ArrayList;
import java.util.List;

public class Day_5_prob_2 {
	
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
	    public List<Integer> preorderTraversal(TreeNode root) {
	        preOrdeRec(root);
	        return il;
	    }
	    public void preOrdeRec(TreeNode root){
	        if(root==null) return;
	        il.add(root.val);
	        preOrdeRec(root.left);
	        preOrdeRec(root.right);

	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
