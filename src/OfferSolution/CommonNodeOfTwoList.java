package OfferSolution;

import java.util.LinkedList;

//class ListNode{
//	int val;
//	ListNode next;
//	ListNode(int val){
//		this.val=val;
//	}
//}
public class CommonNodeOfTwoList {
   public static ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2) {
	   ListNode node1=pHead1;
	   ListNode node2=pHead2;
	   LinkedList list1=new LinkedList();
	   LinkedList list2=new LinkedList();
	   ListNode node=null;
	   while(node1!=null) {
		    list1.push(node1);
		   node1=node1.next;
		 
		   
	   }
	   while(node2!=null) {
		   list2.push(node2);
		   node2=node2.next;
		   
	   }
	   if(node1 !=node2)
		   return node;
	   while(list1.peek()==list2.peek()) {		   		   
			   node=(ListNode)list1.pop();
			   list2.pop();
	   }
		      
	   return node;
	   
	   
   }
   public static void main(String[] args) {
	 ListNode node1=new ListNode(1);
	 ListNode node2=new ListNode(2);
	 ListNode node3=new ListNode(3);
	 ListNode node4=new ListNode(4);
	 ListNode node5=new ListNode(5);
	 node1.next=node2;
	 node2.next=node3;
	 node3.next=node4;
	 node4.next=node5;
	 ListNode node6=new ListNode(7);
	 ListNode node7=new ListNode(6);
	 ListNode node8=node3;
	 ListNode node9=node4;
	 ListNode node10=node5;
	 node6.next=node7;
	 node7.next=node8;
	 node8.next=node9;
	 node9.next=node10;
	 
	 System.out.println(FindFirstCommonNode(node1,node6).val);
	 
   }
}
