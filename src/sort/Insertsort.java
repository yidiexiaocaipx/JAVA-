package sort;

public class Insertsort {

	public static void insertsort(int[] a)
	{
		for (int i=1;i<a.length;i++)
		{
			int j=i-1;
			int insertnum=a[i]; //防止a[i]的值改变
			while(j>=0 && a[j]>insertnum)
			{
					a[j+1]=a[j];
					j--;
			}
			a[j+1]=insertnum;
		}
	}
	public static void main(String[] args) {
		int[] a= {2,1,3,5,7,4,8};
		insertsort(a);
		for(int i:a)
			System.out.println(i);

	}

}
