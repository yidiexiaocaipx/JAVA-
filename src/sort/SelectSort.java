package sort;

public class SelectSort {
	public static void selectsort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int key=a[i];
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<key)
				{
					key=a[j];
				    index=j;
				}
			}
			a[index]=a[i];
			a[i]=key;			
		}
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,5,7,4,8};
		selectsort(a);
		for(int i:a)
			System.out.println(i);
	}

}
