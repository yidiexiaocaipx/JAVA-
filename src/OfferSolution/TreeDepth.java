package Solution;
//class TreeNode{
//	int val=0;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(){
//		this.val=val;
//	}
//}
public class TreeDepth {
public static int TreeDepth(TreeNode root) {
	if(root==null) {	
		return 0;
	}
	int leftDepth=TreeDepth(root.left);
	int rightDepth=TreeDepth(root.right);
	return leftDepth>rightDepth ? (leftDepth+1):(rightDepth+1);
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
	System.out.println(TreeDepth(node1));
}
}
