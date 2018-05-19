package one_bitandtwo_bitCharacters;

public class RemoveElement {
	public static int removeElement(int[] num, int val)
	{
		int i=0;
		for(int n:num)
		{
			if(n!=val)
			{
				num[i++]=n;
			}
		}
		return i;
	}

	public static void main(String[] args) {
       int[] a= {3,2,2,3};
       int i=removeElement(a,3);
       System.out.println(i);
	}
}
