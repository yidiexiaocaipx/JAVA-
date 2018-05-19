package one_bitandtwo_bitCharacters;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static Object[] removeduplicates(int[] a)
    {
//    	int i=0;
//    	for(int n:a)
//    	{
//    		if (i==0 || n>a[i-1])
//    		{
//    			a[i++]=n;
//    		}
//    	}
//    	return i;
    	List s=new ArrayList();
    	for(int n:a)
    	{
    		if(! s.contains(n))
    		{
    			s.add(n);
    		}
    	}
    	Object[] array=s.toArray();
    	return array;
    	
    }
	public static void main(String[] args) {
			int[] a= {1,1,2,3,3,5};
			Object[] array=removeduplicates(a);
//			System.out.println(i);
			for(Object n:array)
			{
				System.out.println(n);
			}
			System.out.println(array.length);
	}

}
