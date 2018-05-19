package one_bitandtwo_bitCharacters;
class Listcode
{
	int val;
	Listcode next;
	Listcode(int val)
	{
		this.val=val;
	}
}
public class Merge_two_lists {

	public static Listcode mergeTwoLists(Listcode l1, Listcode l2)
	{
		Listcode pre;
		if (l1==null)
			return l1;
		else if(l2==null)
			return l2;
		else if(l1.val<=l2.val)
		{
			pre=l1;
			mergeTwoLists(l1.next,l2);
		}
		else 
		{
			pre=l2;
			mergeTwoLists(l1,l2.next);
		}	
		return pre;
		
	}
	
	public static void main(String[] args) {

	}

}
