package GoldmanSachs;

import java.util.ArrayList;
import java.util.List;
/*Leet Code
 * 
 * 94. Binary Tree Inorder Traversal
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

 * 
 * 
 * */
public class Day_5_Prob_1 {

	
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
	 
	
	    List <Integer> il = new ArrayList<>();
	    public List<Integer> inorderTraversal(TreeNode root) {
	        inOrderRec(root);
	        return il;       
	    }
	    private void inOrderRec(TreeNode root){
	        if(root==null) return;
	            inOrderRec(root.left);
	            il.add(root.val);
	            inOrderRec(root.right);
	        
	    }
	

}
