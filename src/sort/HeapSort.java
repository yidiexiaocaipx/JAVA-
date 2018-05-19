package sort;

public class HeapSort {
	public static void heapsort(int[] a)
	{
		int N=a.length;
		for(int k=N/2;k>=1;k--)
		{
			sink(a,k,N);
		}
		while(N>1)
		{
			exch(a,0,--N);
			sink(a,1,N);
		}
	}
	private static void sink(int[] s, int k,int N)
	{
		while(2*k<=N)
		{
			int j=2*k;
			if(j<N && s[j-1]<s[j]) j++;
			if(s[k-1]>s[j-1]) break;
			exch(s,k-1,j-1);
			k=j;
		}
	}
	private static void exch(int[] s, int a,int b)
	{

		int temp=s[a];
		s[a]=s[b];
		s[b]=temp;
	}
	public static void main(String[] args) {
		int[] a= {500,300,200,400,450,280,110};
		heapsort(a);
		for(int i:a)
			System.out.println(i);
		
	}

}
