package DataBuffer;

import java.util.ArrayList;
import java.util.LinkedList;

//import OfferSolution.TreeNode;
class TreeNode{
	int val=0;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
	}
}
public class TravelOfBinaryTree {
	public static ArrayList<Integer> preorderIteratively(TreeNode root){
	 ArrayList<Integer>  list=new ArrayList<>();
	 LinkedList<TreeNode> stack=new LinkedList<>();
	 TreeNode cur=root;
	 while(cur !=null || !stack.isEmpty()) {
		 if(cur !=null)
		 {
			 list.add(cur.val);
			 stack.push(cur);
			 cur=cur.left;
		 }
		 else {
			 cur=stack.pop();
			 cur=cur.right;
		 }
	 }
	 return list;
	}
	public static ArrayList<Integer> inorderIteratively(TreeNode root){
		 ArrayList<Integer>  list=new ArrayList<>();
		 LinkedList<TreeNode> stack=new LinkedList<>();
		 TreeNode cur=root;
		 while(cur !=null || !stack.isEmpty()) {
			 if(cur !=null)
			 {
				// list.add(cur.val);
				 stack.push(cur);
				 cur=cur.left;
			 }
			 else {
				 list.add(stack.peek().val);
				 cur=stack.pop();
				 cur=cur.right;
			 }
		 }
		 return list;
		}
	public static ArrayList<Integer> postorderIteratively(TreeNode root){
		 ArrayList<Integer>  list=new ArrayList<>();
		 LinkedList<TreeNode> stack=new LinkedList<>();
		 TreeNode cur=root;
		 TreeNode preNode=null;
		 while(cur !=null || !stack.isEmpty()) {
			 if(cur !=null)
			 {
				 stack.push(cur);
				 cur=cur.left;
			 }
			 else {
				 cur=stack.peek().right;
				 if(cur !=null && cur !=preNode) {
					 stack.push(cur);
					 cur=cur.left;
				 }
				 else {
					 preNode=stack.pop();
					 list.add(preNode.val);
					 cur=null;
				 }
			 }
		 }
		 return list;
		}
	public static ArrayList<Integer> levelorderIteratively(TreeNode root){
		 ArrayList<Integer>  list=new ArrayList<>();
		 LinkedList<TreeNode> stack=new LinkedList<>();
		 TreeNode cur=null;
		// TreeNode preNode=null;
		 stack.add(root);
		// list.add(root.val);
		 while(!stack.isEmpty()) {
			 cur=stack.removeFirst();
			 list.add(cur.val);
			 if(cur.left!=null) {
				 stack.add(cur.left);
			 }
			 if(cur.right!=null) {
				 stack.add(cur.right);
			 }		 
			 
		 }
		 return list;
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node4.left=node7;
		ArrayList<Integer> arr=new ArrayList();
		arr=preorderIteratively(node1);
        for(Integer i:arr) {
        	System.out.print(i.intValue());
        }
        System.out.println();
		ArrayList<Integer> arr1=new ArrayList();
		arr1=inorderIteratively(node1);
        for(Integer i:arr1) {
        	System.out.print(i.intValue()+" ");
        }
        System.out.println();
		ArrayList<Integer> arr2=new ArrayList();
		arr2=postorderIteratively(node1);
        for(Integer i:arr2) {
        	System.out.print(i.intValue()+" ");
        }
		ArrayList<Integer> arr3=new ArrayList();
		arr3=levelorderIteratively(node1);
        for(Integer i:arr3) {
        	System.out.print(i.intValue()+" ");
        }
	}

}
