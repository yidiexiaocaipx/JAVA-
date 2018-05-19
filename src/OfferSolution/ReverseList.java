package Solution;
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
public class ReverseList {
   public ListNode ReverseList(ListNode head) {
	   ListNode node=head;
	   ListNode prenode=null;
	   ListNode reverseHead=null;
	   while(node !=null) {
		   ListNode nextNode=node.next;
		   if(node.next==null)
		   {
			   reverseHead=node;
		   }
		   node.next=prenode;
		   prenode=node;
		   node=nextNode;
	   }
	   return reverseHead;
   }
}
