package GoldmanSachs;

public class Day_2_Prob_11 {
	
	  
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	    public int getDecimalValue(ListNode head) {
	        int res =0;
	        while(head!=null){
	            res =res*2;
	            res=res+head.val;
	            head=head.next;
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
