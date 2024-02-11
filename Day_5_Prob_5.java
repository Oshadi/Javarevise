package GoldmanSachs;
/*Leet Code
 * 103. Binary Tree Zigzag Level Order Traversal
 * 
 * 
 * 
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []

 * 
 * 
 * */
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Day_5_Prob_5 {
	
	//  Definition for a binary tree node.
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
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        TreeNode p=null;
	        List<List<Integer>> al=new ArrayList<List<Integer>>();
	        //Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        Deque<TreeNode> queue =new LinkedList<>();
	        if(root==null){
	            return al;
	        }
	        int l =0;
	        queue.add(root);
	        List<Integer> subLvls = new ArrayList<>();
	         while(!queue.isEmpty()){
	        if(l%2==0){
	            int levels = queue.size();
	            
	            for(int i=0; i<levels; i++){
	                p=queue.getFirst();
	                subLvls.add(p.val);
	                queue.removeFirst();

	                if(p.left!=null){
	                    queue.addLast(p.left);
	                }
	                if(p.right!=null){
	                    queue.addLast(p.right);
	                }                               
	            }           
	       }else{
	            int levels = queue.size();
	            
	            for(int i=0; i<levels; i++){
	                p=queue.getLast();
	                subLvls.add(p.val);
	                queue.removeLast();

	                if(p.right!=null){
	                    queue.addFirst(p.right);
	                }
	                if(p.left!=null){
	                    queue.addFirst(p.left);
	                }                               
	            } 
	            
	        }
	        al.add(subLvls);
	        subLvls=new ArrayList<>();
	        l=l+1;
	           
	         }
	         return al;       
	    }
	}
}
