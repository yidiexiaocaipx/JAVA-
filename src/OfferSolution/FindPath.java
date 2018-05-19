package Solution;

import java.util.ArrayList;
import java.util.LinkedList;

//class TreeNode{
//	int value;
//	TreeNode left=null;
//	TreeNode right=null;
//	TreeNode(int value){
//		this.value=value;
//	}
//}
public class FindPath {

	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		//ArrayList path=new ArrayList();
		if(root==null) {
			return arr;
		}
		int currentsum=0;
	//	ArrayList path=new ArrayList();
		LinkedList lt=new LinkedList();
		Find(root,target,currentsum,arr,lt);
		return arr;
		
	}
	public static void Find(TreeNode root, int target,int currentsum,ArrayList<ArrayList<Integer>> arr,
			LinkedList lt) {
		ArrayList path=new ArrayList();
		//LinkedList lt=new LinkedList();
		currentsum+=root.val;
	    lt.push(root.val);
	    boolean isLeaf=(root.left==null) && (root.right==null);
	    if(currentsum==target && isLeaf) {
	    	for(int i=lt.size()-1;i>=0;i--) {
	    		path.add(lt.get(i));
	    	}
//	    	while(! lt.isEmpty()) {
//	    		path.add(lt.pop());
//	    	}
	    	arr.add(path);
	    }
	    if(root.left !=null) {
	    	Find(root.left,target,currentsum,arr,lt);
	    }
	    if(root.right !=null) {
	    	Find(root.right,target,currentsum,arr,lt);
	    }
	    currentsum-=root.val;
	    lt.pop();
	    
	    
		
	}
	public static void print(ArrayList<ArrayList<Integer>> arr) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				System.out.print(arr.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		TreeNode node1=new TreeNode(10);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(12);
		TreeNode node4=new TreeNode(4);
//		TreeNode node5=new TreeNode(5);
//		TreeNode node6=new TreeNode(6);
		TreeNode node5=new TreeNode(7);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		
//		node3.left=node6;
//		node4.left=node7;
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		arr=FindPath(node1, 19);
		print(arr);
	}

}
