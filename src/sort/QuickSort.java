package sort;

public class QuickSort {

	public static void quicksort(int[] s, int start,int end)
	{
//		int temp=s[start];
//		for(int i=start; i<)
		if(start>=end)  return;
		int j=partition(s, start, end);
		quicksort(s, start,j-1);
		quicksort(s,j+1,end);
	}
	public static int partition(int[] s, int start, int end)
	{
		int base=s[start];
		int i=start;
		int j=end+1;
		while(true)
		{
			while(s[++i]<=base) if(i==end) break;
			while(s[--j]>=base) if(j==start) break;
			if(i>=j) break;
			exch(s,i,j);
		}
		exch(s,start,j);
		return j;
		
	}
	private static void exch(int[] s, int a,int b)
	{

		int temp=s[a];
		s[a]=s[b];
		s[b]=temp;
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,4,3,7,6,5};
		int N=a.length-1;
		quicksort(a,0,N);
		for(int i:a)
			System.out.println(i);

	}

}
