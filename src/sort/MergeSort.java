package sort;

public class MergeSort {

	private static int[] aux;
	public static void Sort(int[] a) {
		aux=new int[a.length];
		mergeSort(a,0,a.length-1);
	}
	public static void mergeSort(int[] a, int low,int high) {
		//aux=new int[a.length];
		if(high<=low) return;
		int mid=low+(high-low)/2;
		mergeSort(a,low,mid);
		mergeSort(a,mid+1,high);
		merge(a,low,mid,high);
	}
	public static void merge(int[] a,int low,int mid,int high) {
		int i=low;int j=mid+1;
		for(int k=low;k<=high;k++) {
			aux[k]=a[k];
		}
		for(int k=low;k<=high;k++) {
			if(i>mid)  a[k]=aux[j++];
			else if(j>high) a[k]=aux[i++];
			else if(less(aux[i],aux[j])) a[k]=aux[i++];
			else a[k]=aux[j++];
//			if(less(aux[i],aux[j])) a[k]=aux[i++];
//			else if(i>mid)  a[k]=aux[j++];
//			else if(j>high) a[k]=aux[i++];
//			else a[k]=aux[j++];
		}
	}
	public static boolean less(int v,int m) {
		return v<m;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,5,7,4,8};
		//aux=new int[a.length];
		Sort(a);
		for(int i:a)
			System.out.print(i);
	}

}
