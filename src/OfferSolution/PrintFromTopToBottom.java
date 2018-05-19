package Solution;
import java.util.ArrayList;
import java.util.LinkedList;

//import Solution.TreeNode;

public class PrintFromTopToBottom {

	public static ArrayList<Integer> printTree(TreeNode root){
		ArrayList<Integer> arr=new ArrayList<>();
		LinkedList<TreeNode>  lst=new LinkedList<>();
		lst.add(root);
		TreeNode cur=null;
		while(! lst.isEmpty())
		{
			cur=lst.removeFirst();
			arr.add(cur.val);
			if(cur.left !=null)
			   lst.add(cur.left);
			if(cur.right !=null)
			   lst.add(cur.right);
		}
		return arr;
	}
	public static void main(String[] args) {
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
		ArrayList<Integer> arr=new ArrayList<>();
		arr=printTree(node1);
		for(int i=0;i<arr.size();i++)
		{
		 System.out.println(arr.get(i));
		}
	}

}
