package GoldmanSachs;

public class Day_2_Prob_13 {
	
	 
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode curr = head;
	        ListNode next = null;
	        while(curr!=null){
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	        }
	        head = prev;
	        return head;

	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
