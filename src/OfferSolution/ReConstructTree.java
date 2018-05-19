package Solution;

import java.util.Arrays;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class ReConstructTree {
	public TreeNode reConstruct(int[] pre, int[] in) {
	if(pre.length==0 || in.length==0 || pre.length !=in.length)
		return null;
    TreeNode root=new TreeNode(pre[0]);
//    tr.left=null;
//    tr.right=null;
    int i=0;
    for(;i<in.length;i++)
    {
    	if(in[i]==pre[0]) break;
    }
    int leftlen=i;
    //Arrays arr=new Arrays();
    root.left=reConstruct(Arrays.copyOfRange(pre, 1, leftlen+1), Arrays.copyOfRange(in, 0, i)) ;
    root.right=reConstruct(Arrays.copyOfRange(pre, leftlen+1, pre.length), Arrays.copyOfRange(in, i+1, in.length)) ;
    return root;
}
}
