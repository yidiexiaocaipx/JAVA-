package OfferSolution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
public class PrintListFromTailToHead {
   public static ArrayList<Integer> print(ListNode listNode)
   {
	   ArrayList<Integer> arr=new ArrayList<>();
	   LinkedList<Integer> lst=new LinkedList<>();
	   ListNode pNode=listNode;
	   while(pNode !=null)
	   {
		   lst.push(pNode.val);
		   pNode=pNode.next;
	   }
	   while(!lst.isEmpty())
	   {
		   arr.add(lst.pop());		
	   }
	   return arr;	   	   	  
   }
   public static void main(String[] args)
   {
	   ListNode head=new ListNode(1);
	   head.next=new ListNode(2);
	   head.next.next=new ListNode(3);
	   ArrayList arr=print(head);
	   Iterator it=arr.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
   }

}
