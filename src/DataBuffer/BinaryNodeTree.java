package DataBuffer;
class BinaryNode{
	Comparable element;
	BinaryNode left;
	BinaryNode right;
	public BinaryNode(Comparable theElement)
	{
		this(theElement,null,null);
	}
	public BinaryNode(Comparable theElement, BinaryNode lt, BinaryNode rt)
	{
		element=theElement;
		left=lt;
		right=rt;
	}
}
public class BinaryNodeTree {
    public BinaryNodeTree()
    {
    	root=null;
    }
    BinaryNode root;
    public void makeEmpty()
    {
    	root=null;
    }
    public boolean isEmpty()
    {
    	return root==null;
    }
    public Comparable find(Comparable x)
    {
    	return elementAt(find(x,root));
    }
    public Comparable findMin()
    {
    	return elementAt(findMin(root));
    }
    public Comparable findMax()
    {
    	return elementAt(findMax(root));
    }
    public void insert(Comparable x)
    {
    	root=insert(x,root);
    }
    public void delete(Comparable x)
    {
    	root=delete(x,root);
    }
    private BinaryNode find(Comparable x,BinaryNode t)
    {
    	if(t==null)
    	{
    		return null;
    	}
    	if(x.compareTo(t)<0)
    	{
    		return find(x,t.left);
    	}
    	else if(x.compareTo(t)>0)
    	{
    		return find(x,t.right);
    	}
    	else
    		return t;	
    }
    private Comparable elementAt(BinaryNode t)
    {
    	return t==null? null:t.element;
    }
    private BinaryNode findMin(BinaryNode t)
    {
    	if(t==null)
    		return null;
    	else if(t.left==null)
    		return t;
    	return findMin(t.left);
    }
    private BinaryNode findMax(BinaryNode t)
    {
    	if(t==null)
    		return null;
    	else if(t.right==null)
    		return t;
    	return findMax(t.right);
    }
    private BinaryNode insert(Comparable x, BinaryNode t)
    {
    	if(t==null)
    	{
    		t=new BinaryNode(x,null,null);
    	}
    	else if(x.compareTo(t.element)<0)
    	{
    		t.left= insert(x,t.left);
    	}
    	else if(x.compareTo(t.element)>0)
    	{
    		t.right= insert(x,t.right);
    	}
    	else
    		;
    	return t;
    }
    private BinaryNode delete(Comparable x, BinaryNode t)
    {
    	if(t==null)
    	{
    		return t;
    	}
    	if(x.compareTo(t.element)<0)
    	{
    		t.left= delete(x,t.left);
    	}
    	else if(x.compareTo(t.element)>0)
    	{
    		t.right= delete(x,t.right);
    	}
    	else if(t.left !=null && t.right !=null)
    	{
    		BinaryNode s=findMin(t.right);
    		t.element=s.element;
    		t.right=delete(s.element,t.right);
    	}
    	else
    	{
    		t=(t.left!=null)? t.left:t.right;
    	}
    	return t;
    }
    public void print()
    {
    	displayTree(root,1);
    }
    private void displayTree(BinaryNode t, int level) {

//        String preStr = "";     // ´òÓ¡Ç°×º
//        for (int i = 0; i < level; i++) {
//            preStr += "    ";
//        }
        if(t==null)
        {
        	System.out.println("Empty tree");
        }
        if (t.left!=null && t.right!=null) {
        	System.out.println( t.element);
            displayTree(t.left, level + 1);
            displayTree(t.right, level + 1);
        }
        else if (t.right!=null ) {
        	System.out.println( t.element);
            displayTree(t.right, level + 1);
        }
        else if (t.left!=null ) {
        	System.out.println( t.element);
            displayTree(t.left, level + 1);
        }
        else
        System.out.println(t.element);
    }
	public static void main(String[] args) {
      BinaryNodeTree tree=new BinaryNodeTree();
      tree.insert(6);
      tree.insert(2);
      tree.insert(8);
      tree.insert(1);
      tree.insert(4);
      tree.insert(3);
      tree.print();
	}
	

}
